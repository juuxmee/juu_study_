package com.company.project.Controller;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.project.Dto.BbsDto;
import com.company.project.Service.BbsServiceImpl;

@Controller
public class BbsController {
	
	private static final Logger logger = LoggerFactory.getLogger(BbsController.class);
	
	//@Resource(name="BbsServiceImpl")
	@Autowired
	private BbsServiceImpl bbsService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		List<BbsDto> result = bbsService.selectlistService();
		model.addAttribute("result",result);
		return "home";
	}
	
}
