import javafx.application.Application;
import javafx.scene.layout.*;
import java.awt.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;


public class Geemu extends Application
{
	Stage window;

	int xoff=100;
	int yoff=100;

	int curx=0;
	int cury=0;
	public int tim=0;
	//boolean stopCurve = false;
	float multiplier = 0;
	int speed = 50;
	int addToX = 0;
	int addToXCar = 350;
	boolean turnRight = true;
	boolean isTurning = false;

	int iterate = 0;
	int counter = 0;
	int xCoord = 10;
	int yCoord = 10;
	int carpos=200;
	float addToZ = 0;
	int carCount = 0;

	int[] lanes = {200, 350, 500};
	int margin = 16;


	int[] map = {0,-2,0, 4,-4, 2,-2,0,4, -4 , 2, 0};       //sortoff a s shaped lap

	private int width = 1024;
	private int height = 768;


	public static void main(String[]args)
	{
		launch(args);
	}

	int transformX(int x,int y,int z) //this method converts 3D point to a projected 2D point (x)
	{
	        double fz=z/10.0;
	        double fx=x-360;
	        return (int)(fx/fz)+360;
	}

	int transformY(int x,int y,int z) //this method converts 3D point to a projected 2D point (y)
	{
	        double fz=z/10.0;
	        double fy=y-280;
	        return (int)(fy/fz)+280;
	}



	@Override
	public void start(Stage primaryStage)
	{
		Group root = new Group();
	    Canvas canvas = new Canvas(650, 600);

      	root.getChildren().add(canvas);


		int hy[]=new int[81];
		int bx[]=new int[81];

		GraphicsContext g = canvas.getGraphicsContext2D;

			//int previousValue = 1;
			        for (int z=5;z<81;z++)
			        {
			            hy[z]=(int) ((int) (400 + 40 * Math.sin((z+tim) / 15.0)) - ( 40 * Math.sin((5 + tim) / 15.0))); // makes the hills
			            //bx[z]=(int) (40 * Math.sin((z + tim) / 20.0)); //makes the curves

			            if ((z+tim) >= iterate* 100)// && (z+tim) <= iterate*302)
			            {
			                counter++;
			                multiplier +=(map[iterate]/15.0f); //divided by 15 for smoother turning
			                if (counter==2000)
			                {
			                    counter = 0;
			                    iterate++;
			                    if (iterate >= map.length-1)
			                    {
			                        iterate = 0; //loop forever
			                        tim=0;
			                    }
			                }
			            }

			            bx[z]=(int) (multiplier * Math.sin((z)/20.0)); //makes the curves
			        }

			        for (int z=79;z>=5;z--) //this for-loop is used to draw every line of our road
			        {

			            g.setColor(Color.YELLOW); //draws the sand
			            int x[]=new int[5];

			            int y[]=new int[5];
			            x[0]=transformX(-2500+addToX,hy[z],z);
			            y[0]=transformY(-2500,hy[z],z);

			            x[1]=transformX(2500+addToX,hy[z],z);
			            y[1]=transformY(2500,hy[z],z);

			            x[2]=transformX(2500+addToX,hy[z+1],z+1);
			            y[2]=transformY(2500,hy[z+1],z+1);

			            x[3]=transformX(-2500+addToX,hy[z+1],z+1);
			            y[3]=transformY(-2500,hy[z+1],z+1);

			            x[4]=transformX(-2500+addToX,hy[z],z);
			            y[4]=transformY(-2500,hy[z],z);

			            g.fillPolygon(x,y,5);

			            g.setColor(Color.GRAY);



			            x[0]=transformX(100+bx[z]+addToX,hy[z],z); //draws the road
			            y[0]=transformY(100+bx[z],hy[z],z);

			            x[1]=transformX(620+bx[z]+addToX,hy[z],z);
			            y[1]=transformY(620+bx[z],hy[z],z);

			            x[2]=transformX(620+bx[z]+addToX,hy[z+1],z+1);
			            y[2]=transformY(620+bx[z],hy[z+1],z+1);

			            x[3]=transformX(100+bx[z]+addToX,hy[z+1],z+1);
			            y[3]=transformY(100+bx[z],hy[z+1],z+1);

			            x[4]=transformX(100+bx[z]+addToX,hy[z],z);
			            y[4]=transformY(100+bx[z],hy[z],z);


			            g.fillPolygon(x,y,5);



			            g.setColor(Color.WHITE); //draws the white road dividers
			            if ((z+tim)%5==0) //modulo 5 to create the vertical spaces between the white lines
			            {
			                for (int dx=15;dx<=465;dx+=150) //for loop to create the 3 stripes horizontally
			                {
			                    x[0]=transformX(100+dx+bx[z]+addToX,hy[z],z);
			                    y[0]=transformY(100+dx+bx[z],hy[z],z);

			                    x[1]=transformX(110+dx+bx[z]+addToX,hy[z],z);
			                    y[1]=transformY(110+dx+bx[z],hy[z],z);

			                    x[2]=transformX(110+dx+bx[z]+addToX,hy[z+1],z+1);
			                    y[2]=transformY(110+dx+bx[z],hy[z+1],z+1);

			                    x[3]=transformX(100+dx+bx[z]+addToX,hy[z+1],z+1);
			                    y[3]=transformY(100+dx+bx[z],hy[z+1],z+1);

			                    x[4]=transformX(100+dx+bx[z]+addToX,hy[z],z);
			                    y[4]=transformY(100+dx+bx[z],hy[z],z);


			                    g.fillPolygon(x,y,5);
			                }
			            }

		if ((z+tim)%9==0)
		{
		int scalew = 940/z;
		int scaleh = 2220/z;
		}
		//needs work
		window.setScene(new Scene(root));
		window = primaryStage;
		window.setTitle("Geemu");
		window.show();
	}

}

}