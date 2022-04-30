package com.example.csmore;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.time.LocalDate;

import static com.example.csmore.HelloController.acc;

public class SendMoneyController {
    public Label infoText;
    public Label ibanNum;
    public TextField accNumField;
    public TextField ibanField;
    public TextField amountField;
    public Label warningField;
    private int abc = 0;


    public void buttonSevenClick(ActionEvent actionEvent) {
        switch (abc) {
            case 0 -> accNumField.setText(accNumField.getText() + String.valueOf(7));
            case 1 -> ibanField.setText(ibanField.getText() + String.valueOf(7));
            case 2 -> amountField.setText(amountField.getText() + String.valueOf(7));
        }
    }

    public void buttonEightClick(ActionEvent actionEvent) {
        switch (abc) {
            case 0 -> accNumField.setText(accNumField.getText() + String.valueOf(8));
            case 1 -> ibanField.setText(ibanField.getText() + String.valueOf(8));
            case 2 -> amountField.setText(amountField.getText() + String.valueOf(8));
        }
    }

    public void buttonNineClick(ActionEvent actionEvent) {
        switch (abc) {
            case 0 -> accNumField.setText(accNumField.getText() + String.valueOf(9));
            case 1 -> ibanField.setText(ibanField.getText() + String.valueOf(9));
            case 2 -> amountField.setText(amountField.getText() + String.valueOf(9));
        }
    }

    public void declineButtonClick(ActionEvent actionEvent) {
        if (amountField.getLength()>1){
            amountField.setText(amountField.getText().substring(0, amountField.getLength()-1));
        } else if (accNumField.getLength()>1){
            accNumField.setText(accNumField.getText().substring(0, accNumField.getLength()-1));
        } else if (ibanField.getLength()>1){
            ibanField.setText(ibanField.getText().substring(0, ibanField.getLength()-1));
        } else {
            Stage stage = (Stage) infoText.getScene().getWindow();
            stage.close();
        }
    }
    public void checkBallance(int num){
        int balance = acc.getAccountBalance();
        if(balance<num){
            warningField.setText("Na vašem účtu není dostatek prostředků na provedení.");
        } else{
            acc.setAccountBalance(acc.getAccountBalance()-num);
            Dates aaa = new Dates(LocalDate.now(),num,"odeslání peněz");
            acc.dates.add(aaa);
            warningField.setText("Peníze byly úspěšně odeslány.");
        }
    }

    public void buttonFourClick(ActionEvent actionEvent) {
        switch (abc) {
            case 0 -> accNumField.setText(accNumField.getText() + String.valueOf(4));
            case 1 -> ibanField.setText(ibanField.getText() + String.valueOf(4));
            case 2 -> amountField.setText(amountField.getText() + String.valueOf(4));
        }
    }

    public void buttonFiveClick(ActionEvent actionEvent) {
        switch (abc) {
            case 0 -> accNumField.setText(accNumField.getText() + String.valueOf(5));
            case 1 -> ibanField.setText(ibanField.getText() + String.valueOf(5));
            case 2 -> amountField.setText(amountField.getText() + String.valueOf(5));
        }
    }

    public void buttonSixClick(ActionEvent actionEvent) {
        switch (abc) {
            case 0 -> accNumField.setText(accNumField.getText() + String.valueOf(6));
            case 1 -> ibanField.setText(ibanField.getText() + String.valueOf(6));
            case 2 -> amountField.setText(amountField.getText() + String.valueOf(6));
        }
    }

    public void acceptButtonClick(ActionEvent actionEvent) {
        if(accNumField.getLength()>0&&ibanField.getLength()>0&&amountField.getLength()>0) {
            int amount = Integer.parseInt(amountField.getText());
            checkBallance(amount);
        } else{
            warningField.setText("Prosím vložte detaily");
        }
    }

    public void buttonOneClick(ActionEvent actionEvent) {
        switch (abc) {
            case 0 -> accNumField.setText(accNumField.getText() + String.valueOf(1));
            case 1 -> ibanField.setText(ibanField.getText() + String.valueOf(1));
            case 2 -> amountField.setText(amountField.getText() + String.valueOf(1));
        }
    }

    public void buttonTwoClick(ActionEvent actionEvent) {
        switch (abc) {
            case 0 -> accNumField.setText(accNumField.getText() + String.valueOf(2));
            case 1 -> ibanField.setText(ibanField.getText() + String.valueOf(2));
            case 2 -> amountField.setText(amountField.getText() + String.valueOf(2));
        }
    }

    public void buttonThreeClick(ActionEvent actionEvent) {
        switch (abc) {
            case 0 -> accNumField.setText(accNumField.getText() + String.valueOf(3));
            case 1 -> ibanField.setText(ibanField.getText() + String.valueOf(3));
            case 2 -> amountField.setText(amountField.getText() + String.valueOf(3));
        }
    }

    public void buttonNullClick(ActionEvent actionEvent) {
        switch (abc) {
            case 0 -> accNumField.setText(accNumField.getText() + String.valueOf(0));
            case 1 -> ibanField.setText(ibanField.getText() + String.valueOf(0));
            case 2 -> amountField.setText(amountField.getText() + String.valueOf(0));
        }
    }

    public void backButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("mainview.fxml"));
            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void firstClick(MouseEvent mouseEvent) {
        abc = 0;
    }

    public void secondClick(MouseEvent mouseEvent) {
        abc = 1;
    }

    public void thirdClick(MouseEvent mouseEvent) {
        abc = 2;
    }
}
