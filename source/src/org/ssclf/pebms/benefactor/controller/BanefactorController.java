package org.ssclf.pebms.benefactor.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.ssclf.pebms.benefactor.model.Benefactor;
import org.ssclf.pebms.benefactor.model.PagedResult;
import org.ssclf.pebms.benefactor.repository.IBenfactorRepsitory;



@Controller
@RequestMapping("/benefactor")
public class BanefactorController {
	
	private static final Log log = LogFactory.getLog(BanefactorController.class);

	@Autowired
	private IBenfactorRepsitory beneRep ;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public 
	@ResponseBody
	String addBenefactor(@RequestBody Benefactor benefactor){
		beneRep.persist(benefactor) ;
		return "success" ;
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public 
	@ResponseBody
	String modifyBenefactor(@RequestBody Benefactor benefactor){
		beneRep.merge(benefactor) ;
		return "success" ;
	}
	
	@RequestMapping(value = "/seachById", method = RequestMethod.POST)
	public 
	@ResponseBody
	Benefactor searchBenefactor(@RequestBody Long id){
		Benefactor benefactor = beneRep.findById(Benefactor.class, id) ;
		return benefactor ;
	}
	
	
	@RequestMapping(value = "/seachAll" , method = RequestMethod.POST)
	public @ResponseBody PagedResult searchBenefactors(@RequestParam("pageNo") int pageNo){
		return beneRep.queryPagedBenefactors(pageNo) ;
	}
	
	@RequestMapping(value = "/delete" , method = RequestMethod.POST)
	public @ResponseBody String deleteBenefactor(@RequestParam("id") long id){
		beneRep.deleteBenefactor(id);
		return "success"  ;
	}
}
