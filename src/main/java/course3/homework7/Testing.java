package course3.homework7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

public class Testing {

    public static void start(Class c) throws InvocationTargetException, IllegalAccessException {
        if (c.isAnnotationPresent(AfterSuite.class) || c.isAnnotationPresent(BeforeSuite.class) || c.isAnnotationPresent(Test.class)) {
            throw new RuntimeException("Unable to test this class");
        }

        HashMap<Integer, HashSet<Method>> doThis = new HashMap<>();
        Method[] methods = c.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(AfterSuite.class)) {
                if (doThis.containsKey(11)) {
                    throw new RuntimeException("Two times use AfterSuite");
                } else {
                    doThis.put(11, new HashSet<>());
                }
                doThis.get(11).add(m);
            }
            if (m.isAnnotationPresent(BeforeSuite.class)){
                if (doThis.containsKey(0)){
                    throw new RuntimeException("Two times use BeforeSuite");
                } else {
                    doThis.put(0, new HashSet<>());
                }
                doThis.get(0).add(m);
            }
            if (m.isAnnotationPresent(Test.class)) {
                int priority = m.getAnnotation(Test.class).priority();
                if (priority < 1 || priority > 10) {
                    priority = 5;
                }

                if (!doThis.containsKey(priority)) {
                    doThis.put(priority, new HashSet<>());
                }
                doThis.get(priority).add(m);
            }
        }

        for (int i  : doThis.keySet()) {
            for (Method m : doThis.get(i)) {
                m.invoke(null);
            }
        }
    }
    public static void start(String s) throws InvocationTargetException, IllegalAccessException {
        Class c = null;
        try {
            c = Class.forName(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        start(c);
    }
}
