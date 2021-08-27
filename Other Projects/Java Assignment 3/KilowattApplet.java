/*
	Programmer: Andrew Stites
	Date:	    5/10/15
	Filename:   KilowattApplet.java
	Course:     CIS2
	Purpose:    Appliance Energy Usage!
*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KilowattApplet extends Applet implements ActionListener
{


	//Variables
	double average;


	//construction of components
	Label welcomeLabel = new Label("Welcome to the Appliance Energy Calculator");
	Label costKwhrLabel = new Label("Please enter the cost per kilowatt-hour in cents: ");
		TextField costKwhrField = new TextField(5);
	Label hoursPerYearLabel = new Label("Please enter the kilowatt-hours consumed: ");
		TextField hoursPerYearField = new TextField(5);
	Button calcButton = new Button("Calculate");
	Label outputLabel = new Label("Click the Calculate button to display the average energy cost");

	public void init()
	{

		//displays to monitor
		setForeground (Color.blue);
		setBackground (Color.magenta);
		add(welcomeLabel);
		add(costKwhrLabel);
		add(costKwhrField);
		add(hoursPerYearLabel);
		add(hoursPerYearField);
		add(calcButton);
		calcButton.addActionListener(this);
		add(outputLabel);
	}

	public void actionPerformed(ActionEvent e)
	{

		//The conversions and math for the applet
		double costKwhr = Double.parseDouble(costKwhrField.getText());
		double kwHours = Double.parseDouble(hoursPerYearField.getText());
		average = costKwhr * kwHours;
		outputLabel.setText("The average annual cost to operate this appliance is $" + Math.round(average* 100)/100D);
	}


}