package com.example.csmore;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
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
    protected int logged;

    ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    public static Password pass;

    static {
        try {
            pass = new Password();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static Account acc = new Account();

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

    public void acceptButtonClick(ActionEvent actionEvent) throws IOException, NoSuchAlgorithmException {
        String s = pinField.getText();
            if (pass.checkPass(s)==true) {
                Parent root = FXMLLoader.load(getClass().getResource("mainview.fxml"));
                Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else if(logged>=3){
                Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
                stage.close();
            } else {
                logged++;
                infoText.setStyle("-fx-text-fill: red;");
                infoText.setText("ŠPATNÝ PIN");
            }
    }


    public void mainMenu(){
        Stage stage89 = (Stage) pinField.getScene().getWindow();
        try {
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