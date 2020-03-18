package exemplu4.main;

import javassist.util.proxy.MethodFilter;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        HelloService service = getService();
        service.sayHello();
        service.sayBye();
    }

    private static HelloService getService() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ProxyFactory proxyFactory = createProxyFactory();
        return (HelloService) proxyFactory.create(new Class[]{}, new Object[]{}, createMethodHandler());
    }

    private static ProxyFactory createProxyFactory() {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setFilter(method -> method.isAnnotationPresent(Log.class));
        proxyFactory.setSuperclass(HelloService.class);

        return proxyFactory;
    }

    private static MethodHandler createMethodHandler() {
        return (o, method, method1, objects) -> {
            Log log = method.getDeclaredAnnotation(Log.class);
            System.out.println(log.value());
            return method1.invoke(o, objects);
        };
    }
}
