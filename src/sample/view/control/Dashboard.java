package sample.view.control;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Dashboard implements Initializable {

    @FXML
    private JFXHamburger hamburger;
    @FXML
    private JFXDrawer drawer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /////////// SidePane ///////////////////
        VBox vBox = null;
        try {
            vBox = FXMLLoader.load(getClass().getResource("/sample/view/fxml/sidepane.fxml"));
            vBox.getChildren().remove(0);
            drawer.setSidePane(vBox);
            drawer.setDefaultDrawerSize(hamburger.getPrefWidth());
            VBox finalVBox = vBox;
            hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
                drawer.setVisible(true);
                drawer.setDefaultDrawerSize(finalVBox.getPrefWidth());

                if (drawer.isOpened()) {
                    drawer.close();
                    hamburger.setPrefWidth(40d);
                    drawer.setDefaultDrawerSize(40d);
                    drawer.setVisible(false);
                } else {
                    drawer.open();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        //////////////////////////////////////////////////////////////////
    }
}
