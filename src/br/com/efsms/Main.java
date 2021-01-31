package br.com.efsms;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXMLLoader;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Sistema de Gerenciamento de Vendas para a Feira de Empreendedorismo");
        Parent root = FXMLLoader.load(getClass().getResource("view/fxml/home.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
       launch(args);
    }
}
