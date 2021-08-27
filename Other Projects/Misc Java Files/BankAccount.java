public class BankAccount
{
//private data field
private double balance;
/**
constructor for a new account with no deposit
*/
public BankAccount()
{
balance = 0.0;
}
/**
copy constructor for a new account with balance from the other account
*/
public BankAccount(BankAccount ba)
{
   this.balance = ba.getBalance(); // setting the balance of current object to the other object's balance
}
/**
constructs a bank account with a given balance
@param a double representing the new balance
*/
public BankAccount(double d)
{
balance = d;
}
/**
make a deposit to the account and update the balance
@param a double representing the new deposit amount
*/
public void deposit(double d)
{
balance += d;
}
/**
withdraw specified amount of money
assumes that specified amount is in account
@param double for the amount to withdraw
*/
public void withdraw(double d)
{
balance -= d;
}
/**
gets the amount currently in the account
@return the current balance
*/
public double getBalance()
{
return balance;
}
/**
@returns the BankAccount in the form of a String
*/
public String toString()
{
return "Balance: $"+ balance;
}
/**
@returns true if this BankAccount is equal to the BankAccount param
@BankAccount to be compared with this BankAccount
*/
public boolean equals(BankAccount ba)
{
return this.balance == ba.balance; // equals comparison happens with the current object and the object within the parenthesis
}
// end of class
}