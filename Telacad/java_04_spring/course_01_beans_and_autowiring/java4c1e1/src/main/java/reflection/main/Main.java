package reflection.main;

import reflection.beans.Punct;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            Class punctType = Class.forName("reflection.beans.Punct");
            Constructor constructor = punctType.getDeclaredConstructor();
            constructor.setAccessible(true);
            Punct p = (Punct) constructor.newInstance();

            Field[] fields = punctType.getDeclaredFields();

            for (Field x : fields) {
                x.setAccessible(true);
                if (x.isAnnotationPresent(Aleator.class)) {
                    x.setInt(p, new Random().nextInt());
                }
                if (x.isAnnotationPresent(Atribuie.class)) {
                    Atribuie a = x.getDeclaredAnnotation(Atribuie.class);
                    x.setInt(p, a.value());
                }
            }

            Method m = punctType.getDeclaredMethod("afisare");
            m.setAccessible(true);
            m.invoke(p);

            System.out.println(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
