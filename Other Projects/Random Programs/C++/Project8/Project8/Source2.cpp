/******************************************************************************
Program Name: What's in the box?
Created Date: 4/17/17
Created By: Andrew Stites
Purpose: To play a fun game 
*******************************************************************************/

#include <iostream>
#include <string>
#include <ctime>
using namespace std;

/******************************************************************************
Function Name: main()
Parameters: user_Choice, tempBox, computer_Choice
Return Value: Int
Acknowledgements: Book, Google,  
*******************************************************************************/

//function using pass by reference that prints out the beginning message; returns user_Choice 
int printWelcome(int&);
//funciton that computes a random number; returns random
int randomNum();
//function that determines the order of randomness for the user, computer, and tempbox; returns nothing
void makeRandomGenerator(int&, int&, int&);
//function that prints out boxes corresponding to the number 1, 2, or 3 for the variables; returns nothing
void boxes(int, int);

//returns the value of 'int'
//main() is the main method
int main()
{
	//variables that allow the user to go again
	string answer;
	do
	{
	//seeds the random function
	srand(time(0));
	//int variable that copies randomNum()
	int random = randomNum();
	//the first user's choice
	int user_Choice;
	//the second user's choice
	int user_Choice2;
	//creates a number out of 1, 2, or 3 the winning number
	int winningNum = randomNum();
	//made the computer's number random
	int computer_Choice = randomNum();
	//made the tempbox's number random
	int tempBox = randomNum();

	//a do while loop to correct wrong inputs
	do
	{
	//clears the screen
	system("cls");
	//prints the welcoming text and has user_Choice in its parameters
	printWelcome(user_Choice);
	}while(user_Choice < 1 || user_Choice > 3);

	//sets up the three main variables to be a different number due to the user's choice
	makeRandomGenerator(user_Choice, tempBox, computer_Choice);

	//tells the user what box they chose
	cout << endl << "You chose Box Number " << user_Choice << endl;
	cout << "Let's take a gander at Box Number " << computer_Choice << "... A Red Snapper!!!" << endl;
	//a better way to stop the console; less strain on the compiler
	cin.get();

	//another safety loop for wrong input
	do
	{
	system("cls");
	cout << "Do you want to stay with your old box or take the new box?:" << endl;
	boxes(user_Choice, tempBox);
	cin >> user_Choice2;
	}while (user_Choice2 != tempBox && user_Choice2 != user_Choice);

	//conditional statements regarding if user_Choice == user_Choice2
	if (user_Choice == user_Choice2)
	{
		cout << "Hold to your guns and stay with your number? Your decision...";
	}
	else
	{
		cout << "I see you changed your guess...";
	}

	//conditional statements regarding if user_Choice2 == winningNum
	if (user_Choice2 == winningNum)
	{
		cout << "You won!!!" << endl;
		cin.get();
		cout << "You win a Million Dollars!!!";
		cin.get();
	}
	else
	{
		cout << "You lost!!!" << endl;
		cin.get();
		cout << "You get a Red Snapper!!!";
		cin.get();
	}

	//allows the user to exit or play again
	cout << "Do you want to go again?: " << endl;
	cin >> answer;
	cin.get();
	}while(answer == "Yes" || answer == "yes" || answer == "YES");

return 0;
}

//the welcoming display
int printWelcome(int& user_Choice)
{
	cout << "Welcome to the Grand Box Game!!!";
	cin.get();

	cout << "You have a chance to win 1 Million Dollars by choosing the correct box!";
	cin.get();

	cout << "There are three boxes in total; choose wisely!";
	cin.get();
	system("cls");

	cout << "So, which box do you think is the Million Dollar Box?:";
	cout << "\nBox Number 1?" << endl << "Box Number 2?" << endl << "or Box Number 3?(input 1, 2, or 3) ";
	cin >> user_Choice;

	cin.get();

	return user_Choice;
}

//random function for 1 through 3
int randomNum()
{
	int random;
	random = rand() % 3 + 1;
	return random;
}


void makeRandomGenerator(int& user_Choice, int& tempBox, int& computer_Choice)
{
do
	{
		computer_Choice = rand() % 3 + 1;
		tempBox = rand() % 3 + 1;

	//the famous Stites Random Conundrum
	}while(user_Choice == 1 && computer_Choice == 1 ||
		   user_Choice == 1 && tempBox == 1	  ||
		   tempBox == 1 && computer_Choice == 1 
					||
		   user_Choice == 2 && computer_Choice == 2 ||
		   user_Choice == 2 && tempBox == 2	  ||
		   tempBox == 2 && computer_Choice == 2 
					||
		   user_Choice == 3 && computer_Choice == 3 ||
		   user_Choice == 3 && tempBox == 3	  ||
		   tempBox == 3 && computer_Choice == 3);
}

void boxes(int user_Choice, int tempBox)
{
	if (user_Choice == 1)
	{
		cout << "Box 1" << endl;
	}
	else if (user_Choice == 2)
	{
		cout << "Box 2" << endl;
	}
	else
	{
		cout << "Box 3" << endl;
	}

	if (tempBox == 1)
	{
		cout << "Box 1" << endl;
	}
	else if (tempBox == 2)
	{
		cout << "Box 2" << endl;
	}
	else
	{
		cout << "Box 3" << endl;
	}

}
