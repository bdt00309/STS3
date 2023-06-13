package com.ye.springPortfolio.member.service;

import java.util.List;

import com.ye.springPortfolio.member.model.dto.MemberDTO;

public interface MemberService {

	public List<MemberDTO> getSelectAll();
	public MemberDTO getSelectOne(MemberDTO paramDto);
	public int setInsert(MemberDTO paramDto);
	public int setUpdate(MemberDTO paramDto);
	public int setDelete(MemberDTO paramDto);

	
	//페이징, 검색, 로그인 부분도 나중에 추가하기
}
