package lesson_8.maintasks.Task36;

import java.io.File;
import java.util.ArrayList;

public class FilesLister {

    private ArrayList <String> directories = new ArrayList<>();
    private ArrayList <String> files = new ArrayList<>();

    public void getFilesAndFolders (File file) {

        File [] allFiles = file.listFiles();

        try {
            for (File everyFile : allFiles) {
                if (everyFile.isDirectory()) {
                    directories.add(everyFile.getName());
                    getFilesAndFolders(everyFile);
                } else {
                    files.add(everyFile.getName());
                }
            }
        } catch (Exception e) {
            System.out.println("Reading from file failed. Check the path and run it again.");
            System.exit(0);
        }

    }

    public void printFilesAndFolders(){
        System.out.println("Directories: ");

        for (String directory : directories) {
            System.out.println(directory);
        }

        System.out.println();
        System.out.println("Files: ");

        for (String fileName : files) {
            System.out.println(fileName);
        }
    }
}
