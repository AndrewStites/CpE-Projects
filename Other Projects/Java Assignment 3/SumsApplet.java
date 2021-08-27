/*
	Programmer: Andrew Stites
	Date:	    5/9/15
	Filename:   SumsApplet.java
	Course:     CIS2
	Purpose:    Adding stuff!
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SumsApplet extends Applet implements ActionListener
{

	//declare variables
	int aNumber, bNumber;
	double sum;
	Image logo; //allows for an image to be presented

	//construct components
	Label companyLabel = new Label ("               The Great Amazing Math Calculator!");
	Label aLabel = new Label ("Input your first number: ");
		TextField aField = new TextField(10);
	Label bLabel = new Label ("Input your second number: ");
		TextField bField = new TextField(10);
	Button calcButton = new Button ("Math!");
	Label outputLabel = new Label (" ");

	public void init()
	{
		//displays the components for the user to see and input
		setForeground (Color.green);
		setBackground (Color.black);
		add(companyLabel);
		setForeground (Color.yellow);
		add(aLabel);
		setForeground (Color.black);
		add(aField);
		setForeground (Color.yellow);
		add(bLabel);
		setForeground (Color.black);
		add(bField);
		setForeground (Color.red);
		add(calcButton);
		calcButton.addActionListener(this);
		add(outputLabel);
		logo = getImage(getDocumentBase(), "math1.gif");

	}

	public void actionPerformed(ActionEvent e)
	{
		//the math section for the math applet... Mathception...
		aNumber = Integer.parseInt (aField.getText());
		bNumber = Integer.parseInt (bField.getText());
		sum = aNumber + bNumber;
		outputLabel.setText("\n\n\tAnswer: " + Math.round(sum) + "!");

    }

	public void paint(Graphics g)
	{

			g.drawImage(logo,80,120,this);

	}



}