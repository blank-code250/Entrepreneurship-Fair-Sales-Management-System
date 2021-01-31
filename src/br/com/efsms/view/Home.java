package br.com.efsms.view;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.Button;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Home {

    @FXML
    private Pane root;

    @FXML
    private GridPane products;

    @FXML
    private Button cart;

    @FXML
    private Button addProduct;

    @FXML
    private VBox ordersBox;

    @FXML
    private Button closeOut;

    @FXML
    void renderAddProduct(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/addProduct.fxml"));
        loader.setRoot(this.root);
        loader.load();
    }

    @FXML
    void renderCart(ActionEvent event) {

    }

    @FXML
    void renderStatistcs(ActionEvent event) {

    }

}

