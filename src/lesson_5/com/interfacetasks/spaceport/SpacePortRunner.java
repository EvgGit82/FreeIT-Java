package lesson_5.com.interfacetasks.spaceport;

import lesson_5.com.interfacetasks.spaceport.commands.FillSpaceshipsList;
import lesson_5.com.interfacetasks.spaceport.commands.ICommand;
import lesson_5.com.interfacetasks.spaceport.commands.LaunchShipsFromList;
import lesson_5.com.interfacetasks.spaceport.spaceships.*;

import java.util.ArrayList;
import java.util.List;

/*
Создаем интерфейс IStart.
В интерфейсе определяем методы:
• предстартовая проверка систем(возвращает true/false)
• запуск двигателей(void)
• старт(void)
Создаем класс Космодром.
В классе создаем метод:
• запуск
Метод запуск принимает объект типа IStart.
В методе первым делом осуществляем предстартовую проверку переданного объекта, если она провалилась(метод вернул false)
выводим сообщение «Предстартовая проверка провалена». Если проверка прошла успешно, то производим запуск двигателей
(вызываем метод запуска двигателя).
После этого производиться обратный отсчет (10 ..... 1).
После обратного отсчета вызываем метод старт переданного объекта.
Создаем класс Шатл.
Шатл реализует интерфейс IStart.
• В методе предстартовой проверки генерируем случайное число в диапазоне от 0 до 10.
Если сгенерированное число больше 3-х то проверка прошла успешно. Если нет не успешно.
• В методе запуска двигателей выводим строку в консоль «Двигатели Шатла запущены. Все системы в норме.»
• В методе старт выводим строку в консоль. «Старт Шатла»
По аналогии создайте еще пару классов реализующих интерфейс Istart(например SpaceX).
Для предстартовой проверки можете придумать свою логику, главное, что бы метод возвращал true либо false в зависимости
от того прошла ли она успешно.
Запустите в космос созданные вами космические корабли используя созданный вами космодром и его метод старт.

*/

public class SpaceportRunner {

    public static void main(String[] args) throws InterruptedException {

        Spaceport spaceport = new Spaceport();

        List<IStart> spaceshipsList = new ArrayList<>();

        new FillSpaceshipsList(spaceshipsList).Execute();

        new LaunchShipsFromList(spaceshipsList, spaceport).Execute();

    }
}
