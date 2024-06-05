package org.example.Spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Setter



public abstract class Employee {
    private Director  director;

    public Employee(Director director) {
        this.director = director;


    }


    public void work() {
        director.run();
    }


}
