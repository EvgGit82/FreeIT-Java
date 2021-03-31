package lesson_6.annotationstasks;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@TestAnnotation(version = 2.3)
public class VersionAnnotationProcessor implements IAnnotationProcessor {

    public void process(Class<?> clazz) throws Exception {
        boolean annotationPresent = clazz.isAnnotationPresent(VersionAnnotation.class);
        if (annotationPresent) {
            VersionAnnotation annotation = clazz.getAnnotation(VersionAnnotation.class);
            System.out.println("Annotation version: " + annotation.version());
            System.out.println("Annotation active: " + annotation.isActive());

            Constructor<?> constructorDefault = clazz.getConstructor();
            MyService myService = (MyService) constructorDefault.newInstance();

            if(annotation.isActive()) {
                myService.setId(1);
                myService.setClassName("New MyClass instance");
                System.out.println("\'className\' field value is now \'" + myService.getClassName() + "\'");
                System.out.println("\'id\' field value is now " + myService.getId());
                Method thisClassInfoMethod = clazz.getDeclaredMethod("thisClassInfo");
                thisClassInfoMethod.setAccessible(true);
                thisClassInfoMethod.invoke(myService);
            }
        }
    }
}