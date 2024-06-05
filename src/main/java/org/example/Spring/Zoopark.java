package org.example.Spring;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//@Service
//@Repository
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class Zoopark {

    private final Animal animal;
    private final Employee employee;


 

    public void info(){
        animal.makeVoice();
        employee.work();
        employee.getDirector().run();

    }
}
