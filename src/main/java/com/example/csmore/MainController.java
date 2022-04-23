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

public class MainController implements Initializable {
    Account acc = new Account();
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

    public void checkBallance(ActionEvent actionEvent) {
        Stage stage2 = (Stage) infoText.getScene().getWindow();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("checkBalance-view.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage2.setScene(new Scene(root1));
            stage2.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void cashOut(ActionEvent actionEvent) {
        Stage stage = (Stage) infoText.getScene().getWindow();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cashOut-view.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public void SendMoney(ActionEvent actionEvent) {
        Stage stage = (Stage) infoText.getScene().getWindow();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sendMoney.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public void chargePhone(ActionEvent actionEvent) {
        Stage stage = (Stage) infoText.getScene().getWindow();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("creditPhone-view.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public void changePin(ActionEvent actionEvent) {
        Stage stage = (Stage) infoText.getScene().getWindow();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("changePin.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
