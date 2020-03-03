package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.HelloService;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            HelloService service = context.getBean(HelloService.class);
            String res = service.hello("John");
            System.out.println("Result is: " + res);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
