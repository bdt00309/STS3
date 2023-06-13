package com.ye.springPortfolio.book.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ye.springPortfolio.book.model.dao.BookDAO;
import com.ye.springPortfolio.book.model.dto.BookDTO;

@Service
public class BookServiceImpl implements BookService {

	@Inject
	BookDAO bookDao;
	
	@Override
	public List<BookDTO> getSelectAll() {
		return bookDao.getSelectAll();
	}

	@Override
	public BookDTO getSelectOne(BookDTO paramDto) {
		return bookDao.getSelectOne(paramDto);
	}

	@Override
	public int setInsert(BookDTO paramDto) {
		return bookDao.setInsert(paramDto);
	}

	@Override
	public int setUpdate(BookDTO paramDto) {
		return bookDao.setUpdate(paramDto);
	}

	@Override
	public int setDelete(BookDTO paramDto) {
		return bookDao.setDelete(paramDto);
	}

}
