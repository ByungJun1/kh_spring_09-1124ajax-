package com.mycompany.myapp09.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("memberDao")
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public int idCheck(String id)throws Exception{
		System.out.println("id: "+id);
		return sqlSessionTemplate.selectOne("MemberMapper.idCheck", id);
	}
}
