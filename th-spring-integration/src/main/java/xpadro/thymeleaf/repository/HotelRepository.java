package xpadro.thymeleaf.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import xpadro.thymeleaf.model.Guest;

public interface HotelRepository extends MongoRepository<Guest, Long> {
	
	@Query("{ 'surname' : ?0 }")
	List<Guest> findGuestsBySurname(String surname);
	
}
