package Exercise4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
        Rectangle rectangle = new Rectangle(100, 100, 200, 50);
        Text text = new Text(150, 130, "Rasmus!");
        
        pane.getChildren().add(rectangle);
        pane.getChildren().add(text);
        
        rectangle.setFill(Color.AQUAMARINE);
        text.setFill(Color.BLUEVIOLET);
        text.setFont(Font.font(30));
    }
}
