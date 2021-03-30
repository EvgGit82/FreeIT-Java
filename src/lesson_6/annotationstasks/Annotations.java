package lesson_6.annotationstasks;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Annotations {

    private static final String folderPath = "out/production/FreeIT-Java/lesson_6/annotationstasks";

    public static void run() throws Exception {

        List<String> processedFileNames = getProcessedFileNames(folderPath);

        List<Class> classesList = getClassesList(processedFileNames);

        scanClassesForAnnotationAndRunThem(classesList);
    }


    private static ArrayList<String> getProcessedFileNames (String folderPath) {

        File folder = new File (folderPath);

        File [] files = folder.listFiles();

        ArrayList<String> processedFileNames = new ArrayList<>();


        for (File file : files) {
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
            if (aClass.isAnnotationPresent(VersionAnnotation.class)) {
                new VersionAnnotationProcessor().process(aClass);
                System.out.println();
            }
            if (aClass.isAnnotationPresent(TestAnnotation.class)) {
                new TestAnnotationProcessor().process(aClass);
                System.out.println();
            }
        }
    }
}