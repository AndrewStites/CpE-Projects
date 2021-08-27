public class Car{
//instance variables(fields)
private int yearModel;
private String make;
private int speed;

//accessors
public int getYearModel(){
	return yearModel;
}

public String getMake(){
	return make;
}

public int getSpeed(){
	return speed;
}

//mutators
public void accelerate(){
	speed += 5;
}

public void brake(){
	speed -= 5;
}

//constructor
public Car(int yearModelGiven, String makeGiven){
	yearModel = yearModelGiven;
	make = makeGiven;
	speed = 0;
}

}