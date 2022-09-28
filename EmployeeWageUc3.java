package Day4;

import java.util.Random;

public class EmployeeWageUc3 {
	public static void main(String[] args) {
		Random random = new Random();
		int rand =random.nextInt(3);
		
		int wagePerHour=20;
		int fulltime=12;
		
		//This is part time employee problem.
		int partTime=8;
		if(rand==2) {
			System.out.println("You Worked Full Time Today");
			int dailyWage;
			dailyWage=fulltime*wagePerHour;
			System.out.println("Your Full Time Salary is: "+ dailyWage +"Rs");
		}
		else if(rand == 1) {
			System.out.println("You Worked Part Time Today");
			int partTimeWage;
			partTimeWage=partTime*wagePerHour;
			System.out.println("Your Part Time Salary is: "+ partTimeWage +"Rs");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}

}
