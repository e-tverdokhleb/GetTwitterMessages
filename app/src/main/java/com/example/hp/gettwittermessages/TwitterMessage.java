package com.example.hp.gettwittermessages;

public class TwitterMessage {
    private String title;
    private String desc;
    private long time;

     TwitterMessage(String title, String desc, long time) {
        this.title = title;
        this.desc = desc;
        this.time = time;
    }

    public String getMessageTitle(){
        return this.title;
    }

    public String getMessageDescription(){
        return this.desc;
    }
}