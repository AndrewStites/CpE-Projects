#include <iostream>
#include <iomanip>
#include <string>
#include <time.h>
using namespace std;

int printWelcome(int&);
int randomGen();

struct Box
{
string prize;
};

int main()
{

	srand(time(0));
	Box Box1, Box2, Box3;
	int user_Choice;
	string thing_In_Box, temp, temp1, temp2;
	int computer_Choice;
	printWelcome(user_Choice);

	computer_Choice = rand() % 3 + 1;

	int num;
	
	switch(randomGen())
	{
	case 0: thing_In_Box = "1 MILLION DOLLARS!!!"; break;
	case 1: thing_In_Box = "Red Snapper"; break;
	}

	Box1.prize = thing_In_Box;
	Box2.prize = thing_In_Box;
	Box3.prize = thing_In_Box;

	switch(user_Choice)
	{
	case 1: temp = Box1.prize;
	case 2: temp1 = Box2.prize;
	case 3: temp2 = Box3.prize;
	}

	if(user_Choice == 1 && randomGen() == 0)
	{
		Box1.prize = "1 Million Dollars!";
		Box2.prize = "Red Snapper";
		Box3.prize = "Red Snapper";
	}
	else if(user_Choice == 2 && randomGen() == 0)
	{
		Box1.prize = "Red Snapper";
		Box2.prize = "1 Million Dollars!";
		Box3.prize = "Red Snapper";
	}
	else if(user_Choice == 3 && randomGen() == 0)
	{
		Box1.prize = "Red Snapper";
		Box2.prize = "Red Snapper";
		Box3.prize = "1 Million Dollars!";
	}
	

	cout << temp << endl;
	cout << temp1 << endl;
	cout << temp2 << endl;
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

int randomGen()
{
	int num;
	num = rand() % 3;
	return num;
}

int printOut(int user_Choice)
{
	if(user_Choice)
	{
			
	
	}
	return 0;
}