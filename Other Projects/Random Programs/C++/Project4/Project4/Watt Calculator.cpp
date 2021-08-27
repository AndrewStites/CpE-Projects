/******************************************************************************
Program Name: The Wattage Calculator
Created Date: 2/4/17
Created By: Andrew Stites
Purpose: To find the wattage price of a device
*******************************************************************************/

#include <iostream>
#include <iomanip>
using namespace std;

/******************************************************************************
Function Name: main()
Parameters: None
Return Value: Int
Acknowledgements: Book, and a lot from Google 
*******************************************************************************/

//int is the type of data that will be returning
//main() is the function for this block
int main() {

	//Create constants for reoccuring items
	//Used signed 'int' for all the datatypes (except kilowatt) due to being in the correct range
	const int hours_Day = 24;
	const int days_In_Week = 7;
	const int days_In_Year = 365;
	const double kilowatt = 1000.0;
	const int column_Widths = 32;
	const int column_Widths_Two = 10;

	//Used 'cout' object to welcome the user
	//Used 'system("pause") to pause the console for viewing purposes
	cout << "Welcome to the Power-Usage Calculator\n";
	system("pause");
	
	//Used 'cout' object to ask the user for the device's wattage
	//Used double datatype to get a more precise answer in future use
	//Used 'cin' object to recieve input from the user 
	cout << "To get started, the device's wattage is needed: \n";
	double user_Device_Wattage = 0.0;
	cin >> user_Device_Wattage;
	

	//Used 'cout' object to ask the user for the price of Kwh per hour
	//Used double datatype to get a more precise answer in future use
	//Used 'cin' object to recieve input from the user
	cout << "Next, the price per kwh per hour:\n";
	double user_Price_Per_Hour = 0.0;
	cin >> user_Price_Per_Hour;

	//Used 'cout' object to ask the user for the daily time usage
	//Used double datatype to get a more precise answer in future use
	//Used 'cin' object to recieve input from the user
	//Used system("cls") to make the summary/result screem clearer
	cout << "How many hours per day is this device in use?:\n";
	double user_Hours_Per_Day = 0.0;
	cin >> user_Hours_Per_Day;
	system("cls");

	//Used 'cout' object to present user their summary
	//Used 'setw()' library function to align the strings for output
	//Used 'setiosflags()' manipulator to right justify variables
	//Used constants where applicable
	cout << "How much does your device cost?:\n\n";
	cout << setw(26) << right << "Summary:\n" << endl
		 << setw(column_Widths) << left << "Device use in watts:" << setw(column_Widths_Two) << setiosflags(ios::right) << user_Device_Wattage << endl
		 << setw(column_Widths) << left << "The price of electricity per Kwh:" << setw(9)  << setiosflags(ios::right) << user_Price_Per_Hour << endl
		 << setw(column_Widths) << left << "Hours of use per day:" << setw(column_Widths_Two) << setiosflags(ios::right) << user_Hours_Per_Day << endl;
	cout << "--------------------------------------------\n";
	
	//Utilized arithmetic to calculate needed values
	//Utilized double datatype for more precision
	user_Price_Per_Hour /= kilowatt;
	double day_Price = user_Device_Wattage * user_Price_Per_Hour * user_Hours_Per_Day;
	double week_Price = day_Price * days_In_Week;
	double year_Price = day_Price * days_In_Year;
	
	//Used 'cout' object to present user their summary
	//Used 'setw()' library function to align the strings for output
	//Used 'setiosflags()' manipulator to right justify variables
	//Used 'setprecision()' to limit the amount of digits after decimal
	//Used constants where applicable
	cout << setw(26) << right << "Results:\n" << endl
		 << setw(column_Widths) << left << "Price per day:" << setw(column_Widths_Two) << setiosflags(ios::right) << setprecision(1) << day_Price << endl
		 << setw(column_Widths) << left << "Price per week:" << setw(column_Widths_Two) << setiosflags(ios::right) << setprecision(2) << week_Price << endl
		 << setw(column_Widths) << left << "Price per year:" << setw(column_Widths_Two) << setiosflags(ios::right) << setprecision(4) << year_Price << endl;
	system("pause");
	
	
	//"This program is successfull"
	return 0;




}