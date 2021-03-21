package lesson_5.com.additionaltasks.computer;

/*
Создать класс компьютер.
Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)

Методы:
- метод описание(вывод всех полей)
- метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1),
вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает.
Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец.
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает
*/

public class Runner {

    static Computer computer = new Computer("AMD Ryzen 5", 16, 250, 5);

    public static void main(String[] args) throws Throwable {

        while (computer.getCyclesToFailure() > 0) {
            showMenu();
            System.out.println();
        }

        computer.burnDown();
        System.exit(0);
    }

    public static void showMenu () throws Throwable {

        System.out.println("Menu");
        System.out.println("1. Display configuration");
        System.out.println("2. Turn computer ON");
        System.out.println("3. Turn computer OFF");
        System.out.println("0. Quit");
        System.out.println("Select your option: ");

        switch (computer.getNumberFromScanner()) {
            case 1 -> computer.printDescription();
            case 2 -> computer.turnOn();
            case 3 -> computer.turnOff();
            case 0 -> System.exit(0);
        }
    }

}
