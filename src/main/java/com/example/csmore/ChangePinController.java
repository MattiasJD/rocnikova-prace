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

import java.security.NoSuchAlgorithmException;

import static com.example.csmore.HelloController.pass;

public class ChangePinController {
    public Label infoText;
    public TextField curPINfield;
    public TextField newPINfield;
    public Label infoText11;
    private int le = 0;

    public void buttonSevenClick(ActionEvent actionEvent) {
        switch (le){
            case 0 -> curPINfield.setText(curPINfield.getText()+7);
            case 1 -> newPINfield.setText(newPINfield.getText()+7);
        }
    }

    public void buttonEightClick(ActionEvent actionEvent) {
        switch (le){
            case 0 -> curPINfield.setText(curPINfield.getText()+8);
            case 1 -> newPINfield.setText(newPINfield.getText()+8);
        }
    }

    public void buttonNineClick(ActionEvent actionEvent) {
        switch (le){
            case 0 -> curPINfield.setText(curPINfield.getText()+9);
            case 1 -> newPINfield.setText(newPINfield.getText()+9);
        }
    }

    public void buttonFourClick(ActionEvent actionEvent) {
        switch (le){
            case 0 -> curPINfield.setText(curPINfield.getText()+4);
            case 1 -> newPINfield.setText(newPINfield.getText()+4);
        }
    }

    public void buttonFiveClick(ActionEvent actionEvent) {
        switch (le){
            case 0 -> curPINfield.setText(curPINfield.getText()+5);
            case 1 -> newPINfield.setText(newPINfield.getText()+5);
        }
    }

    public void buttonSixClick(ActionEvent actionEvent) {
        switch (le){
            case 0 -> curPINfield.setText(curPINfield.getText()+6);
            case 1 -> newPINfield.setText(newPINfield.getText()+6);
        }
    }

    public void buttonOneClick(ActionEvent actionEvent) {
        switch (le){
            case 0 -> curPINfield.setText(curPINfield.getText()+1);
            case 1 -> newPINfield.setText(newPINfield.getText()+1);
        }
    }

    public void buttonTwoClick(ActionEvent actionEvent) {
        switch (le){
            case 0 -> curPINfield.setText(curPINfield.getText()+2);
            case 1 -> newPINfield.setText(newPINfield.getText()+2);
        }
    }

    public void buttonThreeClick(ActionEvent actionEvent) {
        switch (le){
            case 0 -> curPINfield.setText(curPINfield.getText()+3);
            case 1 -> newPINfield.setText(newPINfield.getText()+3);
        }
    }

    public void buttonNullClick(ActionEvent actionEvent) {
        switch (le){
            case 0 -> curPINfield.setText(curPINfield.getText()+0);
            case 1 -> newPINfield.setText(newPINfield.getText()+0);
        }
    }



    public void acceptButtonClick(ActionEvent actionEvent) throws NoSuchAlgorithmException {
        if(pass.setPassword(curPINfield.getText(), newPINfield.getText())){
            infoText11.setText("Vaše heslo bylo úspěšně změněno");
        } else {
            infoText11.setText("Špatný pin");
        }
    }

    public void declineButtonClick(ActionEvent actionEvent) {
        if (curPINfield.getLength()>1){
            curPINfield.setText(curPINfield.getText().substring(0, curPINfield.getLength()-1));
        } else if (newPINfield.getLength()>1){
            newPINfield.setText(newPINfield.getText().substring(0, newPINfield.getLength()-1));
        } else {
            Stage stage = (Stage) infoText.getScene().getWindow();
            stage.close();
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

    public void pinClick(MouseEvent mouseEvent) {
        le=0;
    }

    public void neuPinClick(MouseEvent mouseEvent) {
        le=1;
    }
}
