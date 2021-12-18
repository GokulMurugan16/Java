package mainClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import classes.ContractEmployee;
import classes.Gender;
import classes.PermanentEmployee;

public class TestEmployee {

	public static void main(String[] args) {
		
		int id = 0;
		String name = "";
		LocalDate dob = LocalDate.of(2020, 01, 01);
		String email = "";
		String phone = "";
		Gender gender = Gender.Male ;
		LocalDate contractStartDate = LocalDate.of(2020, 01, 01);;
		LocalDate contractEndDate = LocalDate.of(2022, 01, 01);;
		float wages = 0;
		float hoursWorked = 0;
		LocalDate dateOfJoining = LocalDate.of(2020, 01, 01);;
		float taxPercent = 0;
		float salary = 0;
		
		Scanner myObj = new Scanner(System.in); 
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M-d-yyyy");

		System.out.println("Welcome");
		System.out.println("Please Enter Employee Name	:");
		name = myObj.nextLine();
		System.out.println("Please Enter Employee Email	:");
		email = myObj.nextLine();
		System.out.println("Please Enter Employee Phone	:");
		phone = myObj.nextLine();
		System.out.println("Please Enter Employee Date of Birth	:");
		dob = LocalDate.parse(myObj.nextLine(), dateFormat);
		System.out.println("Please Enter Employee Gender	:");
		System.out.println("1.: Male");
		System.out.println("2.: Female");
		System.out.println("3.: Other");
		switch (myObj.nextInt()) {
		case 1:
			gender = Gender.Male;
		case 2:
			gender = Gender.Male;
		case 3:
			gender = Gender.Male;
		}
		System.out.println("Enter the type of Employee	:");
		System.out.println("1.: Permanent");
		System.out.println("2.: Contract");
		
		if(myObj.nextInt() == 1) {
			System.out.println("Tax Percentage	:");
			taxPercent = myObj.nextFloat();
			System.out.println("Salary	:");
			salary = myObj.nextFloat();
			System.out.println("Enter Date of Joining: ");
			dateOfJoining = LocalDate.parse(myObj.nextLine(), dateFormat);	
			PermanentEmployee p = new PermanentEmployee( id, name, dob, email, phone, gender, dateOfJoining, taxPercent, salary);
			System.out.println("Salary : "+p.calculateSalary());
			
		}
		else if(myObj.nextInt() == 2) {
			System.out.println("Enter Contract Start Date: ");
			contractStartDate = LocalDate.parse(myObj.nextLine(), dateFormat);
			System.out.println("Enter Contract End Date: ");
			contractEndDate = LocalDate.parse(myObj.nextLine(), dateFormat);
			System.out.println("Enter Hourly Wage: ");
			wages = myObj.nextFloat();
			System.out.println("Enter The no of hours Worked: ");
			hoursWorked = myObj.nextFloat();
			
			ContractEmployee c = new ContractEmployee(id, name, dob, email, phone, gender, contractStartDate, contractEndDate, wages, hoursWorked);
			System.out.println("Salary : "+c.calculateSalary());
			
		}
		else {
			System.out.println("Please enter a valid choice");
		}
		

	}

}
