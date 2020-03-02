package main;

import beans.Cat;
import beans.Owner;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){

            //Cat x = context.getBean(Cat.class);
            Cat x = new Cat();

            Owner y = context.getBean(Owner.class);
            x.setName("Leo");
            System.out.println(x.toString());
            System.out.println(y.toString());
        }
    }

}
