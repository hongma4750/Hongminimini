package sist.co.Service.Imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sist.co.Model.SistBbsParam;
import sist.co.Model.SistBbsVO;
import sist.co.Service.SistBbsDAO;
import sist.co.Service.SistBbsService;


@Service
public class SistBbsImpl implements SistBbsService{

	@Autowired
	private SistBbsDAO sistBbsDAO;
	
	@Override
	@Transactional(readOnly=true)
	public List<SistBbsVO> getBbsList() throws Exception {
		return sistBbsDAO.getBbsList();
	}


}
