package Exercise5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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
        Circle circle = new Circle(200, 200, 30);
        Circle eye = new Circle(210, 190, 5);
        Circle eye2 = new Circle(190, 190, 5);
        Line mouth = new Line(185, 215, 215, 215);

        pane.getChildren().add(circle);
        pane.getChildren().add(eye);
        pane.getChildren().add(eye2);
        pane.getChildren().add(mouth);

        circle.setFill(Color.WHITE);
        eye.setFill(Color.WHITE);
        eye2.setFill(Color.WHITE);

        circle.setStroke(Color.BLACK);
        eye.setStroke(Color.BLACK);
        eye2.setStroke(Color.BLACK);
        mouth.setStroke(Color.BLACK);
    }
}
