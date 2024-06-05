package org.example.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class Koala extends Animal{

    public Koala( ) {
        super();
    }

    @Override
    public void makeVoice() {
        System.out.println("Im Koala");
    }
}
