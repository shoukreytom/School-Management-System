package sample;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.animation.Interpolator;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

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
    private TableColumn<String, StudentsModel> phone;

    @FXML
    public void initialize() throws Exception{
        /////////// SidePane ///////////////////
        VBox vBox = FXMLLoader.load(getClass().getResource("/sample/sidepane.fxml"));
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
            }
            else {
                drawer.open();
            }
        });
        //////////////////////////////////////////////////////////////////

    }

}
