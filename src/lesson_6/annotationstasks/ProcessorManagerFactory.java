package lesson_6.annotationstasks;

public class ProcessorManagerFactory {

    private static IAnnotationProcessor processor;

    public static IAnnotationProcessor create (String annotationType){

        if (annotationType.contains("VersionAnnotation")) {
            processor = new VersionAnnotationProcessor();
        } else if (annotationType.contains("TestAnnotation")){
            processor = new TestAnnotationProcessor();
        }
        return processor;
    }
}
