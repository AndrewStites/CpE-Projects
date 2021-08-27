package Java.MasterClass;

public class Main {

    public static void main(String[] args) {

        //Instead of using the setters methods below
        //We can just use this constructor to initialize all the data
        BankAccount dudeAccount = new BankAccount("1234", 0, "Bob Brown", "ppoop@yahoo.com", "555-555-5556");

        //These are redundant now due to the constructor
//        dudeAccount.setAccountNum("1234 5678 9101 1121");
//        dudeAccount.setBalance(50);
//        dudeAccount.setCustomerName("Andrew Stites");
//        dudeAccount.setEmail("123@yahoo.com");
//        dudeAccount.setPhoneNum("530-555-5555");

//        System.out.println(dudeAccount.getAccountNum());
//        System.out.println(dudeAccount.getBalance());
//
//        dudeAccount.withdrawalFund(100.0);
//
//        dudeAccount.depositFund(50.0);
//        dudeAccount.withdrawalFund(100.0);
//
//        dudeAccount.depositFund(51.0);
//        dudeAccount.withdrawalFund(100.0);
//
//        BankAccount timsAccount = new BankAccount("Tim", "tim@gmail.com", "123456");
//        System.out.println(timsAccount.getAccountNum() + " name " + timsAccount.getCustomerName());

        VipCustomer Andrew = new VipCustomer(100000, "Fuku@gmail.com");
        System.out.println(Andrew.getCreditLimit());
        System.out.println(Andrew.getName());
        System.out.println(Andrew.getEmail());


    }
}
