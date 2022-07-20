package com.example.t03_2072051.controller;

import com.example.t03_2072051.CoffeeShopApplication;
import com.example.t03_2072051.model.MenuItem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainForm implements Initializable {
    public ListView list1;
    public Button btnAdd;
    public Label welcomeText;
    private ObservableList<MenuItem> oList;
    private Stage stage;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stage = new Stage();
        oList = FXCollections.observableArrayList(
                new MenuItem("caramel machiato", 40000, 10),
                new MenuItem("Caramel Latte", 65000, 0),
                new MenuItem("Espresso", 50000, 0),
                new MenuItem("Mocha Latte", 62500, 0)
                );
        list1.setItems(oList);
    }


    public void addData(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader;
        loader = new FXMLLoader(CoffeeShopApplication.class.getResource("AddForm.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }
}