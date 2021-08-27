import java.util.Scanner;

public class LandTractTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LandTract t1 = new LandTract();
		LandTract t2 = new LandTract();

		System.out.print("Enter length of first land tract:");
			t1.length = input.nextInt();

		System.out.print("Enter width of first land tract:");
			t1.width = input.nextInt();

		System.out.print("Enter length of Second land tract:");
			t2.length = input.nextInt();

		System.out.print("Enter width of Second land tract:");
			t2.width = input.nextInt();

		System.out.println(t1.toString() + " and area "+t1.area());
		System.out.println(t2.toString() + " and area "+t2.area());
		System.out.println(t1.equals(t2)?"The two tracks have the same size":"The two tracks don not have the same size");
}
}