package com.example.csmore;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import static com.example.csmore.HelloController.acc;

public class CreditPhoneController {
    public Label infoText;
    public ImageView phoneField;
    public TextField amountField;
    public TextField phoneInput;
    public Label infoText2;
    public Label infoText1;
    private int click = 1;

    public void buttonSevenClick(ActionEvent actionEvent) {
        switch (click){
            case 1 -> phoneInput.setText(phoneInput.getText()+7);
            case 2 -> amountField.setText(amountField.getText()+7);
        }
    }

    public void buttonEightClick(ActionEvent actionEvent) {
        switch (click){
            case 1 -> phoneInput.setText(phoneInput.getText()+8);
            case 2 -> amountField.setText(amountField.getText()+8);
        }
    }

    public void buttonNineClick(ActionEvent actionEvent) {
        switch (click){
            case 1 -> phoneInput.setText(phoneInput.getText()+9);
            case 2 -> amountField.setText(amountField.getText()+9);
        }
    }

    public void declineButtonClick(ActionEvent actionEvent) {
        if (amountField.getLength()>1){
            amountField.setText(amountField.getText().substring(0, amountField.getLength()-1));
        } else if (phoneInput.getLength()>1){
            phoneInput.setText(phoneInput.getText().substring(0, phoneInput.getLength()-1));
        } else {
            Stage stage = (Stage) infoText.getScene().getWindow();
            stage.close();
        }
    }

    public void buttonFourClick(ActionEvent actionEvent) {
        switch (click){
            case 1 -> phoneInput.setText(phoneInput.getText()+4);
            case 2 -> amountField.setText(amountField.getText()+4);
        }
    }

    public void buttonFiveClick(ActionEvent actionEvent) {
        switch (click){
            case 1 -> phoneInput.setText(phoneInput.getText()+5);
            case 2 -> amountField.setText(amountField.getText()+5);
        }
    }

    public void buttonSixClick(ActionEvent actionEvent) {
        switch (click){
            case 1 -> phoneInput.setText(phoneInput.getText()+6);
            case 2 -> amountField.setText(amountField.getText()+6);
        }
    }

    public void acceptButtonClick(ActionEvent actionEvent) {
        if(amountField.getLength()<1&&phoneInput.getLength()<12){
            infoText2.setText("Zadejte prosím správné číslo a hodnotu.");
        } else{
            acc.setAccountBalance(acc.getAccountBalance()-Integer.parseInt(amountField.getText()));
            infoText2.setText("Kredit úspěšně dobit.");
            Dates aaa = new Dates(LocalDate.now(),Integer.parseInt(amountField.getText()),"dobití mobilu");
            acc.dates.add(aaa);
        }
    }

    public void buttonOneClick(ActionEvent actionEvent) {
        switch (click){
            case 1 -> phoneInput.setText(phoneInput.getText()+1);
            case 2 -> amountField.setText(amountField.getText()+1);
        }
    }

    public void buttonTwoClick(ActionEvent actionEvent) {
        switch (click){
            case 1 -> phoneInput.setText(phoneInput.getText()+2);
            case 2 -> amountField.setText(amountField.getText()+2);
        }
    }

    public void buttonThreeClick(ActionEvent actionEvent) {
        switch (click){
            case 1 -> phoneInput.setText(phoneInput.getText()+3);
            case 2 -> amountField.setText(amountField.getText()+3);
        }
    }

    public void buttonNullClick(ActionEvent actionEvent) {
        switch (click){
            case 1 -> phoneInput.setText(phoneInput.getText()+0);
            case 2 -> amountField.setText(amountField.getText()+0);
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

    public void phoneClicked(MouseEvent mouseEvent) {
        click = 1;
    }

    public void amountClicked(MouseEvent mouseEvent) {
        click = 2;
    }
}
