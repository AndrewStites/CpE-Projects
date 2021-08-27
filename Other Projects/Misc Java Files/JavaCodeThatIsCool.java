File f1 = new File(file1);
File f2 = new File(file2);
File f3 = new File(file1 + "-" + file2);
Scanner s1 = new Scanner(f1);
Scanner s2 = new Scanner(f2);
PrintWriter pw = new PrintWriter(f3);
while (s1.hasNext()) {
    pw.println(s1.nextLine());
    pw.println(s2.nextLine());

}
pw.close();

/*There are two text files, whose names are given by two String variables, file1 and file2. These text files have the same number of lines.
Write a sequence of statements that creates a new file whose name consists concatenating the names of the two text files (with a "-" in the middle)
and whose contents of merging the lines of the two files. Thus, in the new file, the first line is the first line from the first file,
the second line is the first line from the second file. The third line in the new file is the second line in the first file and the fourth line is the second line from the second file,
and so on. When finished, make sure that the data written to the new file has been flushed from its buffer and that any system resources used during the course of running your code have been released.
(Do not concern yourself with any possible exceptions here-- assume they are handled elsewhere.)*/

for (char i='a'; i<='e'; i++)
for (char j='a'; j<='e'; j++) {
System.out.print(i);
System.out.println(j);
}
/*Write a loop that displays all possible combinations of two letters where the letters are 'a', or 'b', or 'c', or 'd', or 'e'. The combinations should be displayed in ascending alphabetical order:

aa
ab
ac
ad
ae
ba
bb
...
ee
*/

for (i = 1; i <= n; i++)
{
for (j = 1; j <= i; j++)
{
System.out.print("*");
}
System.out.println();
}

/* Assume that the int variables i and j have been declared, and that n has been declared and initialized.

Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen. */

int numberOfTimesheets;
int centsPerHour = 0;
int hoursWorked;
total = 0;
numberOfTimesheets = stdin.nextInt();
for(int i = 1; i <= numberOfTimesheets; i++)
{
hoursWorked = 0;
centsPerHour = stdin.nextInt();
for (int ii = 1; ii <= 5; ii++)
{
hoursWorked = hoursWorked + stdin.nextInt();
}
total = total + (hoursWorked * centsPerHour);
}

/* Assume the input data is structured as follows: first there is a non-negative integer specifying the number of employee timesheets to be read in. This is followed by data for each of the employees. The first number for each employee is an integer that specifies their pay per hour in cents. Following this are 5 integers, the number of hours they worked on each of the days of the workweek. Given this data, and given that an int variable total has been declared, write a loop and any necessary code that reads the data and stores the total payroll of all employees in total. Note that you will have to add up the numbers worked by each employee and multiply that by that particular employee's pay rate to get the employee's pay for the week-- and sum those values into total.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input. */

int number = 1;
int oddTotal, evenTotal, oddCount, evenCount;
oddTotal = evenTotal = oddCount = evenCount = 0;
while (stdin.hasNextInt() && number > 0)
{
number = stdin.nextInt();
if (number % 2 == 0 && number > 0)
{
evenTotal += number;
evenCount += 1;
}
if (number % 2 != 0 && number > 0)
{
oddTotal += number;
oddCount += 1;
}
}
System.out.println(evenTotal + " " + oddTotal + " " + evenCount + " " + oddCount);

/*Write a loop that reads positive integers from standard input and that terminates when it reads an integer that is not positive. After the loop terminates, it prints out, on a line by itself and separated by spaces, the sum of all the even integers read, the sum of all the odd integers read, a count of the number of even integers read, and a count of the number of odd integers read, all separated by at least one space. Declare any variables that are needed.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.*/

do
{
response = stdin.next();
}
while (!response.equals("Y") && !response.equals("y") && !response.equals("N") && !response.equals("n"));

/*Given a String variable response that has already been declared, write some code that repeatedly reads a value from standard input into response until at last a Y or y or N or n has been entered.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.*/

File fileInput = new File("poem");
Scanner scan = new Scanner(fileInput);
line1 = scan.nextLine();


/*Given a String variable named line1, write a sequence of statements that use a Scanner to read the first line of a file named "poem" and stores i in line1.
(Do not concern yourself with any possible exceptions here-- assume they are handled elsewhere.)*/


int land = 0;
int air = 0;
int water = 0;
String usersays = " ";
while (!(usersays.equals("xxxxx"))){

if (usersays.equals("land")){

land ++;
}

else if (usersays.equals("air")){

air ++;

}
else if (usersays.equals("water")){

water ++;
}
usersays = stdin.next();
}

System.out.println("land:" + land);
System.out.println("air:" + air);
System.out.println("water:" + water);


/*Write a loop that reads strings from standard input where the string is either "land", "air", or "water". The loop terminates when "xxxxx" (five x characters) is read in. Other strings are ignored. After the loop, your code should print out 3 lines: the first consisting of the string "land:" followed by the number of "land" strings read in, the second consisting of the string "air:" followed by the number of "air" strings read in, and the third consisting of the string "water:" followed by the number of "water" strings read in. Each of these should be printed on a separate line.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.*/

