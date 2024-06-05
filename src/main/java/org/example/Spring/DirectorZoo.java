package org.example.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class DirectorZoo implements Director{
    @Override

    public void run() {
        System.out.println("Директор зоопарка");
    }
}
