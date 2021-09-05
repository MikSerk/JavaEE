package com.company;

public class Channel {
    String nameChannel;
    Program [] programs = new Program[3];;

    public Channel(String nameChannel) {
        this.nameChannel = nameChannel;
    }
    public void addProgram(Program program,int i){

            programs [i-1]=program;

    }
}
