package com.ye.springPortfolio.member.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ye.springPortfolio._common.Util;
import com.ye.springPortfolio.member.model.dto.MemberDTO;
import com.ye.springPortfolio.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Inject
	MemberService memberService;
	
	private String[] topInfo(HttpServletRequest request) {
		Util util = new Util();
		String[] array = util.getTopInfo(request);  // 공통모듈 만들어서
			
		return array;
	}
		
	
	@RequestMapping("/list")
	public String list(
			Model model,
			HttpServletRequest request
			) {
		
		String[] array = topInfo(request);
		model.addAttribute("folderName", array[1]);
		model.addAttribute("fileName", array[2]);
		
		
		List<MemberDTO> list = memberService.getSelectAll();
		model.addAttribute("list", list);
		
		return "main/main";
	}
	
	@RequestMapping("/view")
	public String view(
			Model model,
			HttpServletRequest request,
			@ModelAttribute MemberDTO arguDto   //@ModelAttribute는 get, post방식으로든 모두 값을 받을 수 있다.
			) {
		
		String[] array = topInfo(request);
		model.addAttribute("folderName", array[1]);
		model.addAttribute("fileName", array[2]);
		
		MemberDTO resultDto = memberService.getSelectOne(arguDto);
		model.addAttribute("resultDto", resultDto);
		return "main/main";
	}
	
	@RequestMapping("/chuga")
	public String chuga(
			Model model,
			HttpServletRequest request
			) {
		
		String[] array = topInfo(request);
		model.addAttribute("folderName", array[1]);
		model.addAttribute("fileName", array[2]);
		return "main/main";
	}
	
	@RequestMapping("/chugaProc")
	public String chugaProc(
			@ModelAttribute MemberDTO arguDto
			) {
		String jumin1 = arguDto.getJumin1();
		String jumin2 = arguDto.getJumin2();
		arguDto.setJumin(jumin1 + "-" +jumin2);
		
		int result = memberService.setInsert(arguDto);
		
		String returnUrl = "/member/chuga";
		if(result > 0) {
			returnUrl = "/member/list";
		}
		return "redirect:" + returnUrl; //무조건 redirect사용해서 페이지 이동
	}
	
	@RequestMapping("/sujung")
	public String sujung(
			Model model,
			HttpServletRequest request,
			@ModelAttribute MemberDTO arguDto
			) {
		String[] array = topInfo(request);
		model.addAttribute("folderName", array[1]);
		model.addAttribute("fileName", array[2]);
		
		MemberDTO resultDto = memberService.getSelectOne(arguDto);
		model.addAttribute("resultDto", resultDto);
		return "main/main";
	}
	
	@RequestMapping("/sujungProc")
	public String sujungProc(
			@ModelAttribute MemberDTO arguDto
			) {

		int result = memberService.setUpdate(arguDto);
		
		String returnUrl = "/member/sujung?no=" + arguDto.getNo();
		if(result > 0) {
			returnUrl = "/member/view?no=" + arguDto.getNo();
		}
		return "redirect:" + returnUrl; //무조건 redirect사용해서 페이지 이동
	}
	
	@RequestMapping("/sakje")
	public String sakje(
			Model model,
			HttpServletRequest request,
			@ModelAttribute MemberDTO arguDto
			) {
		String[] array = topInfo(request);
		model.addAttribute("folderName", array[1]);
		model.addAttribute("fileName", array[2]);
		
		MemberDTO resultDto = memberService.getSelectOne(arguDto);
		model.addAttribute("resultDto", resultDto);
		return "main/main";
	}
	
	@RequestMapping("/sakjeProc")
	public String sakjeProc(
			@ModelAttribute MemberDTO arguDto
			) {

		int result = memberService.setDelete(arguDto);
		
		String returnUrl = "/member/sakje?no=" + arguDto.getNo();
		if(result > 0) {
			returnUrl = "/member/list";
		}
		return "redirect:" + returnUrl; 
	}
	
	
}
