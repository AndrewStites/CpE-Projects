import javax.swing.JApplet;
import java.awt.Graphics;

public class SnowMan extends JApplet{
	public void paint (Graphics canvas){
		canvas.drawOval(147, 70, 75, 75);
		canvas.fillOval(160, 100, 10, 10);
		canvas.fillOval(200, 100, 10, 10);
		canvas.drawArc(160, 120, 50, 10, 180, 180);
			canvas.drawOval(143, 142, 90, 77);
				canvas.drawOval(143, 210, 105, 85);


	}

}