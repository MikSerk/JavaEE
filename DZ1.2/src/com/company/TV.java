package com.company;

public class TV {
    String nameTV;
    Channel channels;
    Controller controller;

    public TV(String nameTV) {
        this.nameTV = nameTV;
    }

    public void addChannel(Channel channel){
        this.channels=channel;
    }


}
