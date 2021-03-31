package lesson_6.annotationstasks;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class Annotations {

    private static final String folderPath = "out/production/FreeIT-Java/lesson_6/annotationstasks";
    private static IAnnotationProcessor processor;

    public static void run() throws Exception {

        List<String> processedFileNames = getProcessedFileNames();

        List<Class> classesList = getClassesList(processedFileNames);

        scanClassesForAnnotationAndRunThem(classesList);
    }


    private static ArrayList<String> getProcessedFileNames() {

        File folder = new File (Annotations.folderPath);

        File [] files = folder.listFiles();

        ArrayList<File> onlyfiles = new ArrayList<>();

        for (File file : files) {
            if (file.isDirectory()){
                continue;
            } else {
                onlyfiles.add(file);
            }
        }

        ArrayList<String> processedFileNames = new ArrayList<>();


        for (File file : onlyfiles) {
            processedFileNames.add("lesson_6.annotationstasks." +file.getName().substring(0, file.getName().indexOf('.')));
        }
        return processedFileNames;
    }


    private static List<Class> getClassesList(List<String> processedFileNames) throws ClassNotFoundException {
        List<Class> classesList = new ArrayList<>();

        for (String processedFileName : processedFileNames) {
            classesList.add(Class.forName(processedFileName));
        }
        return classesList;
    }

    private static void scanClassesForAnnotationAndRunThem (List<Class> classesList) throws Exception {
        for (Class aClass : classesList) {
            Annotation[] annotationsArray = aClass.getAnnotations();
            if (annotationsArray.length != 0) {
                for (Annotation annotation : annotationsArray) {
                    processor = ProcessorManagerFactory.create(annotation.toString());
                    processor.process(aClass);
                }
            }
        }
    }
}
