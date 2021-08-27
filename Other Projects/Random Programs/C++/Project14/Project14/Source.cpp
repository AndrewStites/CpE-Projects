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
{}

void Dice::Roll()
{
	last_Roll = 0;
	total_Rolls++;

	last_Roll = rand() % 6 + 1;

	total_Score += last_Roll;

}

void Dice::Display()
{
	cout << "Your last roll was " << last_Roll << endl;
	cout << "You have rolled " << total_Rolls << endl;
	cout << "Your total score is " << total_Score << endl << endl;

}

int main()
{
	srand(time(0));
	Dice user;

	user.Display();

	
	for (int i = 0; i < 5; i++)
	{
	user.Roll();
	user.Display();
	}


cin.get();
return 0;
}