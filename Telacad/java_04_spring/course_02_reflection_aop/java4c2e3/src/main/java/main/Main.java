package main;

import beans.Cerc;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context;
        context = new FileSystemXmlApplicationContext("//Users//robert//Projects//JavaProjects//Telacad//java_04_spring//course_02_reflection_aop//java4c2e3//src//main//java//config//appContext.xml");

        Cerc c1 = context.getBean("cerc1", Cerc.class);
        System.out.println("raza: " + c1.getRaza());
        System.out.println("centru: " + c1.getCentru());
    }
}
