/******************************************************************************
Program Name: The Magic Show
Created Date: 1/27/17
Created By: Andrew Stites
Purpose: To Spread The Love Of Magic
*******************************************************************************/

#include <iostream>
using namespace std;

/******************************************************************************
Function Name: main()
Parameters: None
Return Value: Int
Acknowledgements: Book, Google and you, sensei
*******************************************************************************/

//returns an int value
//main() is the function for this block
int main()
{
	//Used 'cout' object to welcome the user
	//Used 'system("pause")' to pause for slow readers
	cout << "Welcome to the Stite-i-est Magic Show!\n";
	system("pause");
	
	//Used 'cout' object to blow their minds
	//Used 'system("pause")' to pause to blow their minds again
	cout << "For our first and final act, I will READ YOUR MIND!!!\n";
	system("pause");

	//Used 'cout' object to ask the user to think of their consecutive integers
	//Used 'system("pause")' to pause for math time
	cout << "Please write down, or just remember, three consecutive integers less than 60(e.g. 4, 5, 6,)\n";
	system("pause");

	//Used 'cout' object to ask the user to input their multiple of 3
	//Used 'system("pause")' to pause for slow readers
	cout << "Next, input a multiple of 3 that is less than 100\n";
	int multiple_Of_Three = 0;
	cin >> multiple_Of_Three;

	//Used 'cout' object to print to the console
	//Used 'system("pause")' to pause for the Fraggles
	cout << "Now, please add all those numbers together (3 integers and multiple of 3)\n";
	system("pause");

	//Used 'cout' object to print to the console
	//Used 'system("pause")' to pause for Harambe
	cout << "Finally, multiply it by 67!\n";
	system("pause");
	
	//Used 'cout' object to ask a question
	//Used 'cin' object to grab it and store it into 'user_Two_Digits'
	cout << "What are the last two digits of your answer???\n";
	int user_Two_Digits = 0;
	cin >> user_Two_Digits;
	
	//Used 'cout' object to print to the console
	//Used 'system("pause")' the console to pause for dramatic effect
	cout << "HO-HO! Exactly what I would have expected!\n";
	system("pause");

	//Used the 'cout' object to present their answer
	//Used 'system("pause")' the console for viewing purposes
	//Used arithmetic (and your teachings) to find their answer
	int user_Answer = ((user_Two_Digits * 2) * 100) + user_Two_Digits;
	cout << "I sense that your answer is: " << user_Answer << "!\n";
	system("pause");
	
	//Utilize arithmetic to obtain the 3 consecutive numbers
	int first_Int = user_Two_Digits - ((multiple_Of_Three / 3) + 1);
	int second_Int = first_Int + 1;
	int third_Int = second_Int + 1;

	//Display the final result to the user
	//Used system("pause") so they can see the magic
	cout << "Don't forget your orignal three numbers: " << first_Int << ", " << second_Int << " and " << third_Int <<"\n";
	system("pause");
	
	//"This program is successful"
	return 0;
}