package com.ye.springPortfolio._home.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping({"", "/", "/home/index"})
	public String home(
			Model model,
			HttpServletRequest request
			) {
		String path = request.getContextPath();
		String uri = request.getRequestURI().toString();
	
///================================================	본문주소 구분됨	
		//uri: /springPortfolio/ 일때는 
		
		String imsi = uri.replace(path+"/", ""); // home/index ;슬래시 위치찾기, 인덱스오브& 라스트인덱스오브로 비교해서
		
		String folderName = "";
		String fileName = "";
		
		if(imsi.equals("")) {
			folderName = "home";
			fileName = "index";
		} else {
			folderName = imsi.split("/")[0];
			fileName = imsi.split("/")[1];
		}
		
		//String includeInfo = folderName + "/" + fileName;
		
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", fileName);
		return "main/main";
	}
}
