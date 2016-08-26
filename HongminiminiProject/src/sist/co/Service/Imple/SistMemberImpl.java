package sist.co.Service.Imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sist.co.Model.SistMemberVO;
import sist.co.Service.SistMemberDAO;
import sist.co.Service.SistMemberService;




@Service
public class SistMemberImpl implements SistMemberService{

	@Autowired 
	private SistMemberDAO sistMemberDAO;

	
	@Override
	@Transactional(readOnly=true)		//읽기 전용 세팅			@Transactional	--> 수정 가능 세팅
	public SistMemberVO login(SistMemberVO member) throws Exception {
		return sistMemberDAO.login(member);
	}

	
}
