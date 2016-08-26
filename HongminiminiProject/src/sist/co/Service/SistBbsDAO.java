package sist.co.Service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sist.co.Model.SistBbsParam;
import sist.co.Model.SistBbsVO;

@Repository
public class SistBbsDAO {

	@Autowired
	private SqlSession sqlSession;
	private String ns = "SistBbs.";
	
	public List<SistBbsVO> getBbsList() throws Exception {
		List<SistBbsVO> list = new ArrayList<SistBbsVO>();
		
		list = sqlSession.selectList(ns+"getBbsList");
		
		return list;
	}
}
