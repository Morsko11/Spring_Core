package org.example.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Lev")
public class Lev extends Animal{
    public Lev() {
        super();
    }

    @Override
    public void makeVoice() {
        System.out.println("Im Lev");
    }
}
