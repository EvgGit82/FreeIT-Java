package lesson_6.annotationstasks;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilesProcessor {

    public File[] getFiles(String folderPath) {

        File folder = new File (folderPath);

        File [] files = folder.listFiles();

        return files;
    }

    public ArrayList<String> getProcessedFileNames(File[] files) {

        ArrayList<String> processedFileNames = new ArrayList<>();

        for (File file : files) {
            processedFileNames.add("lesson_6.annotationstasks." +file.getName().substring(0, file.getName().indexOf('.')));
        }
        return processedFileNames;
    }

    public List<Class> getClassesList(List<String> processedFileNames) throws ClassNotFoundException {
        List<Class> classesList = new ArrayList<>();

        for (String processedFileName : processedFileNames) {
            classesList.add(Class.forName(processedFileName));
        }
        return classesList;
    }
}
