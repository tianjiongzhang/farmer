package org.ssclf.pebms.farmer.repository;

import java.sql.SQLException;

import org.ssclf.pebms.farmer.model.Farmer;

public interface IFarmerRepository {
	public void saveFarmer(Farmer farmer);
	public Farmer findFarmerById(long id);
	public void updateFarmer(Farmer farmer);
}
