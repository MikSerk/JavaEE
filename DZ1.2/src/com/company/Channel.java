package com.company;

public class Channel {
    String nameChannel;
    private static final int MAX_PROG = 3;
    Program [] programs = new Program[MAX_PROG];;

    public Channel(String nameChannel) {
        this.nameChannel = nameChannel;
    }
    public void addProgram (Program program,int i){

            programs [i-1]=program;

    }
}
