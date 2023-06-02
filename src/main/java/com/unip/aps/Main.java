package com.unip.aps;

import com.unip.aps.view.ONGView;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        new ONGView().start(primaryStage);
    }

    public static void main(String[] args) {
        ONGView.launch(args);
    }
}
