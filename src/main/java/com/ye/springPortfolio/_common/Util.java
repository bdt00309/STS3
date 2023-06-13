package com.ye.springPortfolio._common;

import javax.servlet.http.HttpServletRequest;

public class Util {

	public String[] getTopInfo(HttpServletRequest request) {
		String path = request.getContextPath();
		String uri = request.getRequestURI().toString();
		
		String imsi = uri.replace(path+"/", "");
		String folderName = imsi.split("/")[0];
		String fileName = imsi.split("/")[1];
		
		String[] array = new String[3];
		array[0] = path;
		array[1] = folderName;
		array[2] = fileName;
		
		return array;
	}
}
