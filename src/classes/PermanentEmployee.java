package classes;

import java.time.LocalDate;

public class PermanentEmployee extends Employee{

	LocalDate dateOfJoining;
	float taxPercent;
	float salary;

	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public PermanentEmployee(int id, String name, LocalDate dob, String email, String phone, Gender gender,
			LocalDate dateOfJoining, float taxPercent, float salary) {
		super(id, name, dob, email, phone, gender);
		this.dateOfJoining = dateOfJoining;
		this.taxPercent = taxPercent;
		this.salary = salary;
	}


	@Override
	public double calculateSalary() {
		
		if (dateOfJoining.isBefore(LocalDate.now())||dateOfJoining.isEqual(LocalDate.now()))
		{
			this.salary -= ((salary*taxPercent)/100);
			return this.salary/12;
		}
		else
		{
			System.out.println("Cannot calculate salary please check the entered information");
			return 0;
		}
		
	}
	
	
}

