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

    public ObservableList<String> listNotice = FXCollections.observableArrayList("Noticia1", "Noticia2", "Noticia3", "Noticia4");

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
    public static String noticia3 = "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.";
    public static String noticia4 = "On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pains.\n\n"+
            "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";


    public void launchRegisterView(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        sm.changeSceneLevel(1);
        //sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/formulari.css").toExternalForm());
        sm.getCurrentScene().getStylesheets().add(getClass().getResource("/css/formulari.css").toExternalForm());
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
        //Image image = new Image(getClass().getResourceAsStream("../img/index.png"));
        Image image = new Image(getClass().getResourceAsStream("/img/index.png"));
        ImageView imageView = (ImageView) sm.getCurrentScene().lookup("#photoPer");
        imageView.setImage(image);

        CheckBox checkBox = (CheckBox) sm.getCurrentScene().lookup("#developer");
        checkBox.setSelected(dep);


        //sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/profile.css").toExternalForm());
        sm.getCurrentScene().getStylesheets().add(getClass().getResource("/css/profile.css").toExternalForm());
    }

    public void launchLoginView(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        sm.changeSceneLevel(0);
        //sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/formulari.css").toExternalForm());
        sm.getCurrentScene().getStylesheets().add(getClass().getResource("/css/formulari.css").toExternalForm());
    }

    public void launchPrinView(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();

        sm.changeSceneLevel(2);

        Button perfil = (Button) sm.getCurrentScene().lookup("#perfil");
        //Image image = new Image(getClass().getResourceAsStream("../img/index.png"), 46, 46, false, false);
        Image image = new Image(getClass().getResourceAsStream("/img/index.png"), 46, 46, false, false);

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

        //sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/prin.css").toExternalForm());
        sm.getCurrentScene().getStylesheets().add(getClass().getResource("/css/prin.css").toExternalForm());
    }

    public void launchPrinViewLogin(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        TextField textField = (TextField) sm.getCurrentScene().lookup("#username");
        name = String.valueOf(textField.getText());

        sm.changeSceneLevel(2);

        Button perfil = (Button) sm.getCurrentScene().lookup("#perfil");
        //Image image = new Image(getClass().getResourceAsStream("../img/index.png"), 46, 46, false, false);
        Image image = new Image(getClass().getResourceAsStream("/img/index.png"), 46, 46, false, false);


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

        //sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/prin.css").toExternalForm());
        sm.getCurrentScene().getStylesheets().add(getClass().getResource("/css/prin.css").toExternalForm());

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
        if (!(name.equals("") || email.equals("") || pass.equals(""))) {
            if (pass.equals(repass)) {
                sm.changeSceneLevel(2);

                Button perfil = (Button) sm.getCurrentScene().lookup("#perfil");
                //Image image = new Image(getClass().getResourceAsStream("../img/index.png"), 46, 46, false, false);
                Image image = new Image(getClass().getResourceAsStream("/img/index.png"), 46, 46, false, false);


                ImageView imageView = new ImageView(image);
                //-fx-background-image: url("/pic.jpeg");
                perfil.setGraphic(imageView);


                //ObservableList<String> listNotice = FXCollections.observableArrayList("Noticia1", "Noticia2", "Noticia3", "Noticia4");
                //ListView listView = new ListView<>(list);
                ListView listView = (ListView) sm.getCurrentScene().lookup("#listView");
                listView.setItems(listNotice);

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

                //sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/prin.css").toExternalForm());
                sm.getCurrentScene().getStylesheets().add(getClass().getResource("/css/prin.css").toExternalForm());

            } else {
                Label error = (Label) sm.getCurrentScene().lookup("#error");
                error.setText("Las contraseñas no coinciden.");
            }
        } else {
            Label error = (Label) sm.getCurrentScene().lookup("#error");
            error.setText("  Hay campos sin rellenar.");
        }
    }
    private void lauchNoticeView(String nom) throws IOException {
        if (nom != null) {
            SceneManager sm = SceneManager.getInstance();
            sm.changeSceneLevel(3);
            Button behind = (Button) sm.getCurrentScene().lookup("#behind");
            behind.setDisable(false);
            Button next = (Button) sm.getCurrentScene().lookup("#next");
            next.setDisable(false);
            if (nom.equals("Noticia1")) {
                behind.setDisable(true);
            }
            if (nom.equals("Noticia4")) {
                next.setDisable(true);
            }

            Label title = (Label) sm.getCurrentScene().lookup("#title");
            title.setText(" " + nom + " ");
            //Label body = (Label) sm.getCurrentScene().lookup("#body");
            ScrollPane scrollPane = (ScrollPane) sm.getCurrentScene().lookup("#scroll");
            ImageView imageView = (ImageView) sm.getCurrentScene().lookup("#image");
            if (nom.equals("Noticia1")) {
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

                //Image image = new Image(getClass().getResourceAsStream("../img/overchars-640x255.jpg"));
                Image image = new Image(getClass().getResourceAsStream("/img/overchars-640x255.jpg"));

                imageView.setImage(image);
            } else if (nom.equals("Noticia2")) {
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
                //Image image = new Image(getClass().getResourceAsStream("../img/header.jpg"));
                Image image = new Image(getClass().getResourceAsStream("/img/header.jpg"));

                imageView.setImage(image);
            } else if (nom.equals("Noticia3")) {
                Label text = new Label(noticia3);
                text.setWrapText(true);
                scrollPane.setFitToWidth(true);
                scrollPane.setContent(text);
                scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                //Image image = new Image(getClass().getResourceAsStream("../img/thumb-1920-992033.jpg"));
                Image image = new Image(getClass().getResourceAsStream("/img/thumb-1920-992033.jpg"));

                imageView.setImage(image);
            } else if (nom.equals("Noticia4")) {
                Label text = new Label(noticia4);
                text.setWrapText(true);
                scrollPane.setFitToWidth(true);
                scrollPane.setContent(text);
                scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                //Image image = new Image(getClass().getResourceAsStream("../img/Hollow-Knight-Silksong.png"));
                Image image = new Image(getClass().getResourceAsStream("/img/Hollow-Knight-Silksong.png"));

                imageView.setImage(image);
            }
            //back.setGraphic ImageView.new(image("src/code/media/logo.png"));


            //sm.getCurrentScene().getStylesheets().add(getClass().getResource("../css/notice.css").toExternalForm());
            sm.getCurrentScene().getStylesheets().add(getClass().getResource("/css/notice.css").toExternalForm());

        }
    }

    public void save(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        TextField textField = (TextField) sm.getCurrentScene().lookup("#username");
        name = String.valueOf(textField.getText());

        TextField textField2 = (TextField) sm.getCurrentScene().lookup("#mail");
        email = String.valueOf(textField2.getText());
    }

    public void next(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        Label title = (Label) sm.getCurrentScene().lookup("#title");
        String nom = String.valueOf(title.getText());
        String num = nom.substring(8,9);
        //System.out.println(num);
        int notice = Integer.parseInt(num) + 1;
        lauchNoticeView("Noticia" + notice);
    }

    public void atras(ActionEvent event) throws IOException {
        SceneManager sm = SceneManager.getInstance();
        Label title = (Label) sm.getCurrentScene().lookup("#title");
        String nom = String.valueOf(title.getText());
        String num = nom.substring(8,9);
        //System.out.println(num);
        int notice = Integer.parseInt(num) - 1;
        lauchNoticeView("Noticia" + notice);
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

