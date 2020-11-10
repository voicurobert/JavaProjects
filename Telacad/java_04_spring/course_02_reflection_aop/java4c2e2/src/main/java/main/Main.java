package main;

import beans.Punct;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context;
        context = new FileSystemXmlApplicationContext("//Users//robert//Projects//JavaProjects//Telacad//java_04_spring//course_02_reflection_aop//java4c2e2//src//main//java//config//appContext.xml");

        Punct p1 = context.getBean("punct1", Punct.class);
        System.out.println("x: " + p1.getX() + " y:" + p1.getY());
        p1.setX(20);
        p1.setY(23);
        System.out.println("x: " + p1.getX() + " y:" + p1.getY());

        Punct p2 = context.getBean("punct1", Punct.class);
        System.out.println("x: " + p2.getX() + " y:" + p2.getY());

        Punct p3 = context.getBean("punct2", Punct.class);
        System.out.println("x: " + p3.getX() + " y:" + p3.getY());

    }
}
