package com.example.csmore;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class cashOutController {
    public Label infoText;

    public void buttonSevenClick(ActionEvent actionEvent) {
    }

    public void buttonEightClick(ActionEvent actionEvent) {
    }

    public void buttonNineClick(ActionEvent actionEvent) {
    }

    public void declineButtonClick(ActionEvent actionEvent) {
        Stage stage = (Stage) infoText.getScene().getWindow();
        stage.close();
    }

    public void buttonFourClick(ActionEvent actionEvent) {
    }

    public void buttonFiveClick(ActionEvent actionEvent) {
    }

    public void buttonSixClick(ActionEvent actionEvent) {
    }

    public void acceptButtonClick(ActionEvent actionEvent) {
    }

    public void buttonOneClick(ActionEvent actionEvent) {
    }

    public void buttonTwoClick(ActionEvent actionEvent) {
    }

    public void buttonThreeClick(ActionEvent actionEvent) {
    }

    public void buttonNullClick(ActionEvent actionEvent) {
    }

    public void backButton(ActionEvent actionEvent) {
        Stage stage = (Stage) infoText.getScene().getWindow();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main-view.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
