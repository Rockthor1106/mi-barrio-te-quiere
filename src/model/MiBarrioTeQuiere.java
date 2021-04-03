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
}
