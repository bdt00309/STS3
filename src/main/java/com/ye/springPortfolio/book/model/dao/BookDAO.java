package com.ye.springPortfolio.book.model.dao;

import java.util.List;

import com.ye.springPortfolio.book.model.dto.BookDTO;

public interface BookDAO {

	public List<BookDTO> getSelectAll();
	public BookDTO getSelectOne(BookDTO paramDto);
	public int setInsert(BookDTO paramDto);
	public int setUpdate(BookDTO paramDto);
	public int setDelete(BookDTO paramDto);
}
