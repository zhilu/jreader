package com.shi.jreader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ReaderApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(ReaderApp.class.getResource("/fxml/main-view.fxml"));



        Scene scene = new Scene(root, 900, 720);
        stage.setTitle("reader");
        stage.setScene(scene);
        stage.show();
    }

}
