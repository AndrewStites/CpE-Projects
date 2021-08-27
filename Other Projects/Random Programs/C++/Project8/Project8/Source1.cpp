#include <iostream>
#include <time.h>
#include <string>
using namespace std;

int printWelcome(int&);

int main()
{

	srand(time(0));
	int user_Choice;
	int user_Choice2;
	string textMate, textMate2;
	int winningNum;
	int computer_Choice = rand() % 3 + 1;


	do
	{
		printWelcome(user_Choice);

		if (user_Choice > 3 || user_Choice < 1)
		{
			cout << "Please input a box #" << endl;
		}
	} while (user_Choice > 3 || user_Choice < 1);
	


	winningNum = rand() % 3 + 1;
	int tempBo

	
	if (computer_Choice == 1 && user_Choice == 1)
		{
			computer_Choice++;
		}
		else if (computer_Choice == 2 && user_Choice == 2)
		{
			computer_Choice++;
		}
		else if (computer_Choice == 3 && user_Choice == 3)
		{
			computer_Choice--;
		}

	if (computer_Choice == 1 && winningNum == 1)
		{
			computer_Choice++;
		}
	else if (computer_Choice == 2 && winningNum == 2)
		{
			computer_Choice++;
		}
	else if (computer_Choice == 3 && winningNum == 3)
		{
			computer_Choice--;
		}
	


	cout << "You chose box number " << user_Choice << "..." << endl;
	cout << "Let's take a gander at box number " << computer_Choice << "..." << "A Red Snapper!" << endl;
	system("pause");

	if (computer_Choice == 1)
	{
		textMate = "Box 1";
	}
	else if (computer_Choice == 2)
	{
		textMate = "Box 2";
	}
	else if (computer_Choice == 3)
	{
		textMate = "Box 3";
	}

	if (user_Choice == 1)
	{
		textMate2 = "Box 1";
	}
	else if (user_Choice == 2)
	{
		textMate2 = "Box 2";
	}
	else if (user_Choice == 3)
	{
		textMate2 = "Box 3";
	}

	
	system("cls");
	cout << "Do you want to stay with your old choice or go with the new box?:" << endl;
	cout << textMate << endl << textMate2 << endl;
	cin >> user_Choice2;

	system("pause");

	if (user_Choice2 == winningNum)
	{
		cout << "You won the Million Dollars!";
	}
	else
	{
		cout << "You lost!";
	}
	
	cout << user_Choice << endl << computer_Choice << endl << winningNum << endl;
	system("pause");


	return 0;
}

int printWelcome(int& user_Choice)
{
	cout << "Welcome to the Grand Box Game!!!\t\t\t\t\t\t";
	system("pause");

	cout << "You have a chance to win 1 Million Dollars by choosing the correct box!\t\t";
	system("pause");

	cout << "There are three boxes in total; choose wisely!\t\t\t\t\t";
	system("pause");

	cout << "So, which box do you think is the Million Dollar Box?:";
	cout << "\nBox Number 1?" << endl << "Box Number 2?" << endl << "or Box Number 3?(input 1, 2, or 3)";
	cin >> user_Choice;

	system("pause");

	return user_Choice;
}
