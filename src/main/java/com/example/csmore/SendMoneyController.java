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
        if(abc == 0){
            accNumField.setText(accNumField.getText()+String.valueOf(7));
        } else if(abc == 1){
            ibanField.setText(ibanField.getText()+String.valueOf(7));
        } else if(abc == 2){
            amountField.setText(amountField.getText()+String.valueOf(7));
        }
    }

    public void buttonEightClick(ActionEvent actionEvent) {
        if(abc == 0){
            accNumField.setText(accNumField.getText()+String.valueOf(8));
        } else if(abc == 1){
            ibanField.setText(ibanField.getText()+String.valueOf(8));
        } else if(abc == 2){
            amountField.setText(amountField.getText()+String.valueOf(8));
        }
    }

    public void buttonNineClick(ActionEvent actionEvent) {
        if(abc == 0){
            accNumField.setText(accNumField.getText()+String.valueOf(9));
        } else if(abc == 1){
            ibanField.setText(ibanField.getText()+String.valueOf(9));
        } else if(abc == 2){
            amountField.setText(amountField.getText()+String.valueOf(9));
        }
    }

    public void declineButtonClick(ActionEvent actionEvent) {
        Stage stage = (Stage) infoText.getScene().getWindow();
        stage.close();
    }
    public void checkBallance(int num){
        int balance = acc.getAccountBalance();
        if(balance<num){
            warningField.setText("Na vašem účtu není dostatek prostředků na provedení.");
        } else{
            acc.setAccountBalance(acc.getAccountBalance()-num);
            warningField.setText("Peníze byly úspěšně odeslány.");
        }
    }

    public void buttonFourClick(ActionEvent actionEvent) {
        if(abc == 0){
            accNumField.setText(accNumField.getText()+String.valueOf(4));
        } else if(abc == 1){
            ibanField.setText(ibanField.getText()+String.valueOf(4));
        } else if(abc == 2){
            amountField.setText(amountField.getText()+String.valueOf(4));
        }
    }

    public void buttonFiveClick(ActionEvent actionEvent) {
        if(abc == 0){
            accNumField.setText(accNumField.getText()+String.valueOf(5));
        } else if(abc == 1){
            ibanField.setText(ibanField.getText()+String.valueOf(5));
        } else if(abc == 2){
            amountField.setText(amountField.getText()+String.valueOf(5));
        }
    }

    public void buttonSixClick(ActionEvent actionEvent) {
        if(abc == 0){
            accNumField.setText(accNumField.getText()+String.valueOf(6));
        } else if(abc == 1){
            ibanField.setText(ibanField.getText()+String.valueOf(6));
        } else if(abc == 2){
            amountField.setText(amountField.getText()+String.valueOf(6));
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
        if(abc == 0){
            accNumField.setText(accNumField.getText()+String.valueOf(1));
        } else if(abc == 1){
            ibanField.setText(ibanField.getText()+String.valueOf(1));
        } else if(abc == 2){
            amountField.setText(amountField.getText()+String.valueOf(1));
        }
    }

    public void buttonTwoClick(ActionEvent actionEvent) {
        if(abc == 0){
            accNumField.setText(accNumField.getText()+String.valueOf(2));
        } else if(abc == 1){
            ibanField.setText(ibanField.getText()+String.valueOf(2));
        } else if(abc == 2){
            amountField.setText(amountField.getText()+String.valueOf(2));
        }
    }

    public void buttonThreeClick(ActionEvent actionEvent) {
        if(abc == 0){
            accNumField.setText(accNumField.getText()+String.valueOf(3));
        } else if(abc == 1){
            ibanField.setText(ibanField.getText()+String.valueOf(3));
        } else if(abc == 2){
            amountField.setText(amountField.getText()+String.valueOf(3));
        }
    }

    public void buttonNullClick(ActionEvent actionEvent) {
        if(abc == 0){
            accNumField.setText(accNumField.getText()+String.valueOf(0));
        } else if(abc == 1){
            ibanField.setText(ibanField.getText()+String.valueOf(0));
        } else if(abc == 2){
            amountField.setText(amountField.getText()+String.valueOf(0));
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
