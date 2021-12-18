package classes;

import java.time.LocalDate;

public class ContractEmployee extends Employee {
	
	

	LocalDate contractStartDate;
	LocalDate contractEndDate;
	float wages;
	float hoursWorked;
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public ContractEmployee(int id, String name, LocalDate dob, String email, String phone, Gender gender,
			LocalDate contractStartDate, LocalDate contractEndDate, float wages, float hoursWorked) {
		super(id, name, dob, email, phone, gender);
		this.contractStartDate = contractStartDate;
		this.contractEndDate = contractEndDate;
		this.wages = wages;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculateSalary() {
		
		double salary = 0;
		
		if(contractStartDate.isAfter(LocalDate.now()) ||contractStartDate.isEqual(LocalDate.now()) ||  contractEndDate.isAfter(LocalDate.now()) || contractEndDate.isEqual(LocalDate.now()))
		{
			salary = wages*hoursWorked;
			return salary;
		}
		else {
			
			System.out.println("Worker's Work Period ended");
			return 0;
		}
		
		
	}
	
	

}
