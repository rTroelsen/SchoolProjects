package Exercise6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
        Circle circle1 = new Circle(200, 200, 50);
        Circle circle2 = new Circle(200, 200, 30);
        Circle circle3 = new Circle(200, 200, 10);

        pane.getChildren().add(circle1);
        pane.getChildren().add(circle2);
        pane.getChildren().add(circle3);

        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        circle1.setStrokeWidth(10);
        
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeWidth(10);
        
        circle3.setFill(Color.BLACK);
        circle3.setStroke(Color.BLACK);
        circle3.setStrokeWidth(10);

    }
}
