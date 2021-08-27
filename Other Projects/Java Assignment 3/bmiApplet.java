/*
	Programmer: Andrew Stites
	Date:	    5/9/15
	Filename:   bmiApplet.java
	Course:     CIS2
	Purpose:    To calulate a person's BMI.
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class bmiApplet extends Applet implements ActionListener
{
	//variables
	int inches, pounds;
	double kilograms, meters, index;

	//This part creates the elements that displays on the monitor, e.g. text fields
	Label companyLabel = new Label ("The Super Duper Body Mass Index Calculator\n\n");
	Label heightLabel = new Label ("Enter your height to the nearest inch: ");
		TextField heightField = new TextField (10);
	Label weightLabel = new Label ("Enter your weight to the nearest pound: ");
		TextField weightField = new TextField (10);
	Button calcButton = new Button ("Calculate");
	Label outputLabel = new Label ("Click the Calculate button to see your body mass index");

	//projects it on the monitor with color of your choice
	public void init()
	{
		setForeground (Color.green);
		setBackground (Color.black);
		add(companyLabel);
		setForeground (Color.yellow);
		add(heightLabel);
		add(heightField);
		add(weightLabel);
		add(weightField);
		setForeground (Color.red);
		add(calcButton);
		setForeground (Color.green);
		calcButton.addActionListener(this);
		add(outputLabel);
	}
	//mechanics behind the program that calculates the BMI, i.e. math
	public void actionPerformed (ActionEvent e)
	{
		inches = Integer.parseInt (heightField.getText());
		pounds = Integer.parseInt (weightField.getText());
		meters = inches / 39.36;
		kilograms = pounds / 2.2;
		index = kilograms / Math.pow(meters,2);
		outputLabel.setText ("Your Body Mass Index is " + Math.round(index) + ".");
	}


}
