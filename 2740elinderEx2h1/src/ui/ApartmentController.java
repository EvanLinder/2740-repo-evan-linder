package ui;
import java.text.NumberFormat;

import business.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import business.Apartment;
public class ApartmentController {
    private Apartment apartment1 = null;
    private Apartment apartment2 = null;
    private Apartment apartment3 = null;

    @FXML private TextField apartmentNumTextField;
    @FXML private TextField squareFeetTextField;
    @FXML private TextField BathroomsTextField;
    @FXML private TextField apartmentIdTextField;
    @FXML private Label errorMsgLabel;
    @FXML private Label priceLabel;
    @FXML private Label updatedLabel;
    @FXML
    private Button apt1Button;
    @FXML
    private Button apt2Button;
    @FXML
    private Button apt3Button;
    @FXML
    private Button displayButton1;
    @FXML
    private Button displayButton2;
    @FXML
    private Button displayButton3;

    public static int tryParseInt (String value) {
        try {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException ex) {
            return 0;
        }
    }

    @FXML
    private void apt1ButtonClicked(ActionEvent actionEvent) {
        String errMsg = "";
    if (this.apartment1 == null) {
        this.apartment1 = new Apartment();

    }   //apartmentId
        int aptId = tryParseInt(this.apartmentIdTextField.getText());
        if (aptId == 0)
            errMsg = "Apartment Id is required";
        else
        errMsg = this.apartment1.setApartmentId(aptId);
        this.errorMsgLabel.setText(errMsg);
        if (!errMsg.isEmpty()) {
            this.apartmentIdTextField.requestFocus();
        }
//apartmentNum
        if (errMsg.isEmpty())
            errMsg = this.apartment1.setApartmentNum(this.apartmentNumTextField.getText());
        this.errorMsgLabel.setText(errMsg);
        if (!errMsg.isEmpty()){
            this.apartmentNumTextField.requestFocus();
        }

        //squareFeet
       if (errMsg.isEmpty()) {
           int sqrFeet = tryParseInt(this.squareFeetTextField.getText());
           if (sqrFeet == 0)
               errMsg = "Square Feet is required";
           else
               errMsg = this.apartment1.setSquareFeet(sqrFeet);
           this.errorMsgLabel.setText(errMsg);
           if (!errMsg.isEmpty()) {
               this.squareFeetTextField.requestFocus();
           }
        }

       //bathrooms
        if (errMsg.isEmpty()) {
            int bathrooms = tryParseInt(this.BathroomsTextField.getText());
            if (bathrooms == 0)
                errMsg = "Bathrooms are required";
            else
                errMsg = this.apartment1.setBathrooms(bathrooms);
            this.errorMsgLabel.setText(errMsg);
            if (!errMsg.isEmpty()) {
                this.BathroomsTextField.requestFocus();
            }
        }

        //price
        if (errMsg.isEmpty()) {
           this.priceLabel.setText(Double.toString(this.apartment1.getPrice()));
        }


        //updated
        this.updatedLabel.setText(this.apartment1.getUpdated().toString());

        if (!this.errorMsgLabel.getText().isEmpty())
            this.apartment1 = null;
        else {
            this.apartmentIdTextField.setText("");
            this.apartmentNumTextField.setText("");
            this.squareFeetTextField.setText("");
            this.BathroomsTextField.setText("");
            this.priceLabel.setText("");
            this.updatedLabel.setText("");
            this.apt1Button.setDisable(true);
            this.displayButton1.setDisable(false);
            this.apartmentIdTextField.requestFocus();
        }


    }

    @FXML
    private void apt2ButtonClicked(ActionEvent actionEvent) {
        String errMsg = "";
        if (this.apartment2 == null) {
            this.apartment2 = new Apartment();

        }   //apartmentId
        int aptId = tryParseInt(this.apartmentIdTextField.getText());
        if (aptId == 0)
            errMsg = "Apartment Id is required";
        else
            errMsg = this.apartment2.setApartmentId(aptId);
        this.errorMsgLabel.setText(errMsg);
        if (!errMsg.isEmpty()) {
            this.apartmentIdTextField.requestFocus();
        }
//apartmentNum
        if (errMsg.isEmpty())
            errMsg = this.apartment2.setApartmentNum(this.apartmentNumTextField.getText());
        this.errorMsgLabel.setText(errMsg);
        if (!errMsg.isEmpty()){
            this.apartmentNumTextField.requestFocus();
        }

        //squareFeet
        if (errMsg.isEmpty()) {
            int sqrFeet = tryParseInt(this.squareFeetTextField.getText());
            if (sqrFeet == 0)
                errMsg = "Square Feet is required";
            else
                errMsg = this.apartment2.setSquareFeet(sqrFeet);
            this.errorMsgLabel.setText(errMsg);
            if (!errMsg.isEmpty()) {
                this.squareFeetTextField.requestFocus();
            }
        }

        //bathrooms
        if (errMsg.isEmpty()) {
            int bathrooms = tryParseInt(this.BathroomsTextField.getText());
            if (bathrooms == 0)
                errMsg = "Bathrooms are required";
            else
                errMsg = this.apartment2.setBathrooms(bathrooms);
            this.errorMsgLabel.setText(errMsg);
            if (!errMsg.isEmpty()) {
                this.BathroomsTextField.requestFocus();
            }
        }

        //price
        if (errMsg.isEmpty()) {
            this.priceLabel.setText(Double.toString(this.apartment2.getPrice()));
        }


        //updated
        this.updatedLabel.setText(this.apartment2.getUpdated().toString());

        if (!this.errorMsgLabel.getText().isEmpty())
            this.apartment2 = null;
        else {
            this.apartmentIdTextField.setText("");
            this.apartmentNumTextField.setText("");
            this.squareFeetTextField.setText("");
            this.BathroomsTextField.setText("");
            this.priceLabel.setText("");
            this.updatedLabel.setText("");
            this.apt2Button.setDisable(true);
            this.displayButton2.setDisable(false);
            this.apartmentIdTextField.requestFocus();
        }
    }

