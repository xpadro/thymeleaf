package xpadro.thymeleaf.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import xpadro.thymeleaf.configuration.WebAppConfiguration;
import xpadro.thymeleaf.model.Guest;

@org.springframework.test.context.web.WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={WebAppConfiguration.class})
public class HotelInsertionTest {
	@Autowired
	private MongoOperations mongoOps;
	
	@Before
	public void setUp() {
		mongoOps.dropCollection(Guest.class);
	}

	@Test
	public void insert() throws Exception {
		Guest guest = new Guest();
		guest.setId(5837l);
		guest.setName("John");
		guest.setSurname("Smith");
		guest.setCountry("Scotland");
		mongoOps.insert(guest);
		
		guest = new Guest();
		guest.setId(3726l);
		guest.setName("Marc");
		guest.setSurname("Thomas");
		guest.setCountry("Norway");
		mongoOps.insert(guest);
	}
}
