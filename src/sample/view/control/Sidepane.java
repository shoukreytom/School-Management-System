package sample.view.control;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import sample.Main;

public class Sidepane {

    @FXML
    private VBox pane;
    @FXML
    private Button more;
    @FXML
    private Button exit;
    private JFXButton logout = new JFXButton("Log out");
    private JFXButton update = new JFXButton("Update");
    private JFXButton help = new JFXButton("Help");
    private JFXButton less = new JFXButton("Show less");

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
        exit.setOnAction((e) -> {
            Main.stage.close();
            System.exit(0);
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

    @FXML
    public void loadTeachers() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/fxml/teachers.fxml"));
        Main.stage.setScene(new Scene(root, Main.stage.getWidth(), Main.stage.getHeight()));
    }

    @FXML
    public void loadStudents() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/fxml/students.fxml"));
        Main.stage.setScene(new Scene(root, Main.stage.getWidth(), Main.stage.getHeight()));
    }

}
