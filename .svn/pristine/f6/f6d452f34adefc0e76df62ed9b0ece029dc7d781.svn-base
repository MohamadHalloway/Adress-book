package jpp.addressbook.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


class ThreeButtonAlertBox {
    static int answer;

    static void display(String title, String message, String first, String second, String third) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(450);
        window.setMinHeight(150);
        window.setOnCloseRequest(e -> closeWindow(window));

        Label label = new Label();
        label.setText(message);
        Button firstButton = new Button(first);
        firstButton.setOnAction(e -> {
            answer = 0;
            window.close();
        });
        Button secondButton = new Button(second);
        secondButton.setOnAction(e -> {
            answer = 1;
            window.close();
        });
        Button thirdButton = new Button(third);
        thirdButton.setOnAction(e -> closeWindow(window));

        VBox layout = new VBox(10);
        HBox hBox = new HBox(2);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(firstButton, secondButton, thirdButton);
        layout.getChildren().addAll(label, hBox);

        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

    private static void closeWindow(Stage window) {
        answer = 2;
        window.close();
    }
}
