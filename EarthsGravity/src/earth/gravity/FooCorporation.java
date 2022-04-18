package earth.gravity;

import java.util.Scanner;

public class FooCorporation {
	static final double minimumWage = 8.0;// Minimum wage that should be provided to the worker.
	static final int maximumHours = 60;// Maximum hours that employee can work overtime.
	static double basePay = 0;// basePay is assigned to its initial value as zero.
	static int hoursWorked = 0;// Number of hours worked is assigned value as zero

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int numberOfEmployees = 0;
			System.out.println("Enter the Number of employees:\n");
			numberOfEmployees = in.nextInt();
			for (int i = 1; i <= numberOfEmployees; i++, System.out.println()) {
				System.out.println("For Employee Number: \n" + i);// To print the Employee 1,2,3
				System.out.println("Enter Base Pay:\n");// Line that asks to enter the base pay of worker.
				basePay = in.nextDouble();// the value accepted is explicitly converted to double.
				System.out.println("Enter Hours Worked:\n");// Line that asks the number of hours worked.
				hoursWorked = in.nextInt();// It converts explicitly to Integertype.
				salaryCalculation();// calling the method
			}
		}
	}

	public static void salaryCalculation() {
		double totalSalary = 0;
		if ((basePay < minimumWage) || (hoursWorked > maximumHours)) { // if condition that checks the minimum wage and
																		// maximum hours worked if it dont matches with
																		// criteria it simply prints the message Error!
			System.out.println("Error!");
		} else { // if the if condition fails the else code will be calculated.

			if (hoursWorked > 40) {
				totalSalary = basePay * 40 + 1.5 * basePay * (hoursWorked - 40);
			} else {
				totalSalary = basePay * hoursWorked;// calculating the total salary
			}
			System.out.println("Your total salary is " + totalSalary); // printing the calculated output
		}
	}

}