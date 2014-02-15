package xpadro.thymeleaf.service;

import java.util.List;

import xpadro.thymeleaf.model.Guest;
import xpadro.thymeleaf.model.HotelData;

public interface HotelService {

	/**
	 * Returns generic information about the hotel
	 * @return hotelData
	 */
	HotelData getHotelData();
	
	/**
	 * Returns all guests registered to the hotel
	 * @return guests list
	 */
	List<Guest> getGuestsList();
}
