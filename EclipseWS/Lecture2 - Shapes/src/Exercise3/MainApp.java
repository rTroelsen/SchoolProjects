package Exercise3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
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
        Rectangle sky = new Rectangle(0, 0, 400, 400);
        Circle sun = new Circle(300, 100, 30);
        Rectangle house = new Rectangle(75, 250, 120, 120);
        Rectangle window = new Rectangle(85, 265, 45, 45);
        Polygon roof = new Polygon(50, 250, 215, 250, 135, 170);
        Line pole = new Line(275, 365, 275, 175);
        Rectangle ground = new Rectangle(0, 370, 400, 400);
        
        pane.getChildren().add(sky);
        pane.getChildren().add(sun);
        pane.getChildren().add(house);
        pane.getChildren().add(window);
        pane.getChildren().add(roof);
        pane.getChildren().add(pole);
        pane.getChildren().add(ground);

        sky.setFill(Color.CORNFLOWERBLUE);
        
        sun.setFill(Color.YELLOW);
        sun.setStroke(Color.BLACK);
        
        house.setFill(Color.RED);
        
        window.setFill(Color.BLACK);
        
        roof.setFill(Color.GREEN);
        
        pole.setStroke(Color.LIGHTSLATEGREY);
        pole.setStrokeWidth(10);
        
        ground.setFill(Color.LIGHTGREEN);
        
    }
}
