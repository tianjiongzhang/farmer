package com.farmer.baton.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.farmer.baton.model.Benefactor;
import com.farmer.baton.repo.BenefactorRepository;

@Controller
@RequestMapping("/benefactor")
public class BanefactorController {
	
	private static final Log log = LogFactory.getLog(FarmerController.class);

	@Autowired
	private BenefactorRepository rep ;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public 
	@ResponseBody
	String addBenefactor(@RequestBody Benefactor benefactor){
		rep.save(benefactor) ;
		return "success" ;
	}
	
}
