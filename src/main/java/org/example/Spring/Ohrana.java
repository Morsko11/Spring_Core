package org.example.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class Ohrana extends Employee{
    public Ohrana(Director director) {
        super(director);
         }

    @Override
    public void work() {



        System.out.println("Работает охранник");


    }
}
