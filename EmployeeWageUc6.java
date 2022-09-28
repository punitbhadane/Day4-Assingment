package Day4;

import Day3.EmpWageCompUC6;

public class EmployeeWageUc6 {
	private static final String FULL_TIME = "FULL_TIME";
	private static final String PART_TIME = "PART_TIME";
	private static final int monthDays = 20;

	public static void main(String[] args) {
		EmpWageCompUC6 nitin = new EmpWageCompUC6();
		int hrs = nitin.noOfHrsInDay(FULL_TIME);
		System.out.println("working time: " + hrs);

		double salary = nitin.oneDaySal();
		System.out.println("One Day Salary is " + salary);
		double fullMonthSal = salary * monthDays;
		System.out.println("Then Your 20 Days Full Time Salary is: " + fullMonthSal);

		double sal100hr = nitin.hundredHrsal(100, 20);
		System.out.println("Salary Of 100 Working Hours is: " + sal100hr);

	}

	public int noOfHrsInDay(String type) {
		switch (type) {
		case FULL_TIME:
			return 8;
		case PART_TIME:
			return 4;
		default:
			return 0;
		}
	}

	public double oneDaySal() {
		return noOfHrsInDay(FULL_TIME) * 20;
	}

	public double oneDaysal(int wrHr) {
		return noOfHrsInDay(PART_TIME) * wrHr;
	}

	public double hundredHrsal(int val1, int val2) {
		return val1 * val2;
	}
}
