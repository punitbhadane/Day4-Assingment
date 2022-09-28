package Day4;

import java.util.Random;

public class EmployeeWageUc1 {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee  Wage Computation  Program on Master Branch");
		Random random = new Random();
		int rand = random.nextInt(2);

		if (rand == 1) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}

	}

}
