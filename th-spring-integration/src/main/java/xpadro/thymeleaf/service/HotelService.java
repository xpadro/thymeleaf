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
	 * Returns all guests registered at the hotel
	 * @return guests list
	 */
	List<Guest> getGuestsList();
	
	/**
	 * Returns all guests registered at the hotel with the specified surname
	 * @param name
	 * @return
	 */
	List<Guest> getGuestsList(String surname);
	
	/**
	 * Registers a new guest
	 * @param newGuest
	 */
	void insertNewGuest(Guest newGuest);
}
