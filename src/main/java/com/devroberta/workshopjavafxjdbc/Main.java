
package com.devroberta.workshopjavafxjdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Scene scene;
    @Override
    public synchronized void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
            ScrollPane scrollPane = fxmlLoader.load();

            scrollPane.setFitToHeight(true);
            scrollPane.setFitToWidth(true);

            scene = new Scene(scrollPane);
            stage.setTitle("Sample JavaFX application");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Scene getScene() {
        return scene;
    }
    public static void main(String[] args) {
        launch();
    }
}