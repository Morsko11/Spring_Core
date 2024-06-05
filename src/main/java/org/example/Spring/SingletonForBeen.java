package org.example.Spring;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Getter
@Setter
@PropertySource("classpath:application.yml")
public class SingletonForBeen {
    private String name;
    private int age;

    @Autowired
    public SingletonForBeen(@Value(value = "${name}") String name,@Value(value = "${age}") int age) {
        this.name = name;
        this.age = age;
    }
}
