#include <iostream>
using namespace std;

void Test(int First, char Second = '$')
{
   for(int Count = First; Count > 0; Count--)
   {
      cout << Second;
   }
   cout << endl;
   system("pause");
}

int main()
{
   Test(2, '#');
   Test(4);

   return 0;
}

