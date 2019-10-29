package jpp.addressbook.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class YesNoAlertBox {
    static boolean answer;
    public static void display(String title, String message) {
        Stage window = new Stage();
        boolean res = false;
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(450);
        window.setMinHeight(150);
        window.setOnCloseRequest(e -> closeWindow(window));

        Label label = new Label();
        label.setText(message);
        Button yesButton = new Button("Yes");
        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        Button noButton = new Button("No");
        noButton.setOnAction(e -> closeWindow(window));

        VBox layout = new VBox(10);
        HBox hBox = new HBox(2);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(yesButton,noButton);
        layout.getChildren().addAll(label,hBox);

        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

    private static void closeWindow(Stage window) {
        answer = false;
        window.close();
    }
}
