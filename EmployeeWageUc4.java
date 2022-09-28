package Day4;

import java.util.Random;

public class EmployeeWageUc4 {
	
	private static int WagePerHr=20;
	
	public static void main(String[] args) {
		Random random = new Random();
		int rand =random.nextInt(3);
		int fullSalary;
		int partSalary;
		int fulltime=8;
		int parttime=4;
		switch (rand) {
		case 0:
			System.out.println("You Are Absent Today.");
			break;
		case 1:
			System.out.println("You Are Present Today.");
			fullSalary=WagePerHr*fulltime;
			System.out.println("Your Full Time Salary is "+ fullSalary+ "Rs");
			break;
		case 2:
			System.out.println("You Worked Part Time.");
			partSalary= WagePerHr*parttime;
			System.out.println("Your Worked Part Time Its Your Salary: "+partSalary + "Rs");
			break;
		default:
			System.out.println("You Are Not Employe Of Our Company.");
			break;
		}
	}
	}

