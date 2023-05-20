package com.shi.jreader.service;

import com.shi.jreader.Manager;
import com.shi.jreader.model.Post;
import com.shi.jreader.model.Task;
import javafx.collections.ObservableList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TaskService {

    public static final String AGENT="Mozilla";

    public void addTasks(Task task){
        ObservableList<Task> tasks = Manager.mainController.getTasks();
        tasks.add(task);
    }

    public List<Post> loadPost(Task task ) {
        try{
            Document doc = Jsoup.connect(task.getUrl())
                    .userAgent(AGENT)
                    .timeout(8000)
                    .post();
            System.out.println(doc);
        }catch (Exception e){

        }

        return new ArrayList<>();
    }
}
