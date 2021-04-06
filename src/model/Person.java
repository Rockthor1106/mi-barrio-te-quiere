package model;

public class Person {

	private String id_type;
	private int id_number;

	public Person(String id_type, int id_number) {
		this.id_type = id_type;
		this.id_number = id_number;
	}

	public String getId_type() {
		return id_type;
	}
	public int getId_number() {
		return id_number;
	}

}
