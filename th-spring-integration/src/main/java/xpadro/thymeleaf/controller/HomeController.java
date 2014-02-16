package xpadro.thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import xpadro.thymeleaf.model.Guest;
import xpadro.thymeleaf.service.HotelService;

@Controller
public class HomeController {
	private static final String HOME_VIEW = "/home";
	private static final String RESULTS_FRAGMENT = "results :: resultsList";
	
	@Autowired
	private HotelService hotelService;
	
	@ModelAttribute("guest")
	public Guest prepareGuestModel() {
		return new Guest();
	}

	@RequestMapping(value = HOME_VIEW, method = RequestMethod.GET)
	public String showHome(Model model) {
		model.addAttribute("hotelData", hotelService.getHotelData());
		prepareGuestModel();
		
		return HOME_VIEW;
	}
	
	
	@RequestMapping(value = "/guests", method = RequestMethod.GET)
	public String showGuestList(Model model) {
		model.addAttribute("guests", hotelService.getGuestsList());

		return RESULTS_FRAGMENT;
	}
	
	@RequestMapping(value = "/guests/insertion", method = RequestMethod.POST)
	public String showGuestList(Guest newGuest, Model model) {
		hotelService.insertNewGuest(newGuest);
		
		return showHome(model);
	}
}
