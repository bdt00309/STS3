package com.ye.springPortfolio.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ye.springPortfolio.member.model.dao.MemberDAO;
import com.ye.springPortfolio.member.model.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAO memberDao;
	
	@Override
	public List<MemberDTO> getSelectAll() {
		return memberDao.getSelectAll();
	}

	@Override
	public MemberDTO getSelectOne(MemberDTO paramDto) {
		return memberDao.getSelectOne(paramDto);
	}

	@Override
	public int setInsert(MemberDTO paramDto) {
		return memberDao.setInsert(paramDto);
	}

	@Override
	public int setUpdate(MemberDTO paramDto) {
		return memberDao.setUpdate(paramDto);
	}

	@Override
	public int setDelete(MemberDTO paramDto) {
		return memberDao.setDelete(paramDto);
	}

}
