package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	public void setupScenary1() {

	}
	
	@Test
	public void dataAssignment() {
		String id_type = "PP";
		int id_number = 123456;
		
		Person person = new Person(id_type, id_number);
		
		assertEquals(id_type, person.getId_type());
		assertEquals(id_number, person.getId_number());
	}

}
