package Exercise2;

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
        int shiftX = 100;
        Color cYel = Color.YELLOW;

        Circle circle = new Circle(70 + shiftX, 70, 30);
        Rectangle rectangle = new Rectangle(100 + shiftX, 100, 20, 50);
        Line line = new Line(200 + shiftX, 200 + shiftX, 400, 400);

        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);
        pane.getChildren().add(line);

        circle.setFill(cYel);
        circle.setStroke(cYel);

        rectangle.setFill(cYel);
        rectangle.setStroke(cYel);

        line.setFill(cYel);
        line.setStroke(cYel);
    }
}
