package example2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        GridPane root = initContent();
        Scene scene = new Scene(root);
        
        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }
    
    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }
    
    // ------------------------------------------------------------------------
    
    private void drawShapes(GraphicsContext gc) {
        // draw an arrowhead at (100, 75)
        int x = 100;
        int y = 75;
        int x2 = 20;
        int y2 = 4;
        gc.strokeLine(x, y, x + x2, y - y2);
        gc.strokeLine(x, y, x + x2, y + y2);
        
        // draw an arrowhead at (100, 125)
        x = 100;
        y = 125;
        gc.strokeLine(x, y, x + x2, y - y2);
        gc.strokeLine(x, y, x + x2, y + y2);
        
        // draw an arrowhead at (20, 50)
        x = 20;
        y = 125;
        gc.strokeLine(x, y, x + x2, y - y2);
        gc.strokeLine(x, y, x + x2, y + y2);
    }
    
}
