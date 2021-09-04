package com.company;

public class Channel {
    String nameChannel;
    Program [] programs;

    public Channel(String nameChannel) {
        this.nameChannel = nameChannel;
    }
    public void addProgram(Program program){
        for (int i = 0; i < 3; i++) {
            programs [i]=program;
        }
    }
}
