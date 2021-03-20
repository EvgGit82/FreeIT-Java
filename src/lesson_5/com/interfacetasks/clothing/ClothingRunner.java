package lesson_5.com.interfacetasks.clothing;


/*
Интерфейсы:
- Куртка
- Штаны
- Обувь
в каждом интерфейсе есть 2 метода (надеть и снять)
Делаем несколько реализации каждого интерфейса.
Создаём класс человек:
У человека поля:
-имя
-куртка
-штаны
-обувь
У человека есть 2 метода:
- одеться(вызываются методы надеть у всех вещей)
- раздеться (вызываются методы снять у всех вещей)
*/

import lesson_5.com.interfacetasks.clothing.boots.*;
import lesson_5.com.interfacetasks.clothing.jacket.*;
import lesson_5.com.interfacetasks.clothing.shorts.*;

import java.util.ArrayList;
import java.util.List;

public class ClothingRunner {

    public static void main(String[] args) {

        List<Human> humansList = new ArrayList<>(){{
            add(new Human("Vasya", new DieselJacket(), new GucciShorts(), new GrensonBoots()));
            add(new Human("Kolya", new ArmaniJacket(), new PradaShorts(), new MartensBoots()));
            add(new Human("Sasha", new ZaraJacket(), new VersaceShorts(), new TimberlandBoots()));
        }};

        for (Human human : humansList) {
            human.putClothesOn();
            System.out.println();
        }

        System.out.println();

        for (Human human : humansList) {
            human.takeClothesOff();
            System.out.println();
        }
    }
}
