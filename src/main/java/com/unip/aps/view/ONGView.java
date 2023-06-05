package com.unip.aps.view;

import com.unip.aps.controller.ONGController;
import com.unip.aps.model.ONG;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.List;

public class ONGView extends Application {
    private ONGController ongController = new ONGController();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("APS 2023-1");
        primaryStage.setHeight(600);
        primaryStage.setWidth(1000);

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

        // ONG Details
        Label ongNameLabel = new Label("Nome:");
        grid.add(ongNameLabel, 0, 3);

        Label ongDescriptionLabel = new Label("Descrição:");
        grid.add(ongDescriptionLabel, 0, 4);

        Label ongPhoneLabel = new Label("Telefone:");
        grid.add(ongPhoneLabel, 0, 5);

        TextArea ongDescriptionArea = new TextArea();
        ongDescriptionArea.setEditable(false);
        ongDescriptionArea.setWrapText(true);
        grid.add(ongDescriptionArea, 1, 4);

        TextField ongPhoneField = new TextField();
        ongPhoneField.setEditable(false);
        grid.add(ongPhoneField, 1, 5);

        // List View for displaying the NGOs
        ListView<ONG> ongListView = new ListView<>();
        grid.add(ongListView, 0, 6, 2, 1);

        // Event Handler for the search button
        searchButton.setOnAction(e -> {
            String name = nameField.getText();
            String address = addressField.getText();

            // Call the ONGSearchService to get the list of NGOs
            List<ONG> ongs = ongController.buscarOngsProximas(name, address);

            // Clear the list view and display the NGOs
            ongListView.getItems().clear();
            ongListView.getItems().addAll(ongs);
        });

        // Event Handler for selecting an NGO from the list view
        ongListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                ongNameLabel.setText("Nome: " + newValue.getNome());
                ongDescriptionArea.setText(newValue.getDescricao());
                ongPhoneField.setText(newValue.getTelefone());
            }
        });

        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
