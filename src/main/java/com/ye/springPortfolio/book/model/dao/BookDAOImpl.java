package com.ye.springPortfolio.book.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ye.springPortfolio.book.model.dto.BookDTO;


@Repository // <-저장소역할을 한다.
public class BookDAOImpl implements BookDAO {

	String tableName = "book";
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<BookDTO> getSelectAll() {
		Map<String, Object> map = new HashMap<>();
		map.put("tableName", tableName);
		return sqlSession.selectList("book.getSelectAll", map);
	}

	@Override
	public BookDTO getSelectOne(BookDTO paramDto) {
		Map<String, Object> map = new HashMap<>();
		map.put("dto", paramDto);
		map.put("tableName", tableName);
		
		return sqlSession.selectOne("book.getSelectOne", map);
	}

	@Override
	public int setInsert(BookDTO paramDto) {
		Map<String, Object> map = new HashMap<>();
		map.put("dto", paramDto);
		map.put("tableName", tableName);
		
		return sqlSession.insert("book.setInsert", map);
	}

	@Override
	public int setUpdate(BookDTO paramDto) {
		Map<String, Object> map = new HashMap<>();
		map.put("dto", paramDto);
		map.put("tableName", tableName);
		
		return sqlSession.update("book.setUpdate", map);
	}

	@Override
	public int setDelete(BookDTO paramDto) {
		Map<String, Object> map = new HashMap<>();
		map.put("dto", paramDto);
		map.put("tableName", tableName);
		
		return sqlSession.delete("book.setDelete", map);
	}

}
