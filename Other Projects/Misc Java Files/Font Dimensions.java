    /*
            Using Applet dimension to print center aligned text Example
            This Java example shows how to print text in center of an applet window using
            Dimension class.
    */
     
    import java.applet.Applet;
    import java.awt.Dimension;
    import java.awt.Font;
    import java.awt.FontMetrics;
    import java.awt.Graphics;
     
    /*
            <applet code = "AppletDimensionExample" width = 500 height = 300>
            </applet>
    */
     
    public class AppletDimensionExample extends Applet{
           
            public void paint(Graphics g){
                    int x,y;
                    String s = "Hello World";
                   
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
            }
    }
