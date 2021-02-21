package lesson_2.oprional_tasks;

/*
Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?
*/

import java.text.DecimalFormat;

public class OptTask_08 {
    public static void main(String[] args) {

        //TODO TEST IT

        DecimalFormat df = new DecimalFormat(".##");

        double dayDistance = 10;
        double totalDistance = dayDistance;
        int days = 7;

        for (int i = 1; i <= days; i++) {
            dayDistance += dayDistance/100*10;
            totalDistance += dayDistance;
        }

        System.out.println("The runner will run the total of "
                + df.format(totalDistance) + " km for " + days + " days.");

    }

}
