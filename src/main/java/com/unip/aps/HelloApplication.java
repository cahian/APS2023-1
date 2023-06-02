package com.unip.aps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.List;

public class HelloApplication extends Application {
    private ONGSearchService ongSearchService = new ONGSearchService();

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

        // List View for displaying the NGOs
        ListView<String> ongListView = new ListView<>();
        grid.add(ongListView, 0, 3, 2, 1);

        // Event Handler for the search button
        searchButton.setOnAction(e -> {
            String name = nameField.getText();
            String address = addressField.getText();

            // Call the ONGSearchService to get the list of NGOs
            List<String> ongs = ongSearchService.searchNGOs(name, address);

            // Clear the list view and display the NGOs
            ongListView.getItems().clear();
            ongListView.getItems().addAll(ongs);
        });

        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
