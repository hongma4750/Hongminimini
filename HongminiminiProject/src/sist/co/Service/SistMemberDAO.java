package sist.co.Service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sist.co.Model.SistMemberVO;

@Repository
public class SistMemberDAO {

	@Autowired	//DI
	private SqlSession sqlSession;		
	
	private String ns = "SistMember.";
	
	
	public SistMemberVO login(SistMemberVO member) throws Exception{
		return (SistMemberVO) sqlSession.selectOne(ns+"login", member);
	}
}
