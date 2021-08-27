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