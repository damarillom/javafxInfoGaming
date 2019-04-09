package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static SceneManager sm = null;

    @Override
    public void start(Stage primaryStage) throws Exception{
        sm = SceneManager.getInstance();
        sm.setStage(primaryStage);

        sm.changeSceneLevel(0);
        sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/formulari.css").toExternalForm());
    }


    public static void main(String[] args) {
        launch(args);
    }

}

/**import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("InfoGaming");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}*/

