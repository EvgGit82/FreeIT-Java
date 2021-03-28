package lesson_5.com.additionaltasks.computer.commands;

import lesson_5.com.additionaltasks.computer.Computer;

public class ShowMenu {

    Computer computer;

    public ShowMenu(Computer computer) {
        this.computer = computer;
    }

    public void Execute () throws Throwable {

        System.out.println("Menu");
        System.out.println("1. Display configuration");
        System.out.println("2. Turn computer ON");
        System.out.println("3. Turn computer OFF");
        System.out.println("0. Quit");

        int option = 5;

        while (option != 1 && option != 2 && option != 3 && option !=0 ) {
            System.out.println("Select your option: ");
            option = new GetNumberFromScanner().Execute();
        }

        switch (option) {
            case 1 -> computer.printDescription();
            case 2 -> computer.turnOn();
            case 3 -> computer.turnOff();
            case 0 -> System.exit(0);
        }
    }
}


