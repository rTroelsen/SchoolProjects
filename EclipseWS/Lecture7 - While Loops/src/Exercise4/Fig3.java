package Exercise4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fig3 extends Application {
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
        int x = 100;
        int y = 10;
        int x2 = 100;
        int y2 = 10;
        while (x2 <= 180) {
            gc.strokeLine(x, y, x2, y2);
            y2 += 30;
            y += 30;
            x -= 15;
            x2 += 15;
        }
        
    }
    
}
