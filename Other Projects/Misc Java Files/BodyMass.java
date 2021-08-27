/*
	Programmer: Andrew Stites
	Date:	    04/28/15
	Filename:   BodyMass.java
	Course #:   CIS2
	Purpose:    This project calculates the body mass index based
		    on a person's height and weight.
*/

import java.io.*; //can now allow input and output pg.80 and 137

public class BodyMass
{
	public static void main (String[] args) throws IOException // method header pg 67--throws IOException pg 137
	{
		//Declare and construct our variables
		String height, weight; //Declaring variables pg 140, 141
		int inches, pounds; //Declaring variables pg 140, 141
		double kilograms, meters, index;
		BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in)); //BufferedReader and InputStremReader classes pg 144

		//Print prompts and get input from user
		System.out.println("Our Body Mass Index Calculator");
		System.out.println();
		System.out.println("\tEnter your height to the nearest inch: ");
			height = dataIn.readLine(); //pg 147, readLine() Method
			inches = Integer.parseInt(height); // it is possible to "parse"-148 any "Data Types"-pg 140
		System.out.println("\tEnter your weight to the nearest pound:");
			weight = dataIn.readLine();
			pounds = Integer.parseInt(weight);

		//Math Section Calculations and Stuff
		meters = inches / 39.36; ///Arithmetic operators are on pg 151
		kilograms = pounds / 2.2;
		index = kilograms /Math.pow(meters,2);//pow()Method of Math Class is used for exponents is on pg 160

		//Output and Stuff
		System.out.println();
		System.out.println("\t Your Body Mass Index is: " + Math.round(index) + "."); //Math.round class method is on 160

	}


}
