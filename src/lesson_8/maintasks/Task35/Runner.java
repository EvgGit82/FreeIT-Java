package lesson_8.maintasks.Task35;

/*
Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл, распечатать числа и их среднее арифметическое
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Runner {

    private final static String FILE_PATH = "src/lesson_8/maintasks/Task35/outputBinaryFile.txt";

    public static void main(String[] args) throws IOException {

        Random random = new Random();

        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(FILE_PATH)));

        for (int i = 0; i < 20; i++) {
            dos.writeInt(random.nextInt(20)+1);
        }

        dos.flush();

        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(FILE_PATH)));

        ArrayList<Integer> numbersFromFile = new ArrayList<>();

        while (true){
            try{
                numbersFromFile.add(dis.readInt());
            } catch (EOFException e) {
                break;
            }
        }

        System.out.print("Numbers from the binary file: ");
        System.out.println(numbersFromFile.toString());

        double totalSum = 0;

        for (Integer integer : numbersFromFile) {
            totalSum += integer;
        }

        System.out.println("The arithmetical average of these numbers makes " + totalSum/numbersFromFile.size());
    }
}
