package sample;

import javafx.event.ActionEvent;
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
}
