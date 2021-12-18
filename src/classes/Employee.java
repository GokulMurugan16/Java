package classes;

import java.time.LocalDate;

abstract public class Employee {
	
	

	int id;
	String name;
	LocalDate dob;
	String email;
	String phone;
	Gender gender;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	public Employee(int id, String name, LocalDate dob, String email, String phone, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
	}
	
	abstract public double calculateSalary();
	
	

}
