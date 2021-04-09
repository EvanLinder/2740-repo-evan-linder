
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class quizcontroller {

    @FXML
    private TextField txtOne;
    @FXML
    private TextField txtTwo;
    @FXML
    private TextField txtThree;
    @FXML
    private TextField txtFour;
    @FXML
    private TextField lblFive;
    @FXML
    private Button BtnOneListener;

    @FXML
    private void BtnOneClicked(ActionEvent actionEvent) {
        int i1 = Integer.parseInt(txtOne.getText());
        int i2 = Integer.parseInt(txtTwo.getText());
        String s1 = txtThree.getText();
        String s2 = txtFour.getText();
        String out = "";


        if (i1 > 2 && i1 <= 5){
            out  += "A";
            if (s1.equals("1")) out += "B";
            else {
                out += "C";
            }
            out += "D";
            if (i2 < 2 && i2 > 5) out += "E";
        }
        else {
            out += "F";
            if (s1.compareTo("3") >= 0){
                out += "G";
            }
            out += "H";
            if (i2 > 2 || i2 < 5) out  += "I";
            else {
                out += "J";
            }
        }
        out += "K";
        lblFive.setText(out);
    }
}
