import beans.Point;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            System.out.println("STARTING SPRING");
            Point p1 = (Point)context.getBean("point2", Point.class);
            p1.setY(100);
            p1.setX(1222);
            Point p2 = (Point)context.getBean("point2", Point.class);
            System.out.println(p2.getX());
        }
    }
}