    @FXML
    private void apt3ButtonClicked(ActionEvent actionEvent) {
        String errMsg = "";
        if (this.apartment3 == null) {
            this.apartment3 = new Apartment();

        }   //apartmentId
        int aptId = tryParseInt(this.apartmentIdTextField.getText());
        if (aptId == 0)
            errMsg = "Apartment Id is required";
        else
            errMsg = this.apartment3.setApartmentId(aptId);
        this.errorMsgLabel.setText(errMsg);
        if (!errMsg.isEmpty()) {
            this.apartmentIdTextField.requestFocus();
        }
//apartmentNum
        if (errMsg.isEmpty())
            errMsg = this.apartment3.setApartmentNum(this.apartmentNumTextField.getText());
        this.errorMsgLabel.setText(errMsg);
        if (!errMsg.isEmpty()){
            this.apartmentNumTextField.requestFocus();
        }

        //squareFeet
        if (errMsg.isEmpty()) {
            int sqrFeet = tryParseInt(this.squareFeetTextField.getText());
            if (sqrFeet == 0)
                errMsg = "Square Feet is required";
            else
                errMsg = this.apartment3.setSquareFeet(sqrFeet);
            this.errorMsgLabel.setText(errMsg);
            if (!errMsg.isEmpty()) {
                this.squareFeetTextField.requestFocus();
            }
        }

        //bathrooms
        if (errMsg.isEmpty()) {
            int bathrooms = tryParseInt(this.BathroomsTextField.getText());
            if (bathrooms == 0)
                errMsg = "Bathrooms are required";
            else
                errMsg = this.apartment3.setBathrooms(bathrooms);
            this.errorMsgLabel.setText(errMsg);
            if (!errMsg.isEmpty()) {
                this.BathroomsTextField.requestFocus();
            }
        }

        //price
        if (errMsg.isEmpty()) {
            this.priceLabel.setText(Double.toString(this.apartment3.getPrice()));
        }


        //updated
        this.updatedLabel.setText(this.apartment3.getUpdated().toString());

        if (!this.errorMsgLabel.getText().isEmpty())
            this.apartment3 = null;
        else {
            this.apartmentIdTextField.setText("");
            this.apartmentNumTextField.setText("");
            this.squareFeetTextField.setText("");
            this.BathroomsTextField.setText("");
            this.priceLabel.setText("");
            this.updatedLabel.setText("");
            this.apt3Button.setDisable(true);
            this.displayButton3.setDisable(false);
            this.apartmentIdTextField.requestFocus();
        }
    }

    @FXML
    private void displayApartment1Clicked(ActionEvent actionEvent) {
    if (this.apartment1 != null) {
        this.apartmentIdTextField.setText(Integer.toString(this.apartment1.getApartmentId()));
        this.apartmentNumTextField.setText(this.apartment1.getApartmentNum());
        this.squareFeetTextField.setText(Integer.toString(this.apartment1.getSquareFeet()));
        this.BathroomsTextField.setText(Integer.toString(this.apartment1.getBathrooms()));
        this.priceLabel.setText(Double.toString(this.apartment1.getPrice()));
        this.updatedLabel.setText(this.apartment1.getUpdated().toString());
        this.displayButton1.setDisable(true);
        this.apt1Button.setDisable(false);
        this.apartmentIdTextField.requestFocus();
    }
    }

    @FXML
    private void displayApartment2Clicked(ActionEvent actionEvent) {
        if (this.apartment2 != null) {
            this.apartmentIdTextField.setText(Integer.toString(this.apartment2.getApartmentId()));
            this.apartmentNumTextField.setText(this.apartment2.getApartmentNum());
            this.squareFeetTextField.setText(Integer.toString(this.apartment2.getSquareFeet()));
            this.BathroomsTextField.setText(Integer.toString(this.apartment2.getBathrooms()));
            this.priceLabel.setText(Double.toString(this.apartment2.getPrice()));
            this.updatedLabel.setText(this.apartment2.getUpdated().toString());
            this.displayButton2.setDisable(true);
            this.apt2Button.setDisable(false);
            this.apartmentIdTextField.requestFocus();
        }
    }

    @FXML
    private void displayApartment3Clicked(ActionEvent actionEvent) {
        if (this.apartment3 != null) {
            this.apartmentIdTextField.setText(Integer.toString(this.apartment3.getApartmentId()));
            this.apartmentNumTextField.setText(this.apartment3.getApartmentNum());
            this.squareFeetTextField.setText(Integer.toString(this.apartment3.getSquareFeet()));
            this.BathroomsTextField.setText(Integer.toString(this.apartment3.getBathrooms()));
            this.priceLabel.setText(Double.toString(this.apartment3.getPrice()));
            this.updatedLabel.setText(this.apartment3.getUpdated().toString());
            this.displayButton3.setDisable(true);
            this.apt3Button.setDisable(false);
            this.apartmentIdTextField.requestFocus();
        }
    }
}

