package ui;

import business.Apartment;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import db.ApartmentTextFile;
import java.time.LocalDateTime;
import java.util.Observable;

public class ApartmentControllerD {
    //ObservableList<String> apartmentOptions =
//        FXCollections.observableArrayList(
//                "101, 400sqft, $400",
//                "102, 600sqft, $600",
//                "103, 900sqft, $900"
//        );

    private static int nextApartmentId = 100;

    ObservableList<Apartment> apartmentOptions =
            FXCollections.observableArrayList(
                    new Apartment(++nextApartmentId, "101", 400, 1, 400.0),
                    new Apartment(++nextApartmentId, "102", 600, 1, 600.0),
                    new Apartment(++nextApartmentId, "103", 800, 1, 800.0),
                    new Apartment(++nextApartmentId, "104", 1000, 2, 1100.0)

            );
    @FXML
    private TextField apartmentNumTextField;
    @FXML
    private TextField squareFeetTextField;
    @FXML
    private TextField BathroomsTextField;
    @FXML
    private TextField apartmentIdTextField;
    @FXML
    private Label errorMsgLabel;
    @FXML
    private Label priceLabel;
    @FXML
    private Label updatedLabel;
    @FXML
    private ComboBox apartmentsComboBox;
    public static int tryParseInt (String value) {
        try {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException ex) {
            return 0;
        }
    }

    @FXML
    private void generateTestDataClicked(ActionEvent actionEvent) {
        this.apartmentsComboBox.setItems(apartmentOptions);
        if (this.apartmentsComboBox.getItems().size() > 0)
            this.apartmentsComboBox.getSelectionModel().selectFirst();
    }

    @FXML
    private void selectedApartmentChanged(ActionEvent actionEvent) {
        this.apartmentIdTextField.setText("");
        this.apartmentNumTextField.setText("");
        this.squareFeetTextField.setText("");
        this.BathroomsTextField.setText("");
        this.priceLabel.setText("");
        this.updatedLabel.setText("");

        Apartment selectedApartment = (Apartment) this.apartmentsComboBox.getValue();

        if (selectedApartment != null) {
            this.apartmentIdTextField.setText(Integer.toString(selectedApartment.getApartmentId()));
            this.apartmentNumTextField.setText(selectedApartment.getApartmentNum());
            this.squareFeetTextField.setText(Integer.toString(selectedApartment.getSquareFeet()));
            this.BathroomsTextField.setText(Integer.toString(selectedApartment.getBathrooms()));
            this.priceLabel.setText(Double.toString(selectedApartment.getPrice()));
            this.updatedLabel.setText(selectedApartment.getUpdated().toString());

            this.apartmentNumTextField.requestFocus();
        }
    }

    @FXML
    private void newApartmentButtonClicked(ActionEvent actionEvent) {
        Apartment newApartment = new Apartment(++nextApartmentId, "", 0, 0,0.0);
        this.apartmentOptions.add(newApartment);
        this.apartmentsComboBox.setValue(newApartment);
    }

    @FXML
    private void saveApartmentButtonClicked(ActionEvent actionEvent) {
        Apartment selectedApartment = (Apartment) this.apartmentsComboBox.getValue();

        String errMsg = "";

//apartmentNum
        if (errMsg.isEmpty())
            errMsg = selectedApartment.setApartmentNum(this.apartmentNumTextField.getText());
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
                errMsg = selectedApartment.setSquareFeet(sqrFeet);
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
                errMsg = selectedApartment.setBathrooms(bathrooms);
            this.errorMsgLabel.setText(errMsg);
            if (!errMsg.isEmpty()) {
                this.BathroomsTextField.requestFocus();
            }
        }

        //price
        if (errMsg.isEmpty()) {
            selectedApartment.setPrice();
            this.priceLabel.setText(Double.toString(selectedApartment.getPrice()));
            selectedApartment.setUpdated(LocalDateTime.now());
            this.updatedLabel.setText(selectedApartment.getUpdated().toString());
            this.apartmentsComboBox.setItems(this.apartmentOptions);

            ApartmentTextFile apartmentTextFile = new ApartmentTextFile();
            apartmentTextFile.saveAll(apartmentOptions);
        }
      }

    @FXML
    private void clearApartmentButtonClicked(ActionEvent actionEvent) {
        this.apartmentOptions.clear();
    }

    @FXML
    private void getApartmentsButtonClicked(ActionEvent actionEvent) {
        this.apartmentOptions.clear();
        ApartmentTextFile apartmentTextFile = new ApartmentTextFile();
        apartmentTextFile.getAll(this.apartmentOptions);
        this.apartmentsComboBox.setItems(apartmentOptions);
        if (this.apartmentsComboBox.getItems().size() > 0)
            this.apartmentsComboBox.getSelectionModel().selectFirst();
    }
}

