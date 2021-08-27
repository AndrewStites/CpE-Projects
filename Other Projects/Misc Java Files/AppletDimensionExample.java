    /*
            Programmer: Andrew Stites
			Date: 		05/5/15
			Purpose:	To Learn and Display Name and Address
			Filename:	Java Assignment Applet
    */

    import java.applet.Applet;
    import java.awt.Dimension;
    import java.awt.Font;
    import java.awt.FontMetrics;
    import java.awt.Graphics;
    import java.awt.*;

    /*
            <applet code = "AppletDimensionExample" width = 500 height = 300>
            </applet>
    */

    public class AppletDimensionExample extends Applet{

            public void paint(Graphics g){
                    int x,y;
                    String s = "Andrew Stites";
                    String a = "123, abc st.";
                    String b = "Corning, Washington";
                    String c = "95973";

                    //get applet size using getSize method
                    Dimension d = getSize();
                    Font f = new Font("Arial",Font.BOLD,24);
                    g.setFont(f);

                    //determine x and y coordinates
                    FontMetrics fm = g.getFontMetrics();
                    x = d.width/2 - fm.stringWidth(s)/2;
                    y = d.height/2 - fm.getHeight();

                    //print string at specified location using drawString method
                    g.drawString(s,x,y);
                    g.drawString(a,x,y + 25);
                    g.drawString(b,x,y + 50);
                    g.drawString(c,x,y + 75);

			}

		public void init ()
			{
                    //color for font and background
                    setForeground (Color.red);
                    setBackground (Color.black);
			}


    }
