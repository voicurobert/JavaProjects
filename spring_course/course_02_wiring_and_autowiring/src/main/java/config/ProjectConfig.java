package config;

import beans.Cat;
import beans.Owner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

//    @Bean
//    public Cat getCat() {
//        Cat c = new Cat();
//        c.setName("Tom");
//        return c;
//    }
//
//
//    // by placing the parameter, spring knows to auto wire
//    @Bean
//    public Owner owner(Cat cat) {
//        Owner o = new Owner();
//        // calling cat() method, retrieves the instance from the context
//        // o.setCat(cat());
//        o.setCat(cat);
//        return o;
//    }

    @Bean
    @Qualifier("cat1")
    public Cat cat1(){
        Cat c = new Cat();
        c.setName("Tom");
        return c;
    }

    @Bean
    @Qualifier("cat2")
    public Cat cat2(){
        Cat c = new Cat();
        c.setName("Leo");
        return c;
    }

}
