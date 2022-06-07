import java.util.Scanner;

public class JustinCao_Week04_Exercise04_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter employee's name: ");
		String employeeName = input.nextLine();
		System.out.println("Enter number of hours worked in a week: ");
		Double employeeHours = input.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		Double employeePay = input.nextDouble();
		System.out.println("Enter federal tax withholding rate: %");
		Double employeeFtax = input.nextDouble();
		System.out.println("Enter state tax withholding rate: %");
		Double employeeStax = input.nextDouble();

		Double grossPay = employeeHours * employeePay;
		Double fTax = grossPay * employeeFtax / 100;
		Double sTax = grossPay * employeeStax / 100;
		Double totalDeductions = fTax + sTax;
		Double netPay = grossPay - totalDeductions;

		System.out.println("Employee Name: " + employeeName);
		System.out.println("Hours Worked: " + employeeHours);
		System.out.println("Pay Rate: $" + employeePay);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions:");
		System.out.printf("  Federal Withholding (%.0f%%): $%.2f\n", employeeFtax, fTax);
		System.out.printf("  State Withholding (%.0f%%): $%.2f\n", employeeStax, sTax);
		System.out.printf("  Total Deduction: $%.2f\n", totalDeductions);
		System.out.printf("Net Pay: $%.2f\n", netPay);
	}
}
