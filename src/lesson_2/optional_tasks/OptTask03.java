package lesson_2.optional_tasks;

/*
Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2.
Если нулевым, то заменить его на 10.
Вывести полученное число
*/

public class OptTask03 {
    public static void main(String[] args) {

        int randomNumber = (int)(-5 + Math.random()* 10);

        StringBuilder result = new StringBuilder();

        if (randomNumber > 0) {
            result.append("The original number ").append(randomNumber).append(" is positive and the resulting value is: ");
            randomNumber +=1;
        } else if (randomNumber < 0) {
            result.append("The original number ").append(randomNumber).append(" is negative and the resulting value is: ");
            randomNumber -=2;
        } else {
            result.append("The original number is zero and the resulting value is: ");
            randomNumber = 10;
        }

        System.out.println(result.toString() + randomNumber);
    }

}
