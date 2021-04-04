package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiBarrioTeQuiereTest {

	public void setupScenary1() {

	}

	@Test
	public void testCorrectRegistration() throws IndexOutOfBoundsException{
		setupScenary1();

		String id_type = "CC";
		int id_number = 123456;
		boolean valid_person = true;

		MiBarrioTeQuiere miBarrioTeQuiere = new MiBarrioTeQuiere();
		miBarrioTeQuiere.registerPerson(id_type, id_number,valid_person);

		assertEquals(id_type, miBarrioTeQuiere.getPersons().get(0).getId_type());
		assertEquals(id_number, miBarrioTeQuiere.getPersons().get(0).getId_number());
		assertEquals(valid_person, miBarrioTeQuiere.registerPerson(id_type, id_number, valid_person));

	}
	
	//this case verify the two conditions by which a person can't go out of house in just one case
	//first condition: invalid id type
	//Second condition: The government regulation to go out
	//because basically the thing to to evaluate is if the person is registered or not
	@Test 
	public void testInvalidIdTypeAndDaryToGoOut() {
		setupScenary1();
		
		String id_type = "TI";
		int id_number = 123456;
		boolean valid_person = false;
		
		MiBarrioTeQuiere miBarrioTeQuiere = new MiBarrioTeQuiere();
	
		assertEquals(false,miBarrioTeQuiere.registerPerson(id_type, id_number,valid_person));
		
		
	}

	@Test
	public void testPenultimateIdNumber() {
		setupScenary1();

		int id_number = 123456;

		MiBarrioTeQuiere miBarrioTeQuiere = new MiBarrioTeQuiere();

		assertEquals("5", miBarrioTeQuiere.penultimateIdNumber(id_number));

	}
	
	@Test
	public void testHowMuchDigitsHave() {
		setupScenary1();
		
		int id_number = 1234;
		
		MiBarrioTeQuiere miBarrioTeQuiere = new MiBarrioTeQuiere();
		
		assertEquals(4, miBarrioTeQuiere.HowMuchDigitsHave(id_number));
	}

}
