package com.example.csmore;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class cBController implements Initializable {
    public Label infoText;
    public Label accountBalance;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       // acc.getAccountBalance();
       // accountBalance.setText();
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
