package lesson_2.optional_tasks;

/*
Напишите программу вывода всех четных чисел от 2 до 100 включительно.
*/

public class OptTask13 {
    public static void main(String[] args) {

        System.out.print("Every even number from 2 to 100 inclusive ");

        for (int i = 2; i < 101; i+=2) {
                System.out.print(i + " ");
        }
    }
}
