package ui;

import business.Building;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BuildingController {

    private Building building1 = null;
    private Building building2 = null;
    private Building building3 = null;

    @FXML
    private TextField buildingIdTextField;
    @FXML
    private TextField addressIdTextField;
    @FXML
    private TextField cityTextField;
    @FXML
    private TextField stateTextField;
    @FXML
    private TextField zipTextField;
    @FXML
    private TextField unitsTextField;
    @FXML
    private TextField updatedTextField;

    @FXML
    private void building1ButtonClicked(ActionEvent actionEvent) {
        if (this.building1 == null) {
            this.building1 = new Building(101, addressIdTextField.getText(), cityTextField.getText()
                    , stateTextField.getText(), zipTextField.getText(), unitsTextField.getText());
            this.buildingIdTextField.setText("");
            this.addressIdTextField.setText("");
            this.cityTextField.setText("");
            this.stateTextField.setText("");
            this.zipTextField.setText("");
            this.unitsTextField.setText("");
            updatedTextField.setText("");
            this.addressIdTextField.requestFocus();
        } else {
            this.buildingIdTextField.setText(Integer.toString(this.building1.getBuildingId()));
            this.addressIdTextField.setText(building1.getAddress());
            this.cityTextField.setText(building1.getCity());
            this.stateTextField.setText(building1.getState());
            this.zipTextField.setText(building1.getZip());
            this.unitsTextField.setText(building1.getUnits());
            updatedTextField.setText(this.building1.getUpdated().toString());
        }
    }

    @FXML
    private void building2ButtonClicked(ActionEvent actionEvent) {
        if (this.building2 == null) {
            this.building2 = new Building(102, addressIdTextField.getText(), cityTextField.getText()
                    , stateTextField.getText(), zipTextField.getText(), unitsTextField.getText());
            this.buildingIdTextField.setText("");
            this.addressIdTextField.setText("");
            this.cityTextField.setText("");
            this.stateTextField.setText("");
            this.zipTextField.setText("");
            this.unitsTextField.setText("");
            updatedTextField.setText("");
            this.addressIdTextField.requestFocus();
        } else {
            this.buildingIdTextField.setText(Integer.toString(this.building2.getBuildingId()));
            this.addressIdTextField.setText(building2.getAddress());
            this.cityTextField.setText(building2.getCity());
            this.stateTextField.setText(building2.getState());
            this.zipTextField.setText(building2.getZip());
            this.unitsTextField.setText(building2.getUnits());
            updatedTextField.setText(this.building2.getUpdated().toString());
        }

    }

    @FXML
    private void building3ButtonClicked(ActionEvent actionEvent) {
        if (this.building3 == null) {
            this.building3 = new Building(103, addressIdTextField.getText(), cityTextField.getText()
                    , stateTextField.getText(), zipTextField.getText(), unitsTextField.getText());
            this.buildingIdTextField.setText("");
            this.addressIdTextField.setText("");
            this.cityTextField.setText("");
            this.stateTextField.setText("");
            this.zipTextField.setText("");
            this.unitsTextField.setText("");
            updatedTextField.setText("");
            this.addressIdTextField.requestFocus();
        } else {
            this.buildingIdTextField.setText(Integer.toString(this.building3.getBuildingId()));
            this.addressIdTextField.setText(building3.getAddress());
            this.cityTextField.setText(building3.getCity());
            this.stateTextField.setText(building3.getState());
            this.zipTextField.setText(building3.getZip());
            this.unitsTextField.setText(building3.getUnits());
            updatedTextField.setText(this.building3.getUpdated().toString());
        }
    }
}
