package org.ssclf.pebms.farmer.service;

import org.ssclf.pebms.farmer.model.Farmer;

public interface IFarmerService {
	public void saveFarmer(Farmer farmer);

	public Farmer findFarmerById(long id);

	public void updateFarmer(Farmer farmer);

}
