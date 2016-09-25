package Exercise7;

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
        Circle circle1 = new Circle(70, 70, 50);
        Circle circle2 = new Circle(170, 70, 50);
        Circle circle3 = new Circle(270, 70, 50);
        Circle circle4 = new Circle(120, 120, 50);
        Circle circle5 = new Circle(220, 120, 50);
        
        pane.getChildren().add(circle1);
        pane.getChildren().add(circle2);
        pane.getChildren().add(circle3);
        pane.getChildren().add(circle4);
        pane.getChildren().add(circle5);
        
        circle1.setFill(Color.TRANSPARENT);
        circle1.setStroke(Color.BLUE);
        circle1.setStrokeWidth(2);

        circle2.setFill(Color.TRANSPARENT);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeWidth(2);

        circle3.setFill(Color.TRANSPARENT);
        circle3.setStroke(Color.RED);
        circle3.setStrokeWidth(2);

        circle4.setFill(Color.TRANSPARENT);
        circle4.setStroke(Color.YELLOW);
        circle4.setStrokeWidth(2);
        
        circle5.setFill(Color.TRANSPARENT);
        circle5.setStroke(Color.GREEN);
        circle5.setStrokeWidth(2);
    }
}
