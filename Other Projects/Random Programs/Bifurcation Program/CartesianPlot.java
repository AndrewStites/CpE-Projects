import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.util.function.Function;

// Java 8 code
public class CartesianPlot extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    //Was final Stage stage
    //I believe used final to make it a constant
    public void start(final Stage stage) {

		//I believe creates axes
        Axes axes = new Axes(
				//Changes the size of the window/scene
                400, 300,
                //Changes the x-axis(Goes from -8 to 8 and has a tick interval of 1)
                -8, 8, 1,
                //Changes the y-axis(Goes from -6 to 6 and has tick interval of 1)
                -6, 6, 1
        );

		//This actually graphs the equation
        Plot plot = new Plot(
				//Originally: .25 * (x + 4) * (x + 1) * (x - 2)
				//Can be altered to liner, quadratic, cubic, etc.
                x -> .50 * (x + 4),
                //Controls the size of the graph, well the first two numbers
                //IDK what the .01 number does
                -8, 8, .01,
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

		//The \u00BC prints 1/4 in the title
        stage.setTitle("y = \u00BC(x+4)(x+1)(x-2)");
        //IDK what the Color.rgb(35, 39, 50) does
        //When taken out nothing visible changes
        stage.setScene(new Scene(layout, Color.rgb(35, 39, 50)));
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
            xAxis.setPrefWidth(width);
            //Places the x-axis half way between the y-axis
            xAxis.setLayoutY(height / 2);

			//Controls the size of the x-axis numerically
			//The x-axis will have an xLow of possibly -9 and an xHi of possibly 9
			//This ties in to the constructor above
            yAxis = new NumberAxis(yLow, yHi, yTickUnit);
            //This puts the actually tick marks and points them left akin to a normal cartesian graph
            yAxis.setSide(Side.LEFT);
            //When false, the minor ticks between the numbered ticks do not show
            yAxis.setMinorTickVisible(false);
            //Sets the size of the y-axis with pixels
            yAxis.setPrefHeight(height);

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

			//
            double x = xMin;
            double y = f.apply(x);

            path.getElements().add(
                    new MoveTo(
                            mapX(1, axes), mapY(y, axes)
                    )
            );

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

            setMinSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);
            setPrefSize(axes.getPrefWidth(), axes.getPrefHeight());
            setMaxSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);

            getChildren().setAll(axes, path);
        }

        private double mapX(double x, Axes axes) {
            double tx = axes.getPrefWidth() / 2;
            double sx = axes.getPrefWidth() /
               (axes.getXAxis().getUpperBound() -
                axes.getXAxis().getLowerBound());

            return x * sx + tx;
        }

        private double mapY(double y, Axes axes) {
            double ty = axes.getPrefHeight() / 2;
            double sy = axes.getPrefHeight() /
                (axes.getYAxis().getUpperBound() -
                 axes.getYAxis().getLowerBound());

            return -y * sy + ty;
        }
    }
}

