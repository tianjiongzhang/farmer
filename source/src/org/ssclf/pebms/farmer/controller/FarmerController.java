package org.ssclf.pebms.farmer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ssclf.pebms.base.controller.BaseController;
import org.ssclf.pebms.farmer.model.Farmer;
import org.ssclf.pebms.farmer.service.IFarmerService;

@Controller
public class FarmerController extends BaseController {
	@Autowired
	private IFarmerService farmerService;

	@Autowired
	public FarmerController(Validator validator) {
		super(validator);
	}

	@RequestMapping(value = "/farmer/add", method = RequestMethod.POST)
	public @ResponseBody
	String addFarmer(@RequestBody
	Farmer farmer) {
		farmerService.saveFarmer(farmer);
		return "sucess";

	}

	@RequestMapping(value = "/farmer/findByID", method = RequestMethod.POST)
	public @ResponseBody
	Farmer modifyBenefactor(@RequestBody
	long id) {
		return farmerService.findFarmerById(id);
	}

	@RequestMapping(value = "/farmer/update", method = RequestMethod.POST)
	public @ResponseBody
	String modifyBenefactor(@RequestBody
	Farmer farmer) {
		farmerService.updateFarmer(farmer);
		return "sucess";
	}

}
