package br.com.efsms.view;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.layout.Pane;

public class addProduct {

    @FXML
    private Pane root;

    @FXML
    private TextField name;

    @FXML
    private TextField price;

    @FXML
    private Button addProduct;

    @FXML
    private Button backToHome;

    @FXML
    void addProduct(ActionEvent event) {
        ProductController controller = new ProductController();
        if(controller.addProduct(name.getText(), price.getText()) == true) {
           this.renderHome();
        }
    }

    @FXML
    void renderHome(ActionEvent event) {
        this.renderHome();
    }
    
    private void renderHome() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/home.fxml"));
        this.root.getChildren().clear();
        loader.setRoot(this.root);
        loader.load();
    }
}

