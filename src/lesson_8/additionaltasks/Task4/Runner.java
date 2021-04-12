package lesson_8.additionaltasks.Task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner {

    private static final String TARGET_FILE = "src/lesson_8/additionaltasks/Task4/auto.dat";

    public static void main(String[] args) {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(TARGET_FILE));
            Automobile auto = new Automobile("Mercedes", 200, 15000.0);
            oos.writeObject(auto);
        } catch (Exception e) {
            System.out.println("Process failed!");
        }

       try{
           ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TARGET_FILE));
           System.out.println(ois.readObject());
       } catch (Exception e) {
           System.out.println("Process failed!");
       }

    }
}
