package com.company;

import java.util.Random;

public class Controller {
    TV tv;
    Channel channel;

    public Controller(TV tv) {
        this.tv = tv;
    }

    public void on () {
        Random random=new Random();

        System.out.println(tv.channels.programs[random.nextInt(3)].nameProgram);
    }
}
