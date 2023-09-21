package com.vocabularyapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PracticeApplication extends Application {
    private Dictionary dictionary;

    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage window) throws Exception {
        PracticeView practiceView = new PracticeView(dictionary);
        InputView inputView = new InputView(dictionary);

        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setAlignment(Pos.CENTER);
        menu.setSpacing(10);
        menu.setPadding(new Insets(10, 10, 10, 10));

        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");
        menu.getChildren().addAll(enterButton, practiceButton);

        layout.setTop(menu);
        layout.setCenter(inputView.getView());

        enterButton.setOnAction((event) -> layout.setCenter(inputView.getView()));
        practiceButton.setOnAction((event) -> layout.setCenter(practiceView.getView()));

        Scene view = new Scene(layout, 400, 400);
        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(PracticeApplication.class);
    }
}
