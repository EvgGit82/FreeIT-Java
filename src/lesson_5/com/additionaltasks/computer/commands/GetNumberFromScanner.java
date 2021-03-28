package lesson_5.com.additionaltasks.computer.commands;

import java.util.Scanner;

public class GetNumberFromScanner {

    public int Execute () {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        try { number = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e){
            System.out.println("Wrong number!"); }
        return number;
    }
}
