package com.company;

public class Controller {
    TV tv;
    Channel channel;

    public Controller(TV tv) {
        this.tv = tv;
    }

    public void on (int number) {
        System.out.println(tv.channels.programs[number]);
    }
}
