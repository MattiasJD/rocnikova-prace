package com.example.csmore;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CreditPhoneController {
    public Label infoText;
    public ImageView phoneField;
    public TextField amountField;
    public ChoiceBox comboPicker;

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
}
