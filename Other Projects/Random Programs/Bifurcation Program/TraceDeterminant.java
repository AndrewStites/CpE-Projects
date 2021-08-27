import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.Cursor;

import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.util.function.Function;

// Java 8 code
public class TraceDeterminant extends Application {
//Need to implement the images of the trace-determinant
//Need to implemnet drag and drop featuring
//Want to change the color of the axies
//Want to mess with the text in the about section

    //load the image
    Image spiralSink = new Image("spiral-sink.png");
	Image spiralSource = new Image("spiral-source.png");
	Image degenerateSink = new Image("degenerate-sink.png");
	Image degenerateSource = new Image("degenerate-source.png");
	Image center = new Image("center.png");
	Image saddle = new Image("saddle.png");
	Image source = new Image("source.png");
    Image sink = new Image("sink.png");

	BorderPane menuLayout;
	Scene scene, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    //Was final Stage stage
    //I believe used final to make it a constant
    public void start(final Stage stage) {

		// resizes the image to have width of 100 while preserving the ratio and using
		// higher quality filtering method; this ImageView is also cached to
		// improve performance
		ImageView image = new ImageView();
		image.setFitWidth(100);
		image.setPreserveRatio(true);
		image.setSmooth(true);
        image.setCache(true);

		//MenuBar Code
		//About Menu Item Code
		Menu aboutMenu = new Menu("Extra");
		MenuItem about = new MenuItem("About");
		aboutMenu.getItems().add(about);
		about.setOnAction(e -> stage.setScene(scene2));

		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(aboutMenu);
		menuLayout = new BorderPane();
		menuLayout.setTop(menuBar);

		Button button = new Button("Trace-Determinant!");
		button.setOnAction(e -> stage.setScene(scene));

		Label creatorLabel = new Label("   Creator:\n   Andrew Stites\n\n   Donate:\n   'Insert Link Here'\n\n   Version:\n   1.0.0");
		creatorLabel.setFont(new Font("Comic Sans MS", 50));

		//Layout 2
		VBox layout2 = new VBox(20);
		layout2.setAlignment(Pos.CENTER);
		layout2.getChildren().addAll(creatorLabel, button);
		scene2 = new Scene(layout2, 800, 800);

		//I believe creates axes
        Axes axes = new Axes(
				//Changes the size of the window/scene
                800, 800,
                //Changes the x-axis(Goes from -8 to 8 and has a tick interval of 1)
                -16, 16, 1,
                //Changes the y-axis(Goes from -6 to 6 and has tick interval of 1)
                -16, 16, 1
        );

		//This actually graphs the equation
        Plot plot = new Plot(
				//Originally: .25 * (x + 4) * (x + 1) * (x - 2)
				//Can be altered to liner, quadratic, cubic, etc.
                x -> .25 * x * x,
                //Controls the size of the graph, well the first two numbers
                //IDK what the .01 number does
                -100, 100, .01,
                //Puts the data for the axes and combines them with the plot
                axes
        );
		//This creates a layout with the ploting data
        StackPane layout = new StackPane(
                plot
        );
        //Gives the perimeter of the cartesian graph space(1 looks good)
        layout.setPadding(new Insets(1));
        //Turns the background grayish (rgb(35, 39, 50))
        layout.setStyle("-fx-background-color: rgb(35, 39, 50);");
		//Adds all the Nodes to the scene
        layout.getChildren().addAll(image, menuLayout);
		//Moves the image around following the mouse

        layout.setOnMouseMoved(new EventHandler<MouseEvent>() {
				        public void handle(MouseEvent event) {
				            image.setTranslateX(event.getX()-410);
				            image.setTranslateY(event.getY()-410);

				            if(event.getY() < 543 && event.getX() < 410 && event.getX() >= 397)
				            {
								image.setImage(center);
							}
							if(event.getX() > 0 && event.getY() > 543)
							{
								image.setImage(saddle);
							}
							//Fix the problem with the spiralSink not working right
							if(
							 event.getX() > 207 && event.getX() < 397 && event.getY() < 543 ||
							 event.getX() > 227 && event.getX() < 397 && event.getY() < 543 ||
							 event.getX() > 247 && event.getX() < 397 && event.getY() < 543 ||
							 event.getX() > 267 && event.getX() < 397 && event.getY() < 543 ||
							 event.getX() > 287 && event.getX() < 397 && event.getY() < 543 ||
							 event.getX() > 307 && event.getX() < 397 && event.getY() < 543 ||
							 event.getX() > 327 && event.getX() < 397 && event.getY() < 543 ||
							 event.getX() > 347 && event.getX() < 397 && event.getY() < 543 ||
							 event.getX() > 367 && event.getX() < 397 && event.getY() < 543 ||
							 event.getX() > 387 && event.getX() < 397 && event.getY() < 543)
							{
								image.setImage(spiralSink);
							}
							if(
							   event.getX() < 635 && event.getX() > 410 && event.getY() < 543 ||
							   event.getX() < 615 && event.getX() > 410 && event.getY() < 543 ||
							   event.getX() < 595 && event.getX() > 410 && event.getY() < 543 ||
							   event.getX() < 575 && event.getX() > 410 && event.getY() < 543 ||
							   event.getX() < 555 && event.getX() > 410 && event.getY() < 543 ||
							   event.getX() < 535 && event.getX() > 410 && event.getY() < 543 ||
							   event.getX() < 515 && event.getX() > 410 && event.getY() < 543 ||
							   event.getX() < 495 && event.getX() > 410 && event.getY() < 543 ||
							   event.getX() < 465 && event.getX() > 410 && event.getY() < 543 ||
							   event.getX() < 445 && event.getX() > 410 && event.getY() < 543)
							{
								image.setImage(spiralSource);
							}
							if(event.getX() > 0 && event.getX() < 183 && event.getY() > 27 && event.getY() < 93 ||
							   event.getX() > 0 && event.getX() < 203 && event.getY() > 94 && event.getY() < 175 ||
							   event.getX() > 0 && event.getX() < 223 && event.getY() > 176 && event.getY() < 245 ||
							   event.getX() > 0 && event.getX() < 243 && event.getY() > 246 && event.getY() < 315 ||
							   event.getX() > 0 && event.getX() < 263 && event.getY() > 316 && event.getY() < 370 ||
							   event.getX() > 0 && event.getX() < 283 && event.getY() > 371 && event.getY() < 420 ||
							   event.getX() > 0 && event.getX() < 303 && event.getY() > 421 && event.getY() < 460 ||
							   event.getX() > 0 && event.getX() < 323 && event.getY() > 461 && event.getY() < 495 ||
							   event.getX() > 0 && event.getX() < 343 && event.getY() > 496 && event.getY() < 520 ||
							   event.getX() > 0 && event.getX() < 363 && event.getY() > 521 && event.getY() < 543)
							{
								image.setImage(sink);
							}
							if(event.getX() > 635 && event.getX() < 812 && event.getY() > 27 && event.getY() < 93 ||
							   event.getX() > 615 && event.getX() < 812 && event.getY() > 94 && event.getY() < 175 ||
							   event.getX() > 595 && event.getX() < 812 && event.getY() > 176 && event.getY() < 245 ||
							   event.getX() > 575 && event.getX() < 812 && event.getY() > 246 && event.getY() < 315 ||
							   event.getX() > 555 && event.getX() < 812 && event.getY() > 316 && event.getY() < 370 ||
							   event.getX() > 535 && event.getX() < 812 && event.getY() > 371 && event.getY() < 420 ||
							   event.getX() > 515 && event.getX() < 812 && event.getY() > 421 && event.getY() < 460 ||
							   event.getX() > 495 && event.getX() < 812 && event.getY() > 461 && event.getY() < 495 ||
							   event.getX() > 465 && event.getX() < 812 && event.getY() > 496 && event.getY() < 520 ||
							   event.getX() > 445 && event.getX() < 812 && event.getY() > 521 && event.getY() < 543)
							{
								image.setImage(source);
							}
							if(event.getX() > 610 && event.getX() < 635 && event.getY() > 27 && event.getY() < 93 ||
							   event.getX() > 590 && event.getX() < 615 && event.getY() > 93 && event.getY() < 175 ||
							   event.getX() > 570 && event.getX() < 595 && event.getY() > 175 && event.getY() < 245 ||
							   event.getX() > 550 && event.getX() < 575 && event.getY() > 245 && event.getY() < 315 ||
							   event.getX() > 530 && event.getX() < 555 && event.getY() > 315 && event.getY() < 370 ||
							   event.getX() > 510 && event.getX() < 535 && event.getY() > 370 && event.getY() < 420 ||
							   event.getX() > 490 && event.getX() < 515 && event.getY() > 420 && event.getY() < 460 ||
							   event.getX() > 465 && event.getX() < 495 && event.getY() > 460 && event.getY() < 495 ||
							   event.getX() > 440 && event.getX() < 465 && event.getY() > 495 && event.getY() < 520 ||
							   event.getX() > 410 && event.getX() < 445 && event.getY() > 520 && event.getY() < 543)
							{
								image.setImage(degenerateSource);
							}
							if(event.getX() > 183 && event.getX() < 207 && event.getY() > 27 && event.getY() < 93 ||
							   event.getX() > 203 && event.getX() < 227 && event.getY() > 94 && event.getY() < 175 ||
							   event.getX() > 223 && event.getX() < 247 && event.getY() > 176 && event.getY() < 245 ||
							   event.getX() > 243 && event.getX() < 267 && event.getY() > 246 && event.getY() < 315 ||
							   event.getX() > 263 && event.getX() < 287 && event.getY() > 316 && event.getY() < 370 ||
							   event.getX() > 283 && event.getX() < 307 && event.getY() > 371 && event.getY() < 420 ||
							   event.getX() > 303 && event.getX() < 327 && event.getY() > 421 && event.getY() < 460 ||
							   event.getX() > 323 && event.getX() < 347 && event.getY() > 461 && event.getY() < 495 ||
							   event.getX() > 343 && event.getX() < 367 && event.getY() > 496 && event.getY() < 520 ||
							   event.getX() > 363 && event.getX() < 387 && event.getY() > 521 && event.getY() < 543)
							{
								image.setImage(degenerateSink);
							}


				            System.out.println(event.getX());
				            System.out.println(event.getY());
				        }
    	});

		//The \u00BC prints 1/4 in the title
        stage.setTitle("Trace-Determinant Plane");
        stage.setResizable(false);

        scene = new Scene(layout);

        //IDK what the Color.rgb(35, 39, 50) does
        //When taken out nothing visible changes
        //Color.rgb(35, 39, 50) is a Paint Property
        stage.setScene(scene);
        stage.show();
    }

