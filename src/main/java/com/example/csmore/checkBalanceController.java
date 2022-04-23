package com.example.csmore;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import static com.example.csmore.HelloController.acc;

import java.net.URL;
import java.util.ResourceBundle;

public class checkBalanceController implements Initializable {
    public Label infoText;
    public Label accountBalance;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       String blnc = String.valueOf(acc.getAccountBalance());
       String crncy = String.valueOf(acc.getCurrency());
       accountBalance.setText(blnc+" "+crncy);
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
