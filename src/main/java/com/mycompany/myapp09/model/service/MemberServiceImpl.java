package com.mycompany.myapp09.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp09.model.dao.MemberDAO;
import com.mycompany.myapp09.model.vo.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
	@Autowired
	public MemberDAO mDao;
	
	@Override
	public int idCheck(String id)throws Exception{
		return mDao.idCheck(id);
	}
}
