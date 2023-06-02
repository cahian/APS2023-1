package com.unip.aps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Poverty Eradication App");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Labels
        Label nameLabel = new Label("Nome:");
        grid.add(nameLabel, 0, 0);

        Label addressLabel = new Label("Endereço:");
        grid.add(addressLabel, 0, 1);

        // Text Fields
        TextField nameField = new TextField();
        grid.add(nameField, 1, 0);

        TextField addressField = new TextField();
        grid.add(addressField, 1, 1);

        // Search Button
        Button searchButton = new Button("Buscar ONGs");
        grid.add(searchButton, 0, 2);

        // Event Handler for the search button
        searchButton.setOnAction(e -> {
            String name = nameField.getText();
            String address = addressField.getText();

            // Perform the search for NGOs based on the provided information
            // Call a method or class that searches for NGOs and returns a list of nearby NGOs
            // Display the list of NGOs to the user
        });

        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}