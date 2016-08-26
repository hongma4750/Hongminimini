package sist.co.Controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sist.co.Model.SistBbsParam;
import sist.co.Model.SistBbsVO;
import sist.co.Service.SistBbsService;




@Controller
public class SistBbsController {

	private static final Logger logger = LoggerFactory.getLogger(SistBbsController.class);
	
	@Autowired
	private SistBbsService sistBbsService;
	
	
	
}
