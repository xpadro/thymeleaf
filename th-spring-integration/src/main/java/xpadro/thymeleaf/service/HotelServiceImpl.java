package xpadro.thymeleaf.service;

import org.springframework.stereotype.Service;

import xpadro.thymeleaf.model.HotelData;

@Service("hotelServiceImpl")
public class HotelServiceImpl implements HotelService {

	@Override
	public HotelData retrieveHotelData() {
		HotelData data = new HotelData();
		data.setAddress("Catalunya Square, 225");
		data.setName("Barcelona Hotel");
		
		return data;
	}

}
