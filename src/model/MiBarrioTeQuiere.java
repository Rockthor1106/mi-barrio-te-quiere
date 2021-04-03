package model;

import java.util.ArrayList;


public class MiBarrioTeQuiere {
	private ArrayList<Person> persons = new ArrayList<>();
	private int counter;
	public void addPerson(String id_type, int id_number) {
		persons.add(new Person(id_type, id_number));
		counter++;
	}

	public boolean validID(String id_type, int id_number) {
		boolean valid = false;
		ArrayList<Integer> parts = new ArrayList<>();
		parts.add(id_number);
		return valid;

	}
	
	public int penultimateIdNumber(String id_number) {
		char[] digits = id_number.toCharArray();
		return digits.length-1;
	}
	
	public int getCounter() {
		return counter;
	}

}
