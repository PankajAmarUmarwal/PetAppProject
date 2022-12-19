package com.example.custom_listview;

public class User {

    String name, lastMessage, lastMsgTime, phoneNo, url;
    int imageId;

    public User(String name, String lastMessage, String lastMsgTime, String phoneNo, String country, int imageId) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.lastMsgTime = lastMsgTime;
        this.phoneNo = phoneNo;
        this.url = url;
        this.imageId = imageId;
    }
}
