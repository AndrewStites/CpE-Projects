public class BankAccountConstructor {

   public static void main(String[] args) {

       BankAccount ba = new BankAccount();
       System.out.println(ba);


       BankAccount ba2 = new BankAccount(25000);
       System.out.println(ba2);


       BankAccount ba3 = new BankAccount(ba2);
       System.out.println(ba3);

   }
}