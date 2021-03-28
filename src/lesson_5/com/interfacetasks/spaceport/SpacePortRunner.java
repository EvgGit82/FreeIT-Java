package lesson_5.com.interfacetasks.spaceport;

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

public class SpacePortRunner {
    public static void main(String[] args) throws InterruptedException {

        SpacePort spacePort = new SpacePort();

        List<IStart> spaceships = new ArrayList<>(){{
            add(new Shuttle("Discovery"));
            add(new Shuttle("Columbia"));
            add(new Soyuz("TMA"));
            add(new Progress("M1"));
            add(new Shuttle("Challenger"));
            add(new SpaceX("GO Ms. Tree"));
            add(new Soyuz("TMA-M"));
            add(new SpaceX("GO Ms. Chief"));
            add(new Shuttle("Atlantis"));
            add(new SpaceX("GO Searcher"));
            add(new Soyuz("MC"));
            add(new Shuttle("Endeavour"));
            add(new Progress("M-M"));
            add(new SpaceX("GO Navigator"));
            add(new SpaceX("GO Quest"));
            add(new Progress("MC"));
        }};

        for (IStart spaceship : spaceships) {
            spacePort.start(spaceship);
            System.out.println();
            Thread.sleep(2000);
        }
    }
}
