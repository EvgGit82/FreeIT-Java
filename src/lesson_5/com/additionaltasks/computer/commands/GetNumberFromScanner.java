package lesson_5.com.additionaltasks.computer.commands;

import java.util.Scanner;

public class GetNumberFromScanner {

    public int execute() {
        Scanner scanner = new Scanner(System.in);
        try { return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e){
            System.out.println("Wrong number!"); }
        return -1;
    }
}