	//This class creates the cartesian graph piece by piece
    class Axes extends Pane {

        private NumberAxis xAxis;
        private NumberAxis yAxis;

		//Constructor for class Axes
        public Axes(
				//parameters for the axes
                int width, int height,
                double xLow, double xHi, double xTickUnit,
                double yLow, double yHi, double yTickUnit
        ) {
			//Do not know what this does
            setMinSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);
            //Conforms the axes to the scene(need to experiment more)
            setPrefSize(width, height);
            //Do not know what this does
            setMaxSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);

			//Controls the size of the x-axis numerically
			//The x-axis will have an xLow of possibly -9 and an xHi of possibly 9
			//This ties in to the constructor above
            xAxis = new NumberAxis(xLow, xHi, xTickUnit);
            //This puts the actually tick marks and points them down akin to a normal cartesian graph
            xAxis.setSide(Side.BOTTOM);
            //When false, the minor ticks between the numbered ticks do not show
            xAxis.setMinorTickVisible(false);
            //Sets the size of the x-axis with pixels
            xAxis.setPrefWidth(width + 25);
            //Places the x-axis half way between the y-axis
            //Was / 2
            xAxis.setLayoutY(height / 1.5);

			//New Stuff Added For Experimenting
			//Works
			xAxis.setTickLabelsVisible(false);
			xAxis.setTickLength(0.01);

