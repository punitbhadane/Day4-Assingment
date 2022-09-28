package Day4;

import java.util.Random;

public class EmployeeWageUc2 {
	public static void main(String[] args) {
		Random random = new Random();
		int rand = random.nextInt(2);

		int wagePerHour = 20;
		int fulltime = 8;

		// if else statement part start
		if (rand == 0) {
			System.out.println("You are present today ");
			int dailyWage;
			dailyWage = fulltime * wagePerHour;
			System.out.println("Your today's salary is: " + dailyWage + "Rs");
		} else {
			System.out.println("Employee is Absent");
		}
	}

}
