package lesson_5.com.additionaltasks.computer;

import lesson_5.com.additionaltasks.computer.commands.ShowMenu;

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
- выключить(аналогично включению)
- при превышении лимита ресурса комп сгорает
*/

public class Runner {

    static Computer computer = new Computer("AMD Ryzen 5", 16, 250, 5);

    public static void main(String[] args) throws Throwable {

        while (computer.getCyclesToFailure() > 0) {
            new ShowMenu(computer).execute();
            System.out.println();
        }

        computer.burnDown();
        System.exit(0);
    }
}
