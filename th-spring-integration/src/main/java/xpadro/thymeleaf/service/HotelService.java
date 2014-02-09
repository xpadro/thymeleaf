package xpadro.thymeleaf.service;

import xpadro.thymeleaf.model.HotelData;

public interface HotelService {

	/**
	 * Returns generic information about the hotel
	 * @return hotelData
	 */
	HotelData retrieveHotelData();
}
