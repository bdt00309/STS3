package com.ye.springPortfolio.member.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ye.springPortfolio.member.model.dto.MemberDTO;

@Repository // <-저장소역할을 한다.
public class MemberDAOImpl implements MemberDAO {

	String tableName = "member";
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<MemberDTO> getSelectAll() {
		Map<String, Object> map = new HashMap<>();
		map.put("tableName", tableName);
		return sqlSession.selectList("member.getSelectAll", map);
	}

	@Override
	public MemberDTO getSelectOne(MemberDTO paramDto) {
		Map<String, Object> map = new HashMap<>();
		map.put("dto", paramDto);
		map.put("tableName", tableName);
		
		return sqlSession.selectOne("member.getSelectOne", map);
	}

	@Override
	public int setInsert(MemberDTO paramDto) {
		Map<String, Object> map = new HashMap<>();
		map.put("dto", paramDto);
		map.put("tableName", tableName);
		
		return sqlSession.insert("member.setInsert", map);
	}

	@Override
	public int setUpdate(MemberDTO paramDto) {
		Map<String, Object> map = new HashMap<>();
		map.put("dto", paramDto);
		map.put("tableName", tableName);
		
		return sqlSession.update("member.setUpdate", map);
	}

	@Override
	public int setDelete(MemberDTO paramDto) {
		Map<String, Object> map = new HashMap<>();
		map.put("dto", paramDto);
		map.put("tableName", tableName);
		
		return sqlSession.delete("member.setDelete", map);
	}

}
