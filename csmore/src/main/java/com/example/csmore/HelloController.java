package com.example.csmore;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Timer;

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

    public void acceptButtonClick(ActionEvent actionEvent) {
        int s = Integer.parseInt(pinField.getText());
        if(s==password){
            pinField.setText("cojeee kurva");
        }else{
            Timer timer = new Timer();
            ///timer.schedule(dealyer(), second1000);
            infoText.setStyle("-fx-text-fill: red;");
            infoText.setText("ŠPATNÝ PIN");
        }
    }
    public void dealyer(){

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