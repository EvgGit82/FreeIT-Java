package lesson_6.annotationstasks;

/*
Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса сервиса
(поле обязательное) MyService и кодовое название версии (поле не обязательное) - (например номер версии = 7.1,
а кодовое название версии = Nougat).

Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию, get и set методы,
переопределенные методы equals и hashcode, а так же private метод (private thisClassInfo), который будет просто
печатать данные о самом классе (данные любые на ваш выбор), в котором он определен.

Написать программу, которая будет анализировать присутствие аннотации над классом MyService и если она присутствует -
создавать экземпляр этого класса, задавать значения его полям и вызывать метод thisClassInfo (использовать возможности
пакета reflection).

Extension demanded:

In SpringBoot the app start in main by command SpringApplication.run(Main.class);
it scans all the packages of the application and looks up for the the annotations.
As we know, that you app has just one annotation, you can omit providing the class
So, main should contain something like NameOfApplication.run().
*/


@TestAnnotation(version = 2.3)
public class Runner {

    public static void main(String[] args) throws Exception {

        Annotations.run();

    }
}
