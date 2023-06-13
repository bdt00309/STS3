package com.ye.springPortfolio.book.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ye.springPortfolio.book.model.dto.BookDTO;
import com.ye.springPortfolio.book.service.BookService;
import com.ye.springPortfolio.member.service.MemberService;
import com.ye.springPortfolio._common.Util;
import com.ye.springPortfolio.book.model.dao.BookDAO;

@Controller
@RequestMapping("/book")
public class BookController {

	@Inject
	BookService bookService;
	
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
		
	
		List<BookDTO> list = bookService.getSelectAll();
		model.addAttribute("list", list);
		
		return "main/main";
	}
	
	@RequestMapping("/view")
	public String view(
			Model model,
			HttpServletRequest request,
			@ModelAttribute BookDTO arguDto
		) {
		String[] array = topInfo(request);
		model.addAttribute("folderName", array[1]);
		model.addAttribute("fileName", array[2]);
		
		BookDTO resultDto  = bookService.getSelectOne(arguDto);
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
			@ModelAttribute BookDTO arguDto
			) {
		
		int result = bookService.setInsert(arguDto);
			
		String returnUrl = "/book/chuga";
		if(result > 0) {
			returnUrl = "/book/list";
		}
		return "redirect:" + returnUrl;
	}
	
	@RequestMapping("/sujung")
	public String sujung(
			Model model,
			HttpServletRequest request,
			@ModelAttribute BookDTO arguDto
		) {
		String[] array = topInfo(request);
		model.addAttribute("folderName", array[1]);
		model.addAttribute("fileName", array[2]);
		
		BookDTO resultDto = bookService.getSelectOne(arguDto);
		model.addAttribute("resultDto", resultDto);
		return "main/main";
	}
	
	
	@RequestMapping("/sujungProc")
	public String sujungProc(
	  	@ModelAttribute BookDTO arguDto
	 
		) {
		int result = bookService.setUpdate(arguDto);
		
		String returnUrl = "/book/sujung?bookNo=" + arguDto.getBookNo();
		if(result > 0) {
			returnUrl = "/book/view?bookNo=" + arguDto.getBookNo();
		}
		return "redirect:" + returnUrl;
	}
	
	
	@RequestMapping("/sakje")
	public String sakje(
			Model model,
			HttpServletRequest request,
			@ModelAttribute BookDTO arguDto
		) {
		String[] array = topInfo(request);
		model.addAttribute("folderName", array[1]);
		model.addAttribute("fileName", array[2]);
		
		BookDTO resultDto = bookService.getSelectOne(arguDto);
		model.addAttribute("resultDto", resultDto);
		return "main/main";
	}
	
	
	
	@RequestMapping("/sakjeProc")
	public String sakjeProc(
	  	@ModelAttribute BookDTO arguDto
		) {
		int result = bookService.setDelete(arguDto);
		
		String returnUrl = "/book/sakje?bookNo=" + arguDto.getBookNo();
		if(result > 0) {
			returnUrl = "/book/list";
		}
		return "redirect:" + returnUrl;
	}
	
	
}
