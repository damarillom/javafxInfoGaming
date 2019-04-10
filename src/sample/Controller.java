package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Controller {
    public static String name = "User";
    public static String email = "ejemplo@gmail.es";
    public static Boolean dep = false;

    public static String noticia1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
            " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
            " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
            " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
            " officia deserunt mollit anim id est laborum.";
    public static String noticia2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
            " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
            " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
            " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
            " officia deserunt mollit anim id est laborum.\n\n"+
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
            " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
            " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
            " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
            " officia deserunt mollit anim id est laborum.\n\n"+
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
            " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
            " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
            " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
            " officia deserunt mollit anim id est laborum.\n\n"+
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
            " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
            " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
            " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
            " officia deserunt mollit anim id est laborum.\n\n";


    public void launchRegisterView(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        sm.changeSceneLevel(1);
        sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/formulari.css").toExternalForm());
    }

    public void launchProfileView(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        sm.changeSceneLevel(4);
        //sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/formulari.css").toExternalForm());

        TextField username = (TextField) sm.getCurrentScene().lookup("#username");
        username.setText(name);
        TextField mail = (TextField) sm.getCurrentScene().lookup("#mail");
        mail.setText(email);


        //Button perfil = (Button) sm.getCurrentScene().lookup("#photoPer");
        Image image = new Image(getClass().getResourceAsStream("../img/index.png"));
        ImageView imageView = (ImageView) sm.getCurrentScene().lookup("#photoPer");
        imageView.setImage(image);

        CheckBox checkBox = (CheckBox) sm.getCurrentScene().lookup("#developer");
        checkBox.setSelected(dep);


        sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/profile.css").toExternalForm());
    }

    public void launchLoginView(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        sm.changeSceneLevel(0);
        sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/formulari.css").toExternalForm());
    }

    public void launchPrinView(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();

        sm.changeSceneLevel(2);

        Button perfil = (Button) sm.getCurrentScene().lookup("#perfil");
        Image image = new Image(getClass().getResourceAsStream("../img/index.png"), 46, 46, false, false);

        ImageView imageView = new ImageView(image);
        //-fx-background-image: url("/pic.jpeg");
        perfil.setGraphic(imageView);


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

        sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/prin.css").toExternalForm());
    }

    public void launchPrinViewLogin(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        TextField textField = (TextField) sm.getCurrentScene().lookup("#username");
        name = String.valueOf(textField.getText());

        sm.changeSceneLevel(2);

        Button perfil = (Button) sm.getCurrentScene().lookup("#perfil");
        Image image = new Image(getClass().getResourceAsStream("../img/index.png"), 46, 46, false, false);

        ImageView imageView = new ImageView(image);
        //-fx-background-image: url("/pic.jpeg");
        perfil.setGraphic(imageView);


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

        sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/prin.css").toExternalForm());
    }

    public void launchPrinViewRegister(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        TextField textField1 = (TextField) sm.getCurrentScene().lookup("#username");
        name = String.valueOf(textField1.getText());

        TextField textField2 = (TextField) sm.getCurrentScene().lookup("#mail");
        email = String.valueOf(textField2.getText());

        CheckBox checkBox = (CheckBox) sm.getCurrentScene().lookup("#dev");
        dep = checkBox.isSelected();

        PasswordField passwordField1 = (PasswordField) sm.getCurrentScene().lookup("#passCon");
        PasswordField passwordField2 = (PasswordField) sm.getCurrentScene().lookup("#repassCon");
        //SceneManager sm = SceneManager.getInstance();
        String pass = String.valueOf(passwordField1.getText());
        String repass = String.valueOf(passwordField2.getText());
        if (pass.equals(repass)) {
            sm.changeSceneLevel(2);

            Button perfil = (Button) sm.getCurrentScene().lookup("#perfil");
            Image image = new Image(getClass().getResourceAsStream("../img/index.png"), 46, 46, false, false);

            ImageView imageView = new ImageView(image);
            //-fx-background-image: url("/pic.jpeg");
            perfil.setGraphic(imageView);


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

            sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/prin.css").toExternalForm());
        } else {
            Label error = (Label) sm.getCurrentScene().lookup("#error");
            error.setText("Las contraseñas no coinciden.");
        }
    }
    private void lauchNoticeView(String name) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        sm.changeSceneLevel(3);
        Label title = (Label) sm.getCurrentScene().lookup("#title");
        title.setText(" " + name + " ");
        //Label body = (Label) sm.getCurrentScene().lookup("#body");
        ScrollPane scrollPane = (ScrollPane) sm.getCurrentScene().lookup("#scroll");
        ImageView imageView = (ImageView) sm.getCurrentScene().lookup("#image");
        if (name.equals("Noticia1")) {
            /**body.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                    " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
                    " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
                    " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
                    " officia deserunt mollit anim id est laborum.");*/
            Label text = new Label(noticia1);
            text.setWrapText(true);
            scrollPane.setFitToWidth(true);
            scrollPane.setContent(text);
            scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

            Image image = new Image(getClass().getResourceAsStream("../img/header.jpg"));
            imageView.setImage(image);
        } else if (name.equals("Noticia2")) {
            /**body.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                    " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
                    " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
                    " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
                    " officia deserunt mollit anim id est laborum.\n\n"+
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                    " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
                    " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
                    " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
                    " officia deserunt mollit anim id est laborum.\n\n"+
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                    " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
                    " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
                    " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
                    " officia deserunt mollit anim id est laborum.\n\n"+
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                    " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
                    " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
                    " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
                    " officia deserunt mollit anim id est laborum.\n\n");*/
            Label text = new Label(noticia2);
            text.setWrapText(true);
            scrollPane.setFitToWidth(true);
            scrollPane.setContent(text);
            scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
            Image image = new Image(getClass().getResourceAsStream("../img/header.jpg"));
            imageView.setImage(image);
        } else if (name.equals("Noticia3")) {
            Label text = new Label(noticia2);
            text.setWrapText(true);
            scrollPane.setFitToWidth(true);
            scrollPane.setContent(text);
            scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
            Image image = new Image(getClass().getResourceAsStream("../img/header.jpg"));
            imageView.setImage(image);
        } else if (name.equals("Noticia4")) {
            Label text = new Label(noticia2);
            text.setWrapText(true);
            scrollPane.setFitToWidth(true);
            scrollPane.setContent(text);
            scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
            Image image = new Image(getClass().getResourceAsStream("../img/header.jpg"));
            imageView.setImage(image);
        }
        //back.setGraphic ImageView.new(image("src/code/media/logo.png"));


        sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/notice.css").toExternalForm());
    }

    public void save(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        TextField textField = (TextField) sm.getCurrentScene().lookup("#username");
        name = String.valueOf(textField.getText());

        TextField textField2 = (TextField) sm.getCurrentScene().lookup("#mail");
        email = String.valueOf(textField2.getText());
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

