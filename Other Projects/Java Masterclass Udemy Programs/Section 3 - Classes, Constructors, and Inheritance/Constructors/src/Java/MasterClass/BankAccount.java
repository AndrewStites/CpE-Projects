package Java.MasterClass;

public class BankAccount {

    private String accountNum;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNum;

    //Constructor
    //Can be overloaded
    public BankAccount()
    {
        //This is called when the constructor in Main has nothing in its parameters
        //Has to be the first in the scope of the code block
        this("123456", 2.50, "Defautl Name", "Default Email", "Default Phone");
        System.out.println("Empty constructor called");
    }

    //This actually updates all the fields
    //This is the main constructor
    public BankAccount(String accountNum, double balance, String customerName, String email, String phoneNum)
    {
        System.out.println("Constructor called with parameters");

        //anther way to set the accountNum
        //This way is more risky due to relying on the construction of the method
        //It could have operators that affect it for instance
        //setAccountNum(accountNum);

        this.accountNum = accountNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public BankAccount(String customerName, String email, String phoneNum) {
        this("99999", 100.55, customerName, email, phoneNum);
    }

    public void setAccountNum(String accountNum)
    {
        this.accountNum = accountNum;
    }

    public String getAccountNum()
    {
        return this.accountNum;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum()
    {
        return this.phoneNum;
    }

    public void depositFund(double deposit)
    {
        this.balance += deposit;
        System.out.println("New Balance = $" + this.balance);
    }

    public void withdrawalFund(double withdraw)
    {
        if(this.balance - withdraw < 0)
        {
            System.out.println("Insufficient Funds." + " Only $" + this.balance + " is available.");
        }
        else {
            this.balance -= withdraw;
            System.out.println("Remaining Balance = $" + this.balance);
        }
    }
}
