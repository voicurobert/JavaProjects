package config;

import beans.Point;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    public Point point1() {
        Point point = new Point();
        point.setX(10);
        point.setY(20);
        return point;
    }

    @Bean
    public Point point2() {
        Point point = new Point();
        point.setX(20);
        point.setY(30);
        return point;
    }
}
