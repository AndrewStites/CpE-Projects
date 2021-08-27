#include <iostream>
using namespace std;

const int MAX = 4;

 

int main() {

       int Pic[MAX];

 

       for (int count = 0; count < MAX; count++) {

             Pic[count] = count * 2;

       }

 

       for (int itor = 0; itor < MAX; itor++) {

             cout << Pic[itor] << endl;

       }

 

       system("pause");

       return 0;

}