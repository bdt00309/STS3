package com.ye.springPortfolio.memo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ye.springPortfolio._common.Util;

@Controller
@RequestMapping("/memo")
public class MemoController {

	private String[] topInfo(HttpServletRequest request) {
		Util util = new Util();
		String[] array = util.getTopInfo(request);  // 공통모듈클래스 만들어서
			
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
		
		return "main/main";
	}
	
	@RequestMapping("/view")
	public String view(
			Model model,
			HttpServletRequest request
			) {
		String[] array = topInfo(request);
		model.addAttribute("folderName", array[1]);
		model.addAttribute("fileName", array[2]);
		
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
	
	@RequestMapping("/sujung")
	public String sujung(
			Model model,
			HttpServletRequest request
			) {
		String[] array = topInfo(request);
		model.addAttribute("folderName", array[1]);
		model.addAttribute("fileName", array[2]);
		
		return "main/main";
	}
	
	@RequestMapping("/sakje")
	public String sakje(
			Model model,
			HttpServletRequest request
			) {
		String[] array = topInfo(request);
		model.addAttribute("folderName", array[1]);
		model.addAttribute("fileName", array[2]);
		
		return "main/main";
	}
	
	
}
