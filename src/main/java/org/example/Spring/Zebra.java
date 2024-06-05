package org.example.Spring;

import org.springframework.stereotype.Component;


public class Zebra extends Animal {


    public Zebra( ) {
        super();
    }

    @Override
    public void makeVoice() {
        System.out.println("im zebra");
    }
}
