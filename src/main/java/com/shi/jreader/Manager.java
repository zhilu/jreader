package com.shi.jreader;

import com.shi.jreader.controller.AddController;
import com.shi.jreader.controller.MainController;
import com.shi.jreader.service.TaskService;

public class Manager {

    public static final TaskService taskService = new TaskService();
    public static MainController mainController;
    public static AddController addController;
}
