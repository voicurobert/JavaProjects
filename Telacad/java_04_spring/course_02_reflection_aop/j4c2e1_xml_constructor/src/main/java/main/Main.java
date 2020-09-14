package main;

import main.beans.Cerc;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = null;
        try {
             context = new FileSystemXmlApplicationContext("//Users//robert//Projects//JavaProjects//Telacad//java_04_spring//course_02_reflection_aop//j4c2e1_xml_constructor//src//main//java//main//config//appContext.xml");
             Cerc cerc = context.getBean(Cerc.class);
             System.out.println(cerc.getRaza());
            System.out.println(cerc.getCentru().getX());
        } finally {
            if (context != null) {
                context.close();
            }
        }
    }
}
