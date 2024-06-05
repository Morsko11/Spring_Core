package org.example.Spring;

import org.springframework.stereotype.Component;

public class DirectorPersonal implements Director{
    @Override
    public void run() {

        System.out.println("Директор Сотрудников");
    }


}
