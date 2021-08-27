package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
        Account andrewAccount = new Account("Andrew");
        andrewAccount.deposit(1000);
        andrewAccount.withdraw(500);
        andrewAccount.withdraw(-200);
        andrewAccount.deposit(-20);
        andrewAccount.calculateBalance();


        System.out.println("Balance on account is " + andrewAccount.getBalance());


    }
}
