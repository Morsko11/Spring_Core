package org.example;

import org.example.Spring.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       /* Zebra zebra = new Zebra("ZebraName","Dlin",44);
        DirectorZoo directorZoo = new DirectorZoo();
        Uborshik uborshik = new Uborshik("Valera",directorZoo);  // Это работа без Spring
        Zoopark zoopark = new Zoopark(zebra,uborshik);
        zoopark.info();*/


       /* ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);
        Zoopark bean = applicationContext.getBean(Zoopark.class);
        bean.info();*/
       ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.example.Spring");
        SingletonForBeen singletonForBeen = applicationContext.getBean(SingletonForBeen.class);
        System.out.println(singletonForBeen.getAge() + " " + singletonForBeen.getName());
        SingletonForBeen singletonForBeen1 = applicationContext.getBean(SingletonForBeen.class);
        System.out.println(singletonForBeen== singletonForBeen1);


    }

}