/******************************************************************************
Program Name: Crytography
Created Date: 5/17/17
Created By: Andrew Stites
Purpose: To encrypt/decrypt 
*******************************************************************************/
#include <iostream>
#include <string>
using namespace std;
/******************************************************************************
Function Name: main()
Parameters: none
Return Value: Int
Acknowledgements: Book, Google, Youtube 
*******************************************************************************/

//This is the class
class Cipher
{
private:
	string message;
	int shift;
public:
	//Encodes the messages given to it
	void Encode()
	{
		//Initializes the string from private for this member function
		message;
		//This gets data from the user; without it, the program will not take a message
		cin.ignore();
		cout << "Enter in your string for encryption: " << endl;
		//Stores string as a whole
		getline(cin, message);
		cout << "Your encryption is: ";
		/*This loop converts the message into an amoutn of letters, checks what each individual letter is on the ascii chart, applies the shift
		Then prints it back out as the encrypted message*/
		for (int i = 0, n = message.length(); i < n; i++)
		{
			//Everything below was appropriated from youtube
			if (isalpha(message[i]))
			{
				int offset = 65;
				if (islower(message[i]))
					offset = 97;

				int cipherletter = (((int)message[i] - offset + shift) % 26) + offset;
				cout << (char)cipherletter;
			}
			else
				//This presents the message without any modification due to no shift value
				cout << message[i];

		}
	}

	//This function is for the "shifting" of letters with the int value given by the user
	void Shift()
	{
		cout << "Shift Value (0-25)?: " << endl;
		cin >> shift;
			//Used a while loop to infinitely loop if the user inputs a invalid number
			/*Originally had a do while loop with a if statment, but that is too much text and the do while loop always runs
			no matter what*/
			while(shift < 0)
			{
				cout << "Invalide number. Try again" << endl;
				cin >> shift;
			};

		

	}

	//Decodes the message given
	void Decode()
	{
		/*This is the Encode() member function just with a few changes, which is the math in the cipher letter
		down below in the for loop*/
		message;
		cin.ignore();
		cout << "Enter in your string for decryption: " << endl;
		getline(cin, message);
		cout << "Your decryption is: ";
		for (int i = 0, n = message.length(); i < n; i++)//
		{
			if (isalpha(message[i]))
			{
				int offset = 65;
				if (islower(message[i]))
					offset = 97;

				int cipherletter = (((int)message[i] - offset + 26 - shift) % 26) + offset;
				cout << (char)cipherletter;
			}
			else
				cout << message[i];
			

		}
	}
};


int main()
{
	//This is the class and the object
	Cipher test;
	//Trying to implement boolean values into my code
	bool goAgain = true;
	//This string is for the first question asked to the user
	string answer;


	cout << "Welcome to Cryptography Inc." << endl;
	do
	{
		cout << "Would you like to Encode, Decode, or Quit?: ";
		cin >> answer;

		//These conditional statements allow for the next step regarding the string answer
		if (answer == "Quit")
		{
			goAgain = false;
			system("exit");
		}	
		else if (answer == "Encode")
		{
			test.Shift();
			test.Encode();
		}
		else if (answer == "Decode")
		{
			test.Shift();
			test.Decode();
		}

		//Stops the console for viewing pleasures
		cin.get();
		//Clears the scren
		system("cls");

	//Part of the do while loop and used because it always runs at least once
	}while (goAgain);

	return 0;
}
