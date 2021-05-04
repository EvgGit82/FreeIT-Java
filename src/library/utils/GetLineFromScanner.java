package library.utils;

import java.util.Scanner;

public class GetLineFromScanner {

    public String execute() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }
}
