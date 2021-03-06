package Exercise1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Pane root = initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        Circle circle = new Circle(70, 70, 30);
        Rectangle rectangle = new Rectangle(100, 100, 20, 50);
        Line line = new Line(200, 200, 300, 300);
        
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);
        pane.getChildren().add(line);
        
        circle.setFill(Color.CORNFLOWERBLUE);
        circle.setStroke(Color.BLACK);

        rectangle.setFill(Color.AQUAMARINE);
        rectangle.setStroke(Color.DARKCYAN);

        line.setStroke(Color.DARKVIOLET);
        line.setStrokeWidth(30);

    }
}
