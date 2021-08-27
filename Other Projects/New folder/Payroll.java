public class Payroll{
private String employeeName;
private int employeeID;
private int employeeHourRate;
private int employeeHoursWorked;

public String getName(){
	return employeeName;
}

public int getID(){
	return employeeID;
}

public int getHourRate(){
	return employeeHourRate;
}

public int getHoursWorked(){
	return employeeHoursWorked;
}

public void setName(String nameGiven){
	employeeName = nameGiven;
}

public void setID(int idGiven){
	employeeID = idGiven;
}

public void setHourRate(int hourRateGiven){
	employeeHourRate = hourRateGiven;
}

public void setHoursWorked(int hoursWorkedGiven){
	employeeHoursWorked = hoursWorkedGiven;
}

public int calculateGrossPay(){
	return (employeeHoursWorked * employeeHourRate);
}

public Payroll(){
	employeeName = "";
	employeeID = 0;
	employeeHourRate = 0;
	employeeHoursWorked = 0;
}


}