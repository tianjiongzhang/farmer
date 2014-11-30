package org.ssclf.pebms.volunteer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ssclf.pebms.base.controller.BaseController;
import org.ssclf.pebms.volunteer.model.Farmer;
import org.ssclf.pebms.volunteer.service.IVolunteerService;

@Controller
public class VolunteerController extends BaseController {
	private static final String VOLUNTEER_FARMERS_LIST = "volunteer/farmers";
	@Autowired
    private IVolunteerService volunteerService;
	
	@Autowired
	public VolunteerController(Validator validator) {
		super(validator);
	}

	@RequestMapping(value = "/farmers", method = RequestMethod.GET)
    public String gotoUserForm(HttpServletRequest req, Model model) {
		String pageNumberStr = req.getParameter("pageNumber");
		int pageNumber = pageNumberStr == null ? 1 : Integer.valueOf(pageNumberStr);
		List<Farmer> famers = volunteerService.queryFarmers(((pageNumber - 1) * 10 + 1), 10);
        model.addAttribute("famers", famers);
        return VOLUNTEER_FARMERS_LIST;
    }
}
