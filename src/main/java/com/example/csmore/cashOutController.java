package com.example.csmore;

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
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.csmore.HelloController.acc;

public class cashOutController implements Initializable {
    public Label infoText;
    public ChoiceBox choiceBOX;
    public TextField amountField;
    public Label infoText2;

    public void buttonSevenClick(ActionEvent actionEvent) {
        amountField.setText(amountField.getText()+String.valueOf(7));
    }

    public void buttonEightClick(ActionEvent actionEvent) {
        amountField.setText(amountField.getText()+String.valueOf(8));
    }

    public void buttonNineClick(ActionEvent actionEvent) {
        amountField.setText(amountField.getText()+String.valueOf(9));
    }

    public void declineButtonClick(ActionEvent actionEvent) {
        if (amountField.getLength()>0){
            amountField.setText(amountField.getText().substring(0, amountField.getLength()-1));
        } else {
            Stage stage = (Stage) infoText.getScene().getWindow();
            stage.close();
        }
    }

    public void buttonFourClick(ActionEvent actionEvent) {
        amountField.setText(amountField.getText()+String.valueOf(4));
    }

    public void buttonFiveClick(ActionEvent actionEvent) {
        amountField.setText(amountField.getText()+String.valueOf(5));
    }

    public void buttonSixClick(ActionEvent actionEvent) {
        amountField.setText(amountField.getText()+String.valueOf(6));
    }

    public void acceptButtonClick(ActionEvent actionEvent) {
        if(amountField.getLength()>0){
            acc.setAccountBalance(acc.getAccountBalance()-Integer.parseInt(amountField.getText()));
        } else{
            String h1 = String.valueOf(choiceBOX.getSelectionModel().getSelectedItem());
            acc.setAccountBalance(acc.getAccountBalance()-Integer.parseInt(h1));
        }
        infoText2.setText("Vaše peníze byly vybrány.");
    }

    public void buttonOneClick(ActionEvent actionEvent) {
        amountField.setText(amountField.getText()+String.valueOf(1));
    }

    public void buttonTwoClick(ActionEvent actionEvent) {
        amountField.setText(amountField.getText()+String.valueOf(2));
    }

    public void buttonThreeClick(ActionEvent actionEvent) {
        amountField.setText(amountField.getText()+String.valueOf(3));
    }

    public void buttonNullClick(ActionEvent actionEvent) {
        amountField.setText(amountField.getText()+String.valueOf(0));
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String [] amount = {"100","200","500","1000","2000","5000","10000"};
        choiceBOX.setItems(FXCollections.observableArrayList(amount));
    }
}
