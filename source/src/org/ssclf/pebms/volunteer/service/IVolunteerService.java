package org.ssclf.pebms.volunteer.service;

import java.util.List;

import org.ssclf.pebms.base.service.IBaseService;
import org.ssclf.pebms.volunteer.model.Farmer;

public interface IVolunteerService extends IBaseService {
    List<Farmer> queryFarmers(final int firstResult, final int maxResults);
}
