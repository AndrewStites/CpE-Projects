/******************************************************************************
Program Name: The Wattage Calculator
Created Date: 2/4/17
Created By: Andrew Stites
Purpose: To find the wattage price of a device
*******************************************************************************/

#include <iostream>
#include <iomanip>
#include <time.h>
#include <string>
using namespace std;

/******************************************************************************
Function Name: main()
Parameters: None
Return Value: Int
Acknowledgements: Book, and a lot from Google 
*******************************************************************************/

//structure regarding any robot that is needed in the program
//has all the necessary components that a robot needs in the is battle
struct  Robot
	{
	string Robot_Name;
	int health_Points;
	int damage_Points;
	int wins;
	int losses;
	};

//int is the type of data that will be returning
//main() is the function for this block
int main()
{
	//A char variable for the most outer loop to start all over again
	char startOver;

	//Do while loop for starting over entirely
	do
	{
	//Used a system command to clear the screen for the next bout
	//Utilized two constants for the output data
	//Used srand(time(0)) to seed the random function
	//Initialized the string for the computer robot
	//Initialized the structures with their respectful names
	system("cls");
	const int column_Widths = 32;
	const int column_Widths_Two = 10;
	srand(time(0));
	string WallE = "Wall-E";
	Robot Computer, User;

	//A char variable for the middle loop to go again with the same stats
	char answer;
	
	//All the components of the structure connected to the computer's robot
	//Utilized '.' operator to connect to the structure
	Computer.Robot_Name = WallE;
	Computer.health_Points = 100;
	Computer.damage_Points = rand() % 100 + 1;
	Computer.wins = rand() % 9 + 1;
	Computer.losses = rand() % 9 + 1;

	//Used cout object to ask the user robot name
	//Used cin object to capture it
	//All the components of the structure connected to the User's robot byt '.' operator
	//Used system command to clear the screen for the following display of information
	cout << "What is your robot's name? (Only one word): " << endl;
	cin >> User.Robot_Name;
	User.health_Points = 100;
	User.damage_Points = rand() % 100 + 1;
	User.wins = 0;
	User.losses = 0;
	system("cls");

	//Do while loop used for starting a new battle between same robots
	do
	{
		//Used system command to clear the screen
		//Reset the computer and the user's health to 100
		system("cls");
		User.health_Points = 100;
		Computer.health_Points = 100;

		//Used 'setw()' library function to align the strings for output
		//Used 'setiosflags()' manipulator to right justify variables
		//Used constants where applicable
		//Used system command to pause the screen for viewing pleasures
		cout << setw(26) << right << Computer.Robot_Name << endl
		<< setw(column_Widths) << left << "Health Points:" << setw(column_Widths_Two) << setiosflags(ios::right) << Computer.health_Points << endl
		<< setw(column_Widths) << left << "Damage Points:" << setw(column_Widths_Two)  << setiosflags(ios::right) << Computer.damage_Points<< endl
		<< setw(column_Widths) << left << "Wins:" << setw(column_Widths_Two) << setiosflags(ios::right) << Computer.wins << endl
		<< setw(column_Widths) << left << "Losses:" << setw(column_Widths_Two) << setiosflags(ios::right) << Computer.losses << endl;
	cout << "--------------------------------------------\n";
	cout << setw(26) << right << User.Robot_Name << endl
		<< setw(column_Widths) << left << "Health Points:" << setw(column_Widths_Two) << setiosflags(ios::right) << User.health_Points << endl
		<< setw(column_Widths) << left << "Damage Points:" << setw(column_Widths_Two)  << setiosflags(ios::right) << User.damage_Points<< endl
		<< setw(column_Widths) << left << "Wins:" << setw(column_Widths_Two) << setiosflags(ios::right) << User.wins << endl
		<< setw(column_Widths) << left << "Losses:" << setw(column_Widths_Two) << setiosflags(ios::right) << User.losses << endl << endl;
	system("pause");
		
		//Do while loop that goes through all the attacks until one robot's health is 0
		do
		{
			//Used a random generator to pick turns
			//Used a random generator for damage points depending on robot's official damage points
			int turn = rand() % 2;
			int computer_Damage_Rand = rand() % (Computer.damage_Points + 1);
			int user_Damage_Rand = rand() % (User.damage_Points + 1);
		
			//Used to display the winner altogether 
			if (User.health_Points <= 0)
			{
				//Used cout object to declare computer is the winner
				//Used a break command to stop further productions
				cout << Computer.Robot_Name << " is the winner!!!" << endl; 
				break;
			}
			//Same as above, but user is the winner
			else if (Computer.health_Points <= 0)
			{
				cout << User.Robot_Name << " is the winner!!!" << endl;
				break;
			}
			//Determines which robot goes first
			//0 == computer; 1 == User
			else if (turn == 0) 
			{
				//Used cout object to display which robot attacks and the amount of damage
				//Subtracted damage from users health
				cout << Computer.Robot_Name << " attacks! " << computer_Damage_Rand << " point damage! " << endl;
				User.health_Points -= computer_Damage_Rand;
				//Used a if then statement to print 0 out if User's health was <=
				if (User.health_Points <= 0)
				{
					//Displays user's as 0
					cout << User.Robot_Name << "'s health points: " << 0 << endl;
				}
				else if (Computer.health_Points <= 0)
				{
					//Displays computer's as 0
					cout << Computer.Robot_Name << "'s health points: " << 0 << endl << endl;
				}
				else
				{
					//Displays user's health points
					cout << User.Robot_Name << "'s health points: " << User.health_Points << endl;
				}

				if (Computer.damage_Points > 0)
				{
					//Displays computer's health points
					cout << Computer.Robot_Name << "'s health points: " << Computer.health_Points << endl << endl;
				}
				//Separate if statment to make sure that the computer always prints underneath the user's
			}
			//Determines which robot goes first
			//0 == computer; 1 == User
			else if (turn == 1) 
			{
				//Used cout object to display which robot attacks and the amount of damage
				//Subtracted damage from computer's health
				cout << User.Robot_Name << " attacks! " << user_Damage_Rand << " point damage! " << endl;
				Computer.health_Points -= user_Damage_Rand;
				//Used a if then statement to print 0 out if Computer's health was <=
				if (Computer.health_Points <= 0)
				{
					//Displays the computer's health is 0
					//Displays the user's health first then the computer's
					cout << User.Robot_Name << "'s health points: " << User.health_Points << endl;
					cout << Computer.Robot_Name << "'s health points: " << 0 << endl << endl;
				}
				else if(User.health_Points <= 0) 
				{
					//Displays user's health points as 0
					cout << User.Robot_Name << "'s health points: " << 0 << endl;
				}
				else
				{
					//Displays user's health points
					cout << User.Robot_Name << "'s health points: " << User.health_Points << endl;
				}

					//Displays the computer's health as 0
				if (Computer.health_Points > 0)
				{
					//Displays the computer's health points at the end for sure
					cout << Computer.Robot_Name << "'s health points: " << Computer.health_Points << endl << endl;
				}
			}
		
			//Stops the loop when one of the robot's healt is 0
			}while (Computer.health_Points != 0 || User.health_Points != 0);
			
			//Gives a win to user and a loss to computer
			if (User.health_Points > 0)
			{
				User.wins++;
				Computer.losses++;
			}
			//Gives a win to computer and a loss to user
			else
			{
				User.losses++;
				Computer.wins++;
			}
			//Used cout object to go again
			//Used cin object to capture answer
			cout << "Go again? (y/n): " << endl;
			cin >> answer;
		//Determines whether to go again
		}while (answer == 'y' || answer == 'Y');

		//Used cout object to ask to start over
		//Used cin object to capture answer
		cout << "Start over? (y/n): " << endl;
		cin >> startOver;
	//Determines whether to start completely over
	}while (startOver == 'y' || startOver == 'Y');
//"this was successful"
return 0;
}