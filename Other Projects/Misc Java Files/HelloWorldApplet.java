//Line remark
/*
Block Remark
Programmer:	Andrew Stites
Date: 		04/23/15
Filename:	HelloWorld.java
Purpose:	Introduction Java Applets
*/

import java.util.Date; //Used to represent Date and Time
import java.awt.*; //Essential tools for drawing ex: color, GUI elements pg. 92
import java.applet.*; //Necessary to run applet code


public class HelloWorldApplet extends Applet //makes HelloWorld a subclass of Applet
{
	public void paint (Graphics g)
	{
		Date currentDate = new Date  ();
		g.drawString ("Andrew Stites ",200,50);  //page 96 and 97-drawstring method
		g.drawString ("says ",200,75);
		g.drawString ("Hello World",200,100);
		setBackground (Color.blue);  //Color properties and capabilities are on pg 99
		setForeground (Color.yellow);  //pg 184 for foreground
		Image Andrew; //This declares an image object
		Andrew = getImage (getDocumentBase(), "Patrick.png");
		g.drawImage (Andrew,10,70,this);


	}


}