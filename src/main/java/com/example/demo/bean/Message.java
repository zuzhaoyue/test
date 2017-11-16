package com.example.demo.bean;

import java.io.Serializable;

/**
 * Created by zuzhaoyue on 17/11/13.
 */
public class Message implements Serializable {

    private Integer id;
    private String content;

    public Message(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
