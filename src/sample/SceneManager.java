package sample;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

/**
 * Class SceneManager is for managing different scene of game.
 * @author kevingok
 *
 */
public class SceneManager {

    private static SceneManager instance = null;

    public static final int LOGIN = 0;
    public static final int REGISTER = 1;


    private int currentLevel;

    private ArrayList<Scene> scenes;

    public static Stage primaryStage = null;

    /**
     * Get instance of SceneManager
     * @return        Instance of SceneManager
     */
    public static SceneManager getInstance() throws IOException {
        if(instance == null) {
            instance = new SceneManager();
        }
        return instance;
    }

    /**
     * Class constructor initiates all scene in an ArrayList and
     * sets initial scene as menu.
     */
    private SceneManager() throws IOException {

        Parent loginViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Parent registerViewParent = FXMLLoader.load(getClass().getResource("register.fxml"));
        Parent prinViewParent = FXMLLoader.load(getClass().getResource("principal.fxml"));
        Parent noticiaViewParent = FXMLLoader.load(getClass().getResource("noticia.fxml"));
        scenes = new ArrayList<Scene>();

        scenes.add(new Scene(loginViewParent, 1280, 768));
        scenes.add(new Scene(registerViewParent, 1280, 768));
        scenes.add(new Scene(prinViewParent, 1280, 768));
        scenes.add(new Scene(noticiaViewParent, 1280, 768));
    }

    public void setStage(Stage stage){
        this.primaryStage = stage;
    }


    /**
     * Change scene of game.
     * @param sceneLevel      Type of scene as integer
     */
    public void changeSceneLevel(int sceneLevel) {
        currentLevel = sceneLevel;
        primaryStage.setScene(scenes.get(sceneLevel));

        primaryStage.show();
    }

    /**
     * Retrieve current type of scene.
     * @return           Type of scene as integer
     */
    public Scene getCurrentScene() {
        return scenes.get(currentLevel);
    }
}