            //Attempt at binding
            //xAxis.setPrefWidth(Pane.USE_PREF_SIZE);

			//Controls the size of the x-axis numerically
			//The x-axis will have an xLow of possibly -9 and an xHi of possibly 9
			//This ties in to the constructor above
            yAxis = new NumberAxis(yLow, yHi, yTickUnit);
            //This puts the actually tick marks and points them left akin to a normal cartesian graph
            yAxis.setSide(Side.LEFT);
            //When false, the minor ticks between the numbered ticks do not show
            yAxis.setMinorTickVisible(false);
            //Sets the size of the y-axis with pixels
            yAxis.setPrefHeight(height + 25);

            yAxis.setTickLabelsVisible(false);

            yAxis.setTickLength(0.01);


            //Sets the y-axis in the middle of the x-axis
            yAxis.layoutXProperty().bind(
                Bindings.subtract(
                    (width / 2) + 1,
                    yAxis.widthProperty()
                )
            );
			//Adds the axes onto the scene
            getChildren().setAll(xAxis, yAxis);
        }

		//NumberAxis class getter
        public NumberAxis getXAxis() {
            return xAxis;
        }

		//NumberAxis class getter
        public NumberAxis getYAxis() {
            return yAxis;
        }
    }

	//Class regarding the constructor above named plot
    class Plot extends Pane {
		//Creating a constructor that with needed parameters
        public Plot(
                Function<Double, Double> f,
                double xMin, double xMax, double xInc,
                Axes axes
        ) {
			//Creating the line that is actually presented
            Path path = new Path();
            //Changes the color of the line presented
            //deriveColor drops the opacity of the line
            path.setStroke(Color.YELLOW.deriveColor(0, 1, 1, 0.6));
            //Widens the line
            path.setStrokeWidth(2);

			//Do not know what this does
            path.setClip(
                    new Rectangle(
                            0, 0,
                            axes.getPrefWidth(),
                            axes.getPrefHeight()
                    )
            );

			//xMin
            double x = xMin;
            double y = f.apply(x);

            path.getElements().add(
                    new MoveTo(
                            mapX(x, axes), mapY(y, axes)
                    )
            );


			//This creates the actual line
			//From here
            x += xInc;
            while (x < xMax) {
                y = f.apply(x);

                path.getElements().add(
                        new LineTo(
                                mapX(x, axes), mapY(y, axes)
                        )
                );

                x += xInc;
            }
            //To here

            //setMinSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);
            //Sets the height and width of the window akin to the length of the axis
            setPrefSize(axes.getPrefWidth(), axes.getPrefHeight());
            //setMaxSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);

			//Puts the axes and path on the scene
            getChildren().setAll(axes, path);
        }

		//Changes the shape and position of the Determinant regarding the x aspect
        private double mapX(double x, Axes axes) {
            double tx = axes.getPrefWidth() / 2;
            double sx = axes.getPrefWidth() /
               (axes.getXAxis().getUpperBound() -
                axes.getXAxis().getLowerBound());

            return x * sx + tx;
        }

		//Changes the shape and position of the Determinant regarding the y aspect
        private double mapY(double y, Axes axes) {
            double ty = axes.getPrefHeight() / 1.5;
            double sy = axes.getPrefHeight() /
                (axes.getYAxis().getUpperBound() -
                 axes.getYAxis().getLowerBound());

            return -y * sy + ty;
        }
    }
}


