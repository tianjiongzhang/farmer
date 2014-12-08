package org.ssclf.pebms.farmer.service;

import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssclf.pebms.farmer.model.Farmer;
import org.ssclf.pebms.farmer.repository.IFarmerRepository;

@Service
public class FarmerService implements IFarmerService{
	private final static Log logger = LogFactory.getLog(FarmerService.class);
	@Autowired
	private IFarmerRepository famerRepository;
	public void saveFarmer(Farmer farmer) {
			famerRepository.saveFarmer(farmer);	
	}
	public Farmer findFarmerById(long id) {
		// TODO Auto-generated method stub
		return famerRepository.findFarmerById(id);
	}
	public void updateFarmer(Farmer farmer) {
		famerRepository.updateFarmer(farmer);
		
	}

}
