package xpadro.thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import xpadro.thymeleaf.service.HotelService;

@Controller
public class HomeController {
	private static final String HOME_VIEW = "home";
	
	@Autowired
	private HotelService hotelService;

	@RequestMapping(value = HOME_VIEW, method = RequestMethod.GET)
	public String showHome(Model model) {
		model.addAttribute("hotelData", hotelService.retrieveHotelData());
		
		return HOME_VIEW;
	}
}
