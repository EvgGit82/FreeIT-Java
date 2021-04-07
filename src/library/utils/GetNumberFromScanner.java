package library.utils;

import java.util.Scanner;

public class GetNumberFromScanner {

    public int execute() {
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("This is not a number!");
        }
        return -1;
    }
}
