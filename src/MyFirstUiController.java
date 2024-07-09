import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class MyFirstUiController {
    public TextField txtUserName;
    public TextField txtSelectedUserName;

    public void printMyNameOnAction(ActionEvent actionEvent) {
        txtSelectedUserName.setText(txtUserName.getText());
        txtUserName.setText("");
    }
}
