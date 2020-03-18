package exemplu2.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Exemplu1 {
    public static void main(String[] args) throws Exception {

        Class<Punct> punctClass = (Class<Punct>) Class.forName("exemplu2.main.Punct");

        Constructor<Punct> constructor = punctClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        Punct p = constructor.newInstance();

        Field xField = punctClass.getDeclaredField("x");

        xField.setAccessible(true);
        Valoare vX = xField.getDeclaredAnnotation(Valoare.class);

        xField.setInt(p, vX.value());

        Field yField = punctClass.getDeclaredField("y");

        yField.setAccessible(true);
        yField.setInt(p, 20);

        Method method = punctClass.getDeclaredMethod("afis");
        method.setAccessible(true);
        method.invoke(p);

    }
}
