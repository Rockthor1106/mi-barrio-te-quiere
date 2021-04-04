package model;

import java.time.LocalDate;
import java.util.ArrayList;

import exceptions.GovermentNormativeException;

public class MiBarrioTeQuiere {
	
	private ArrayList<Person> persons = new ArrayList<>();

	public boolean registerPerson(String id_type, int id_number, boolean valid_person) {
		boolean registered = false;
		int penultimate_number = Integer.parseInt(penultimateIdNumber(id_number));
		
		if (valid_person == true) {
			try {
				if (penultimate_number % 2 == 0 && LocalDate.now().getDayOfMonth() % 2 == 0) {
					throw new GovermentNormativeException();
					
				}
				else if (penultimate_number % 2 != 0 && LocalDate.now().getDayOfMonth() % 2 != 0){
					throw new GovermentNormativeException();
				}
				else {
					persons.add(new Person(id_type, id_number));
					registered = true;
				}
					
			} catch (GovermentNormativeException gne) {
				System.out.println(new GovermentNormativeException().getMessage());
			}
		
		}	
		return registered;
	}

	// this method returns a String because when I was using int to return type, the
	// program had an error, idk why, but the value was different when this method
	// was used
	public String penultimateIdNumber(int id_number) {
		String number = String.valueOf(id_number);
		char[] digits = number.toCharArray();
		return String.valueOf(digits[digits.length - 2]); // return the second to last position of digits
	}
	
	public int HowMuchDigitsHave(int id_number) {
		String number = String.valueOf(id_number);
		char[] digits = number.toCharArray();
		return digits.length;
	}

	public ArrayList<Person> getPersons() {
		return persons;
	}

}
