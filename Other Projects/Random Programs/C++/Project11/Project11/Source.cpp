/******************************************************************************
Program Name: Dice Game
Created Date: 4/17/17
Created By: Andrew Stites
Purpose: To play a fun game 
*******************************************************************************/
#include <iostream>
#include <string>
#include <time.h>
using namespace std;
/******************************************************************************
Function Name: main()
Parameters: None
Return Value: Int
Acknowledgements: Book, Google, Youtube 
*******************************************************************************/

//a class dedicated to the die
class Dice {
//private: keeps data secured so no unintentional tampering can occur
private:	
	int total_Rolls;
	int total_Score;
	int die1;
//public: allows data to be used within the scope of class Dice
public:
	Dice();
	void dice_Faces1();
	int random_Number_Gen() {return rand() % 6 + 1;}
	void Rolls();
	void Display();
	int score();
};

//Dice constructor--allowing for the private data to be accessed in a public member function
//each variable in private has been initialized for outside public access
Dice::Dice() : die1(0), total_Rolls(0), total_Score(0)
{}

//member function RollS() deals with the die value, which ultimately becomes a random number ranged 1-6
//has total_Rolls++ to add the amount of rolls each time the user presses enter
//has total_Score to add up the score after every roll
void Dice::Rolls()
{
	die1 = 0;
	total_Rolls++;

	die1 = random_Number_Gen();
	
	total_Score += die1;
}

//score() just returns the total score so that it may be used in main with Dice objects
int Dice::score()
{
	return total_Score;
}

//Display() just displays the random number being die and the amount of rolls that transpired
void Dice::Display()
{
	cout << "Roll was a: " << die1 << endl;
	cout << "Total amount of Rolls: " << total_Rolls << endl;
}

//dice_Faces1() prints out the corresponding die face to the random number die
void Dice::dice_Faces1()
{
	switch (die1)
	{
	case 1:
cout << "- - - - -" << endl;
cout << "|        |" << endl;
cout << "|    O   |" << endl;
cout << "|        |" << endl;
cout << " - - - - -" << endl;

break;

	case 2:
cout << "- - - - -" << endl;
cout << "|    O   |" << endl;
cout << "|        |" << endl;
cout << "|    O   |" << endl;
cout << " - - - - -" << endl;

break;

	case 3:
cout << "- - - - -" << endl;
cout << "|    O   |" << endl;
cout << "|    O   |" << endl;
cout << "|    O   |" << endl;
cout << " - - - - -" << endl;

break;
	
	case 4:
cout << "- - - - -" << endl;
cout << "|   O O  |" << endl;
cout << "|        |" << endl;
cout << "|   O O  |" << endl;
cout << " - - - - -" << endl;

break;

	case 5:
cout << "- - - - -" << endl;
cout << "|   O O  |" << endl;
cout << "|    O   |" << endl;
cout << "|   O O  |" << endl;
cout << " - - - - -" << endl;

break;

	case 6:
cout << "- - - - -" << endl;
cout << "|   O O  |" << endl;
cout << "|   O O  |" << endl;
cout << "|   O O  |" << endl;
cout << " - - - - -" << endl;

break;
	}
	
}

//function main; returns int value
//where the program officially starts
int main()
{
	//for the loop
	string answer;
	//loop to start the game over
	do
	{
	//used to seed the random generator properly
	srand(time(0));
	//objects for Dice class
	Dice user, computer;

	cout << "Welcome to the Dice Game!!!" << endl;
	cout << "You will be competing against the computer!" << endl;
	cout << "There will be 6 rolls; whoever has the most at the last roll, wins!!!";
	cin.get();
	system("cls");

 
	//for loop that runs 6 times for the dice rolls
	for (int i = 0; i < 6; i++)
	{
	
	//the user has its own member function using the dot operator
	user.Rolls();
	cout << "User's die:" << endl;
	user.dice_Faces1();
	user.Display();
	cout << "Total score is: " << user.score() << endl;
	cout << endl;
	
	//the computer has its own member functions using the dot operator
	computer.Rolls();
	cout << "Computer's die:" << endl;
	computer.dice_Faces1();
	computer.Display();
	cout << "Total score is: " << computer.score() << endl << endl;

	
	//conditional statement regaring the score for user vs. the computer
	if (user.score() > computer.score())
	{
		cout << "You are winning!" << endl;
	}
	else if (user.score() < computer.score())
	{
		cout << "The computer is winning..." << endl;
	}
	else
	{
		cout << "It seems to be a tie." << endl;
	}
	//a new way to stop the console; supposedly better on the system
	cin.get();
	//clears the screen
	system("cls");

	}
	
	//allows the user to go again if they desire
	cout << "Would you like to go again? (Yes/No):" << endl;
	cin >> answer;

	}while(answer == "Yes" || answer == "yes");
	

return 0;
}

