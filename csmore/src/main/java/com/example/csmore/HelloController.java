package com.example.csmore;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HelloController {

    public Button buttonSeven;
    public Button buttonEight;
    public Button buttonNine;
    public Button declineButton;
    public Button buttonFour;
    public Button buttonFive;
    public Button buttonSix;
    public Button acceptButton;
    public Button buttonOne;
    public Button buttonTwo;
    public Button buttonThree;
    public Button buttonNull;
    public TextField pinField;
    public Label infoText;
    protected int password = 0000;
    protected int logged;

    ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    @FXML
    public void buttonSevenClick() {
        pinField.setText(pinField.getText()+"7");
    }

    public void buttonEightClick(ActionEvent actionEvent) {
        pinField.setText(pinField.getText()+"8");
    }

    public void buttonNineClick(ActionEvent actionEvent) {
        pinField.setText(pinField.getText()+"9");
    }
    @FXML
    public void declineButtonClick(ActionEvent actionEvent) {
        if (pinField.getLength()==0) {
            Stage stage = (Stage) pinField.getScene().getWindow();
            stage.close();
        } else {
            String br = pinField.getText();
            pinField.setText(br.substring(0, br.length()-1));
        }
    }

    public void buttonFourClick(ActionEvent actionEvent) {
        pinField.setText(pinField.getText()+"4");
    }

    public void buttonFiveClick(ActionEvent actionEvent) {
        pinField.setText(pinField.getText()+"5");
    }

    public void buttonSixClick(ActionEvent actionEvent) {
        pinField.setText(pinField.getText()+"6");
    }

    public void acceptButtonClick(ActionEvent actionEvent){
        int s = Integer.parseInt(pinField.getText());
            if (s == password) {
                logged = 1;
                infoText.setStyle("-fx-text-fill: green;");
                infoText.setText("Vítejte");
                mainMenu();
            } else {
                infoText.setStyle("-fx-text-fill: red;");
                infoText.setText("ŠPATNÝ PIN");
            }
    }


    public void mainMenu(){
        Stage stage89 = (Stage) pinField.getScene().getWindow();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main-view.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage89.setScene(new Scene(root1));
            stage89.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void buttonOneClick(ActionEvent actionEvent) {
        pinField.setText(pinField.getText()+"1");
    }

    public void buttonTwoClick(ActionEvent actionEvent) {
        pinField.setText(pinField.getText()+"2");
    }

    public void buttonThreeClick(ActionEvent actionEvent) {
        pinField.setText(pinField.getText()+"3");
    }

    public void buttonNullClick(ActionEvent actionEvent) {
        pinField.setText(pinField.getText()+"0");
    }
}