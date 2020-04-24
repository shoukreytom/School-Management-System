package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Sidepane {

    @FXML
    private VBox pane;
    @FXML
    private Button more;
    private JFXButton logout = new JFXButton("Log out");
    private Button update = new Button("Update");
    private Button help = new Button("Help");
    private Button less = new Button("Show less");

    public void initialize() {
        logout.setPrefWidth(200);
        logout.setPrefHeight(35);
        update.setPrefWidth(200);
        update.setPrefHeight(35);
        help.setPrefWidth(200);
        help.setPrefHeight(35);
        less.setPrefWidth(200);
        less.setPrefHeight(35);
        less.setOnAction((e) -> {
            pane.getChildren().removeAll(logout, update, help, less);
            pane.getChildren().add(more);
        });
        System.out.println(Main.stage.getWidth());
    }

    @FXML
    public void more() {
        pane.getChildren().add(logout);
        pane.getChildren().add(update);
        pane.getChildren().add(help);
        pane.getChildren().add(less);
        pane.getChildren().remove(more);
    }

}
