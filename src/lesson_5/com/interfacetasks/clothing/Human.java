package lesson_5.com.interfacetasks.clothing;

import lesson_5.com.interfacetasks.clothing.boots.IBoots;
import lesson_5.com.interfacetasks.clothing.jacket.IJacket;
import lesson_5.com.interfacetasks.clothing.shorts.IShorts;
import lombok.Data;

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

@Data
public class Human implements IHuman{

    private String name;

    private IJacket jacket;
    private IShorts shorts;
    private IBoots boots;

    public Human(String name, IJacket jacket, IShorts shorts, IBoots boots) {
        this.name = name;
        this.jacket = jacket;
        this.shorts = shorts;
        this.boots = boots;
    }

    @Override
    public void putClothesOn() {
        System.out.println(name + jacket.putOn());
        System.out.println(name + shorts.putOn());
        System.out.println(name + boots.putOn());
    }

    @Override
    public void takeClothesOff() {
        System.out.println(name + jacket.takeOff());
        System.out.println(name + shorts.takeOff());
        System.out.println(name + boots.takeOff());
    }
}
