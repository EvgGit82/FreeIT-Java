package lesson_6.annotationstasks;


public class TestAnnotationProcessor implements IAnnotationProcessor {

    public void process(Class<?> clazz) throws Exception {
        boolean annotationPresent = clazz.isAnnotationPresent(TestAnnotation.class);
        if (annotationPresent) {
            TestAnnotation annotation = clazz.getAnnotation(TestAnnotation.class);
            System.out.println("Class '" + clazz.getSimpleName() + "' has Test Annotation"
                    + " (version: " + annotation.version()
                    + ", code name \'" + annotation.versionCodeName() +"\')\n");
        }
    }
}
