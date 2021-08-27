#include <iostream>
#include <time.h>
using namespace std;

int main()
{
	srand(time(0));
	int user = 3;
	int computer = rand() % 3 + 1;
	int temp = rand() % 3 + 1;

	do
	{
		computer = rand() % 3 + 1;
		temp = rand() % 3 + 1;
	
	}while(user == 1 && computer == 1 ||
		   user == 1 && temp == 1	  ||
		   temp == 1 && computer == 1 
					||
		   user == 2 && computer == 2 ||
		   user == 2 && temp == 2	  ||
		   temp == 2 && computer == 2 
					||
		   user == 3 && computer == 3 ||
		   user == 3 && temp == 3	  ||
		   temp == 3 && computer == 3);
	cout << user << computer << temp;
	system("pause");
return 0;
}