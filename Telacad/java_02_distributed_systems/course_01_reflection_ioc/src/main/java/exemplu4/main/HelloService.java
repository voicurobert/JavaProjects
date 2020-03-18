package exemplu4.main;

public class HelloService {

    public void sayHello() {
        System.out.println("Hello");
    }

    @Log("log say bye")
    public void sayBye() {
        System.out.println("Bye");
    }
}
