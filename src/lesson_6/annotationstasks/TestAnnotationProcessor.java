package lesson_6.annotationstasks;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestAnnotationProcessor {

    public void process(Class<?> clazz) throws Exception {
        boolean annotationPresent = clazz.isAnnotationPresent(TestAnnotation.class);
        if (annotationPresent) {
            TestAnnotation annotation = clazz.getAnnotation(TestAnnotation.class);
            System.out.println("Class '" + clazz.getSimpleName() + "' has Test Annotation"
                    + " (version: " + annotation.version() + ")");

        }
    }
}
