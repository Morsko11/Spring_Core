package org.example.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Uborshik extends Employee{


    public Uborshik(@Qualifier("Zoo") Director director) {
        super(director);
    }

    @Override
    public void work() {

        System.out.println("Работает Уборщик");
    }
}
