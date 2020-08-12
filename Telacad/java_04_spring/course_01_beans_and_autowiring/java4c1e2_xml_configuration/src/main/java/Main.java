import beans.Ambalaj;
import beans.Punct;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Projects\\JavaProjects\\Telacad\\java_04_spring\\course_01_beans_and_autowiring\\java4c1e2_xml_configuration\\src\\main\\java\\config\\appContext.xml");
        // get bean
        Ambalaj p1 = context.getBean("ambalaj", Ambalaj.class);
        System.out.println(p1.getProdus());
        context.close();

    }
}
