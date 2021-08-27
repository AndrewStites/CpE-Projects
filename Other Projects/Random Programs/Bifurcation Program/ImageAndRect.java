import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point2D;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class ImageAndRect extends Application {

	ImageView image = new ImageView("center.png");

    @Override
    public void start(Stage primaryStage) {
        try {
            Pane root = new Pane();

            StackPane imageContainer = new StackPane();
            //ImageView image = new ImageView("center.png");
            image.setFitWidth(100);
            image.setFitHeight(100);
            imageContainer.getChildren().addAll(new Rectangle(100, 100, Color.BLACK), image);
            enableDragging(imageContainer);

            root.getChildren().add(imageContainer);

            Scene scene = new Scene(root,800,600);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void enableDragging(Node node) {
        final ObjectProperty<Point2D> mouseAnchor = new SimpleObjectProperty<>();
        node.setOnMousePressed( event -> mouseAnchor.set(new Point2D(event.getSceneX(), event.getSceneY())));
        node.setOnMouseMoved( event -> { System.out.println(event.getSceneX());
		        					     System.out.println(event.getSceneY());
									   }
		        			);
        node.setOnMouseDragged( event -> {

			if (event.getSceneX() > 300)
			{
				ImageView image2 = new ImageView("spiral-source.png");
				this.imageContainer.getChildren().addAll(new Rectangle(100, 100, Color.BLACK), image2);
			}

            double deltaX = event.getSceneX() - mouseAnchor.get().getX();
            double deltaY = event.getSceneY() - mouseAnchor.get().getY();
            node.relocate(node.getLayoutX()+deltaX, node.getLayoutY()+deltaY);
            mouseAnchor.set(new Point2D(event.getSceneX(), event.getSceneY()));;
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}