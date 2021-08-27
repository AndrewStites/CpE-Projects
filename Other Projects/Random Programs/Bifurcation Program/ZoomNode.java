import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ZoomNode extends Application {

    private static final double ZOOM_FACTOR = 0.1;

    @Override
    public void start(Stage stage) {
        stage.setTitle("ZoomNode Graph");
        BorderPane root = new BorderPane(graphPane());
        root.setTop(new StackPane(new Text("Use mouse wheel to zoom")));
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    private StackPane graphPane(){

        StackPane pane = new StackPane();

        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis(0, 13, 1);

        LineChart lineChart = new LineChart(xAxis, yAxis);
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("2019-07-01", 1));
        series1.getData().add(new XYChart.Data("2019-07-02", 2));
        series1.getData().add(new XYChart.Data("2019-07-03", 3));
        series1.getData().add(new XYChart.Data("2019-07-04", 4));
        series1.getData().add(new XYChart.Data("2019-07-05", 5));
        series1.getData().add(new XYChart.Data("2019-07-06", 6));
        series1.getData().add(new XYChart.Data("2019-07-07", 7));
        series1.getData().add(new XYChart.Data("2019-07-08", 8));
        series1.getData().add(new XYChart.Data("2019-07-09", 9));
        series1.getData().add(new XYChart.Data("2019-07-10", 10));

        pane.getChildren().add(lineChart);
        lineChart.getData().addAll(series1);

        pane.setOnScroll(event -> {

            event.consume();
            if (event.getDeltaY() == 0) return;

            double scaleFactor = event.getDeltaY() > 0 ? 1+ZOOM_FACTOR: 1-ZOOM_FACTOR;
            lineChart.setScaleX(lineChart.getScaleX() * scaleFactor);
            lineChart.setScaleY(lineChart.getScaleY() * scaleFactor);
        });
        return pane;
    }

    public static void main(String[] args) {
        launch(args);
    }
}