package lesson_5.com.interfacetasks.robot;

import lesson_5.com.interfacetasks.robot.hands.*;
import lesson_5.com.interfacetasks.robot.heads.*;
import lesson_5.com.interfacetasks.robot.legs.*;


import java.util.ArrayList;
import java.util.List;

/*
Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
Класс SonyHead является примером реализацией головы от Sony.
Создайте 3 робота с разными комплектующими.
Например у робота голова и нога от Sony а, рука от Samsung.
У всех роботов вызовите метод action.
Среди 3-х роботов найдите самого дорогого.
*/

public class Run {
    public static void main(String[] args) {

        List<Robot> robotsList = new ArrayList<>(){{
            add(new Robot(new SonyHead(), new SamsungHand(), new ToshibaLeg()));
            add(new Robot(new SamsungHead(), new ToshibaHand(), new SonyLeg()));
            add(new Robot(new ToshibaHead(), new SonyHand(), new SamsungLeg()));
        }};

        for (Robot robot : robotsList) {
            robot.action();
            System.out.printf("This robot's total cost makes $%d \n", robot.getPrice());
            System.out.println();
        }
    }
}

