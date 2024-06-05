package org.example.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example.Spring")
public class ConfigClass {
    //Второй способ реализации через конфигурацию
    @Bean
    public Director director() {
        return new DirectorPersonal();
    }

    @Bean
    public Employee employee() {
        return new Ohrana(director());
    }

    @Bean
    public Animal animal() {
        return new Koala();
    }

    @Bean
    Employee employee1() {
        return new Uborshik(director());
    }

    @Bean
    public Animal animal1() {
        return new Lev();
    }

    @Bean
    public Zoopark zoopark() {
        return new Zoopark(animal1(), employee());
    }

  /*  @Bean
    public String name() {
        return "Oleg";
    }

    @Bean
    public int age() {
        return 44;
    }*/
}
