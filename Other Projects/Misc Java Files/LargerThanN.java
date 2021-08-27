import java.util.Scanner;

public class LargerThanN {

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int num[] = new int[5];

       for(int i=0; i<num.length; i++){
       		System.out.print("Enter integer "+(i+1)+": ");
	   		    num[i] = scan.nextInt();
       }

       System.out.println("Enter a number n: ");
       		int n= scan.nextInt();

       displayLargeNumbers(num,n);
   }

   public static void displayLargeNumbers(int array[], int n){
       for(int i = 0; i < array.length; i++){
           if(n < array[i]){
               System.out.print(array[i]+" ");
           }
       }
       System.out.println();
   }
}