public class CarClassTest{
	public static void main(String[]args){

	Car batmobile = new Car(1966, "Batmobile");

	System.out.println("Accelerating, Batman!");
		for (int seconds = 1; seconds <= 5; seconds++){

			batmobile.accelerate();

			System.out.println("Holy smokes, Batman! The " + batmobile.getYearModel() + " " + batmobile.getMake() + " is going " + batmobile.getSpeed() + " mph!");

		}

	System.out.println("\nBraking, Batman!");
		for (int seconds = 1; seconds <= 5; seconds++){

			batmobile.brake();

			System.out.println("Lemony snicket, Batman! The " + batmobile.getYearModel() + " " + batmobile.getMake() + " is going " + batmobile.getSpeed() + " mph!");

		}

	}

}