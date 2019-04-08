package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public void launchRegisterView(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        sm.changeSceneLevel(1);
    }

    public void launchLoginView(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        sm.changeSceneLevel(0);
    }

    public void launchPrinView(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        sm.changeSceneLevel(2);


        ObservableList<String> list = FXCollections.observableArrayList("Noticia1", "Noticia2", "Noticia3", "Noticia4");
        //ListView listView = new ListView<>(list);
        ListView listView = (ListView) sm.getCurrentScene().lookup("#listView");
        listView.setItems(list);

        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                try {
                    lauchNoticeView((String) listView.getSelectionModel().getSelectedItem());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("clicked on " + listView.getSelectionModel().getSelectedItem());
            }
        });
    }

    private void lauchNoticeView(String name) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        sm.changeSceneLevel(3);
        Label title = (Label) sm.getCurrentScene().lookup("#title");
        title.setText(name);
        sm.getCurrentScene().getStylesheets().add(getClass().getResource("notice.css").toExternalForm());

        Button back = (Button) sm.getCurrentScene().lookup("#back");
        Image image = new Image(getClass().getResourceAsStream("../img/Back_Arrow.svg.png"));
        back.setGraphic(new ImageView(image));
        //back.setGraphic ImageView.new(image("src/code/media/logo.png"));

    }

    /**public void lauchNoticeView(ActionEvent event) throws  IOException {
        SceneManager sm = SceneManager.getInstance();
        sm.changeSceneLevel(3);


    }*/
}

/**import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;


public class Controller {

    @FXML private Label actionTarget;
    public void pressHelloBtn(ActionEvent event) {
        actionTarget.setText("Hola");
        actionTarget.setTextFill(Paint.valueOf("red"));
        System.out.println("Hello word!");
    }
}*/

