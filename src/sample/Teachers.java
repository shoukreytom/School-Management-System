package sample;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Teachers {

    @FXML
    private JFXHamburger hamburger;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private GridPane adminTools;
    @FXML
    private TableView<TeachersModel> teachersTable;

    @FXML
    public void initialize() throws Exception{
        VBox vBox = FXMLLoader.load(getClass().getResource("/sample/sidepane.fxml"));
        drawer.setSidePane(vBox);
        drawer.setDefaultDrawerSize(hamburger.getPrefWidth());
//        HamburgerBackArrowBasicTransition h = new HamburgerBackArrowBasicTransition(hamburger);
//        h.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
            drawer.setVisible(true);
            drawer.setDefaultDrawerSize(vBox.getPrefWidth());

            if (drawer.isOpened()) {
                drawer.close();
                drawer.setDefaultDrawerSize(hamburger.getPrefWidth());
                drawer.setVisible(false);
            }
            else {
                drawer.open();
            }
        });
    }

}
