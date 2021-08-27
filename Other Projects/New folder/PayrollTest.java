import java.util.Scanner;

public class PayrollTest{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		Payroll employee = new Payroll();

		System.out.print("Please enter the employee's name: ");
			String name = input.nextLine();

		System.out.print("Please enter the employee's ID number: ");
			int id = input.nextInt();

		System.out.print("Please eneter the hourly rate: ");
			int hourlyRate = input.nextInt();

		System.out.print("Please enter the hours worked: ");
			int hoursWorked = input.nextInt();

		employee.setName(name);
		employee.setID(id);
		employee.setHourRate(hourlyRate);
		employee.setHoursWorked(hoursWorked);

		System.out.println("\nThe amount earned grossly for: \n" + employee.getName() + "\nI.D. number: " + employee.getID() + "\nHour Rate: " + employee.getHourRate() + "\nHours Worked: " +  employee.getHoursWorked());
		System.out.println("\nThe gross income for this employee is: $" + employee.calculateGrossPay());

	}



}