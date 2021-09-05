package com.company;

public class Channel {
    String nameChannel;
    Program [] programs;

    public Channel(String nameChannel) {
        this.nameChannel = nameChannel;
    }
    public void addProgram(Program program,int i){
        programs = new Program[3];
            programs [i-1]=program;

    }
}
