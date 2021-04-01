package lesson_6.annotationstasks;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.List;

public class CustomAnnotations {

    private static final String folderPath = "out/production/FreeIT-Java/lesson_6/annotationstasks";

    public static void run() throws Exception {

        FilesProcessor filesProcessor = new FilesProcessor();

        File [] folderFiles = filesProcessor.getFiles(folderPath);

        List<String> processedFileNames = filesProcessor.getProcessedFileNames(folderFiles);

        List<Class> classesList = filesProcessor.getClassesList(processedFileNames);

        scanClassesForCustomAnnotationsAndRunThem(classesList);
    }

    private static void scanClassesForCustomAnnotationsAndRunThem(List<Class> classesList) throws Exception {
        for (Class aClass : classesList) {
            Annotation[] annotationsArray = aClass.getAnnotations();
            if (annotationsArray.length != 0) {
                for (Annotation annotation : annotationsArray) {
                    IAnnotationProcessor processor = ProcessorManagerFactory.create(annotation.toString());
                    processor.process(aClass);
                }
            }
        }
    }
}
