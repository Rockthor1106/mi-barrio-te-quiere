package model;

import java.util.ArrayList;


public class MiBarrioTeQuiere {
	private ArrayList<Person> persons = new ArrayList<>();
	
	public void addPerson(String id_type, int id_number) {
		persons.add(new Person(id_type, id_number));
	}

	public boolean validID(String id_type, int id_number) {
		boolean valid = false;
		ArrayList<Integer> parts = new ArrayList<>();
		parts.add(id_number);
		return valid;

	}
	
	//this method returns a String because when I was using int to return type, the program had an error, idk why, but the value was different when this method was used
	public String penultimateIdNumber (String id_number) {
		char[] digits = id_number.toCharArray();
		return String.valueOf(digits[digits.length-2]); //return the second to last position of digits
	}


}
