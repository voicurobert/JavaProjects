package main;

import beans.MyBean;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    /**
     * XML
     * Annotations
     */
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){

//            // by type, need a primary annotation
//            MyBean b1 = context.getBean(MyBean.class);
//            MyBean b2 = context.getBean(MyBean.class);
//            MyBean b3 = context.getBean(MyBean.class);
//            System.out.println(b1.getText());
//            System.out.println(b2.getText());
//            System.out.println(b3.getText());
//
//
//            // by name
//            //MyBean bb1 = context.getBean("myBean1", MyBean.class);
//            //MyBean bb2 = context.getBean("myBean2", MyBean.class);
//            MyBean bb1 = context.getBean("A", MyBean.class);
//            MyBean bb2 = context.getBean("B", MyBean.class);
//            System.out.println(bb1.getText());
//            System.out.println(bb2.getText());

            // stereotype
            MyBean b1 = context.getBean(MyBean.class);
            System.out.println(b1.getText());
        }
    }

}
