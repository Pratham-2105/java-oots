package Day13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, JavaFX 25!");
        StackPane root = new StackPane(label);

        Scene scene = new Scene(root, 400, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
