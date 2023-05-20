package com.shi.jreader.controller;

import com.shi.jreader.Manager;
import com.shi.jreader.ReaderApp;
import com.shi.jreader.model.Post;
import com.shi.jreader.model.Task;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;


public class MainController{

    @FXML
    private ListView<Task> listView;
    @FXML
    private ListView<Post> itemView;
    @FXML
    private WebView webView;

    @FXML
    void initialize() {
        Manager.mainController = this;
        listView.getFocusModel();
    }

    @FXML
    void onClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(ReaderApp.class.getResource("/fxml/add-view.fxml"));
        Scene scene = new Scene(root, 500, 400);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onSync(ActionEvent event) {
        Task task = listView.getSelectionModel().getSelectedItem();
        Manager.taskService.loadPost(task);
    }

    @FXML
    void onDelete(ActionEvent event) {

    }






    public ObservableList<Task> getTasks() {
        return listView.getItems();
    }
}
