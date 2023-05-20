package com.shi.jreader.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {

    private String title;
    private String url;
    private String config;

    public static Task of(String url, String config) {
        Task task = new Task();
        task.setUrl(url);
        task.setConfig(config);
        return task;
    }



    @Override
    public String toString() {
        return url;
    }

}
