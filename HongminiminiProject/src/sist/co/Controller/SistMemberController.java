package sist.co.Controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sist.co.Model.SistMemberVO;
import sist.co.Model.YesMember;
import sist.co.Service.SistMemberService;


@Controller
public class SistMemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(SistMemberController.class);
	
	@Autowired
	private SistMemberService sistMemberService;

	@RequestMapping(value="login.do", method=RequestMethod.GET)
	public String login(Model model){
		logger.info("환영합니다 login.do로 이동중" + new Date());
		return "login.tiles";
	}
}
