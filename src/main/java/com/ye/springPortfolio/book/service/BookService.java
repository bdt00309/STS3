package com.ye.springPortfolio.book.service;

import java.util.List;

import com.ye.springPortfolio.book.model.dto.BookDTO;

public interface BookService {

	public List<BookDTO> getSelectAll();
	public BookDTO getSelectOne(BookDTO paramDto);
	public int setInsert(BookDTO paramDto);
	public int setUpdate(BookDTO paramDto);
	public int setDelete(BookDTO paramDto);

	
	//페이징, 검색, 로그인 부분도 나중에 추가하기
}
