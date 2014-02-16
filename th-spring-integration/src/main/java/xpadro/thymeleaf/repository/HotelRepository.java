package xpadro.thymeleaf.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import xpadro.thymeleaf.model.Guest;

public interface HotelRepository extends MongoRepository<Guest, Long> {
	
}
