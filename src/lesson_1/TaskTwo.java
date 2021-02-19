package lesson_1;

/*
Изменить данный пример так, что бы при запуске программы ваша программа
выводила следующее: “Hello, <Ваше имя>!”.
 */

public class TaskTwo {

    public static void main(String[] args) {

        sayHelloMe("Evgeniy");
    }

    public static void sayHelloMe (String name) {
        System.out.println("Hello, " + name);
    }

}
