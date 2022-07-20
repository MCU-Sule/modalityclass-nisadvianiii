package com.example.t03_2072051.controller;


import com.example.t03_2072051.CoffeeShopApplication;
import com.example.t03_2072051.controller.MainForm;
import com.example.t03_2072051.model.MenuItem;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class AddForm implements Initializable {
    public TextField txtNama;
    public TextField txtHarga;
    public ComboBox cmbDis;
    public Button btnDis;
    public Button btnAddMenu;
    private ObservableList<MenuItem> oList;
    private Stage stage;


    public void onTambah(ActionEvent actionEvent) {
        String nama = txtNama.getText();
        int harga = Integer.parseInt(txtHarga.getText());
        int diskon = Integer.parseInt((cmbDis.getItems().toString()));

        oList.add(new MenuItem(nama,harga,diskon));

        txtNama.setText("");
        txtHarga.setText("");
    }

    public void addDiskon(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader;
        loader = new FXMLLoader(CoffeeShopApplication.class.getResource("AddDiscountForm.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        stage = new Stage();
    }
}
