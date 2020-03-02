package config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"services", "repositories"})
public class ProjectConfig {

//    @Bean("A")
//    @Primary
//    public MyBean myBean1() {
//        MyBean bean = new MyBean();
//        bean.setText("Hello");
//        return bean;
//    }
//
//    @Bean("B")
//    public MyBean myBean2() {
//        MyBean bean = new MyBean();
//        bean.setText("World");
//        return bean;
//    }
}
