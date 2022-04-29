package com.example.csmore;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


import static com.example.csmore.HelloController.acc;

public class CashInController implements Initializable {

    public TextField amountField;
    public Label infoText;
    public Label infoText2;
    public ImageView hundredImg;
    public ImageView twohundredImg;
    public ImageView fivehundredImg;
    public ImageView thousandImg;
    public ImageView twothousandImg;
    public ImageView fivethousandImg;
    Image image1 = new Image(getClass().getResourceAsStream("out100.jpg"));
    Image image2 = new Image(getClass().getResourceAsStream("out200.jpg"));
    Image image3 = new Image(getClass().getResourceAsStream("out500.jpg"));
    Image image4 = new Image(getClass().getResourceAsStream("out1000.jpg"));
    Image image5 = new Image(getClass().getResourceAsStream("out2000.jpg"));
    Image image6 = new Image(getClass().getResourceAsStream("out5000.jpg"));
    public String amount = "0";


    public void declineButtonClick(ActionEvent actionEvent) {
        if (amountField.getLength()>0){
            amountField.setText(amountField.getText().substring(0, amountField.getLength()-1));
        } else {
            Stage stage = (Stage) infoText.getScene().getWindow();
            stage.close();
        }
    }

    public void acceptButtonClick(ActionEvent actionEvent) {
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

    public void grabHundred(MouseEvent mouseEvent) {
        amount = "100";
        notVisible();
    }

    public void grabTwohundred(MouseEvent mouseEvent) {
        amount="200";
        notVisible();
    }

    public void grabFivehundred(MouseEvent mouseEvent) {
        amount="500";
        notVisible();
    }

    public void grabThousand(MouseEvent mouseEvent) {
        amount="1000";
        notVisible();
    }

    public void grabTwothousand(MouseEvent mouseEvent) {
        amount="2000";
        notVisible();
    }

    public void grabFivethousand(MouseEvent mouseEvent) {
        amount="5000";
        notVisible();
    }
    public void notVisible(){
        infoText2.setText("Na váš účet bylo připásno "+amount+" CZK");
        hundredImg.setVisible(false);
        twohundredImg.setVisible(false);
        fivehundredImg.setVisible(false);
        thousandImg.setVisible(false);
        twothousandImg.setVisible(false);
        fivethousandImg.setVisible(false);
        addMoney();
    }
    public void addMoney(){
        int a = Integer.parseInt(amount);
        acc.setAccountBalance(acc.getAccountBalance()+a);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        hundredImg.setImage(image1);
        twohundredImg.setImage(image2);
        fivehundredImg.setImage(image3);
        thousandImg.setImage(image4);
        twothousandImg.setImage(image5);
        fivethousandImg.setImage(image6);
    }
}
