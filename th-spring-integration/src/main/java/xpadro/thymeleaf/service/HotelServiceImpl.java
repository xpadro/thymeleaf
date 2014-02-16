package xpadro.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xpadro.thymeleaf.exception.GuestFoundException;
import xpadro.thymeleaf.model.Guest;
import xpadro.thymeleaf.model.HotelData;
import xpadro.thymeleaf.repository.HotelRepository;

@Service("hotelServiceImpl")
public class HotelServiceImpl implements HotelService {
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public HotelData getHotelData() {
		HotelData data = new HotelData();
		data.setAddress("Catalunya Square, 225");
		data.setName("Barcelona Hotel");
		
		return data;
	}

	@Override
	public List<Guest> getGuestsList() {
		return hotelRepository.findAll();
	}
	
	@Override
	public List<Guest> getGuestsList(String surname) {
		return hotelRepository.findGuestsBySurname(surname);
	}

	@Override
	public void insertNewGuest(Guest newGuest) {
		if (hotelRepository.exists(newGuest.getId())) {
			throw new GuestFoundException();
		}
		
		hotelRepository.save(newGuest);
	}
}
