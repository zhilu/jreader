package com.shi.jreader.controller;

import com.shi.jreader.model.Task;
import com.shi.jreader.Manager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AddController {

    @FXML
    private TextArea taskConfig;

    @FXML
    private TextField taskUrl;

    @FXML
    void saveTask(ActionEvent event) {
        Task task = Task.of(taskUrl.getText(),taskConfig.getText());
        Manager.taskService.addTasks(task);
    }

    @FXML
    void initialize() {
        Manager.addController = this;
    }
}
