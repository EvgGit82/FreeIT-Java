package lesson_8.maintasks.Task36;

/*
Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
*/

import java.io.File;

public class FileListRunner {

    public static final String PATH = ""; //Indicate path to the folder here

    public static void main(String[] args) {

        FilesLister filesLister = new FilesLister();

        File file = new File(PATH);

        filesLister.getFilesAndFolders(file);

        filesLister.printFilesAndFolders();
    }
}
