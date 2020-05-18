package sample.view;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import sample.model.StudentsModel;

import java.io.IOException;

public class Students {

    @FXML
    private JFXHamburger hamburger;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private GridPane adminTools;
    @FXML
    private TableView<StudentsModel> studentsTable;
    @FXML
    private TableColumn<Integer, StudentsModel> id;
    @FXML
    private TableColumn<String, StudentsModel> name;
    @FXML
    private TableColumn<String, StudentsModel> className;
    @FXML
    private TableColumn<String, StudentsModel> address;
    @FXML
    private TableColumn<String, StudentsModel> phone;
    @FXML
    private TextField fName;
    @FXML
    private TextField fClass;
    @FXML
    private TextField fAddress;
    @FXML
    private TextField fPhone;

    @FXML
    public void initialize() throws Exception {
        /////////// SidePane ///////////////////
        VBox vBox = FXMLLoader.load(getClass().getResource("/sample/view/sidepane.fxml"));
        drawer.setSidePane(vBox);
        drawer.setDefaultDrawerSize(hamburger.getPrefWidth());
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
            drawer.setVisible(true);
            drawer.setDefaultDrawerSize(vBox.getPrefWidth());

            if (drawer.isOpened()) {
                drawer.close();
                hamburger.setPrefWidth(40d);
                drawer.setDefaultDrawerSize(40d);
                drawer.setVisible(false);
            } else {
                drawer.open();
            }
        });
        //////////////////////////////////////////////////////////////////
    }

    @FXML
    public void submit() throws InterruptedException, IOException {
        Validator validator = new Validator();
        if (validator.validatePhone(fPhone.getText())) {
            // add student to database priority
        } else {
            Alert error = new Alert(Alert.AlertType.ERROR);
            HBox hBox = new HBox();
            error.setResult(ButtonType.CLOSE);
            error.setTitle("Error");
            error.setContentText("Invalid phone number");
            error.show();
        }
    }

    @FXML
    public void reset() {
        fName.setText("");
        fClass.setText("");
        fAddress.setText("");
        fPhone.setText("");
    }

}
