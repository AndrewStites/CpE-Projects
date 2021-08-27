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

	    //Don't know what this stuff does
	    //I believe it just moves the line graphed
	    //From here
            double x = xMin;
            double y = f.apply(x);

            path.getElements().add(
                    new MoveTo(
                            mapX(x, axes), mapY(y, axes)
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
            //To here

            setMinSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);
            setPrefSize(axes.getPrefWidth(), axes.getPrefHeight());
            setMaxSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);
			
			//Just adds the axes and the line to the scene
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