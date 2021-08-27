#include <iostream>
#include <cstdlib>
#include <time.h>
using namespace std;

class Dice {
public:
	Dice();
	void Roll();
	void Display();
private:
	int last_Roll;
	int total_Rolls;
	int total_Score;
};

Dice::Dice() : last_Roll(0), total_Rolls(0), total_Score(0)
{ }

void Dice::Roll()
{
	last_Roll = 0;
	total_Rolls++;

	last_Roll = rand() % 6 + 1;

	total_Score += last_Roll;

}

int main()
{
	srand(time(0));
	Dice user;
	
	int user_Total = 0, com_Total = 0;
	

	if (Roll() == 1)
	{
cout << "- - - - -" << endl;
cout << "|        |" << endl;
cout << "|    O   |" << endl;
cout << "|        |" << endl;
cout << " - - - - -" << endl;
	}
	else if (user.roll() == 2)
	{
cout << "- - - - -" << endl;
cout << "|    O   |" << endl;
cout << "|        |" << endl;
cout << "|    O   |" << endl;
cout << " - - - - -" << endl;
	}
	else if (user.roll() == 3)
	{
cout << "- - - - -" << endl;
cout << "|    O   |" << endl;
cout << "|    O   |" << endl;
cout << "|    O   |" << endl;
cout << " - - - - -" << endl;
	}
	else if (user.roll() == 4)
	{
cout << "- - - - -" << endl;
cout << "|   O O  |" << endl;
cout << "|        |" << endl;
cout << "|   O O  |" << endl;
cout << " - - - - -" << endl;
	}
	else if (user.roll() == 5)
	{
cout << "- - - - -" << endl;
cout << "|   O O  |" << endl;
cout << "|    O   |" << endl;
cout << "|   O O  |" << endl;
cout << " - - - - -" << endl;
	}
	else if (user.roll() == 6)
	{
cout << "- - - - -" << endl;
cout << "|   O O  |" << endl;
cout << "|   O O  |" << endl;
cout << "|   O O  |" << endl;
cout << " - - - - -" << endl;
	}

	

	if (user.roll() == 1)
	{
		user_Total++;
	}
	else if (user.roll() == 2)
	{
		user_Total = user_Total + 2;
	}
	else if (user.roll() == 3)
	{
		user_Total = user_Total + 3;
	}
	else if (user.roll() == 4)
	{
		user_Total = user_Total + 4;
	}
	else if (user.roll() == 5)
	{
		user_Total = user_Total + 5;
	}
	else
	{
		user_Total = user_Total + 6;
	}

	cout << endl << user.roll();
	cout << endl << user_Total;

	cin.get();
	return 0;
}
