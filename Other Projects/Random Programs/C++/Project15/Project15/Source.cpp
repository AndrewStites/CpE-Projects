#include <iostream> 
#include <string> 

using namespace std; 

int main()
{
    string test;

    cout << "This program encodes a message in Caesar Cipher. \n\n"; 

    cout << "Please enter a message: "; 
	getline(cin, test);  

	cout << test.length();

	cin.get();


    return 0;
}