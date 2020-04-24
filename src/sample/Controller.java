package sample;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.animation.Interpolator;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import org.controlsfx.tools.Borders;

import javax.swing.*;

public class Controller {

    @FXML
    private JFXHamburger hamburger;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private SplitPane split;
    @FXML
    private GridPane adminTools;
    @FXML
    private TableView studentsTable;

    @FXML
    public void initialize() throws Exception{
        VBox vBox = FXMLLoader.load(getClass().getResource("/sample/sidepane.fxml"));
        drawer.setSidePane(vBox);
        drawer.setDefaultDrawerSize(hamburger.getPrefWidth());
        HamburgerBackArrowBasicTransition h = new HamburgerBackArrowBasicTransition(hamburger);
        h.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
//            hamburger.setTranslateX(hamburger.getLayoutX() + 10);
//            hamburger.setLayoutX(-3.0);
//            h.setRate(h.getRate()*-1);
//            h.setInterpolator(Interpolator.LINEAR);
//            h.play();
            drawer.setDefaultDrawerSize(vBox.getPrefWidth());

            if (drawer.isOpened()) {
                split.setTranslateX(10);
                split.setDividerPositions(0.7);
                AnchorPane.setLeftAnchor(split, 55d);
                AnchorPane.setRightAnchor(split, 0d);
                adminTools.setAlignment(Pos.CENTER);
                drawer.close();
            }
            else {
                split.setTranslateX(170);
                split.setDividerPositions(0.5);
                AnchorPane.setLeftAnchor(split, 55d);
                AnchorPane.setRightAnchor(split, 0d);
                adminTools.setAlignment(Pos.CENTER);
                drawer.open();
            }
        });
    }

}
