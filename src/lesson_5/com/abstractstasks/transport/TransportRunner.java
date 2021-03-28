package lesson_5.com.abstractstasks.transport;

import lesson_5.com.abstractstasks.transport.classes.CargoLandTransport;
import lesson_5.com.abstractstasks.transport.classes.CivilAirPlane;
import lesson_5.com.abstractstasks.transport.classes.MilitaryAirPlane;
import lesson_5.com.abstractstasks.transport.classes.PassengerLandTransport;
import lesson_5.com.abstractstasks.transport.enums.Model;

import java.util.ArrayList;
import java.util.List;

/*
Разработать иерархию классов подобную схеме:

В классе Транспорт есть поля:
- Мощность(в лошадиных силах) - Максимальная скорость(км/ч) - Масса (кг) - Марка( например: Audi, BMW , Boeing,  Airbus,  Scania , МАЗ и т.д. )
В классе Наземный добавляются поля:
 -Количество колёс
 - Расход топлива(л/100км)
В классе Легковой добавляются поля:
- Тип кузова - Кол-во пассажиров
В классе Грузовой добавляется  поле:
- Грузоподъёмность(т)
В классе Воздушный добавляются поля:
 - Размах крыльев (м)
 - Минимальная длина взлётно-посадочной полосы для взлёта
В классе Гражданский добавляются поля:
 - Кол-во пассажиров
 - Наличие бизнес класса (true/false)
В классе Военный  добавляются поля:
- Наличие системы катапультирования (true/false) - Кол-во ракет на борту

В конечных классах (Легковой, Грузовой, Военный, Гражданский) разработать метод описание который будет возвращать
составленную строку с описанием всех характеристик объекта. В строку включить ещё один параметр мощность в киловаттах (кВ) .
Расчёт мощности в киловаттах производится в отдельном методе :
1 л.с = 0.74 кВ
Для легкового разработать метод который будет принимать время и считать сколько километров проедет машина двигаясь с
максимальной скоростью и сколько топлива она израсходует за это время, результат вывести в консоль, расчёт расходуемого
топлива вынести в отдельный метод private.

Результат работы метода должен вывести такую строчку:
За время (ваше введённое время) ч, автомобиль (марка автомобиля)
двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
проедет (xxx) км  и израсходует (xxx) литров топлива.

Мой результат выглядит так:
“За время 2,5 часа, автомобиль Audi двигаясь с максимальной скоростью 230 км/ч израсходует 46.0 литров топлива”

Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
Метод должен проверять если это кол-во груза помещается в грузовик то выводит в консоль ”Грузовик загружен”,
если кол-во груза которое нужно загрузить больше чем то которое может влезть в наш грузовик то выводим  “Вам нужен грузовик побольше ”.
Такой же метод делаем для Гражданских  самолётов, только проверяем вместимость пассажиров.
Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет не равно 0 то выводим на консоль “ Ракета пошла…”, если 0 то
“Боеприпасы отсутствуют”.
А так же метод катапультирование, который проверит если наличие системы катапультирования true, то выводим
“Катапультирование прошло успешно”, если false, то “У вас нет такой системы ”

*/

public class TransportRunner {
    public static void main(String[] args) {

        PassengerLandTransport passengerCar = new PassengerLandTransport(250, 250, 1.5,
                Model.BMW, 4, 9.4, 5);
        CargoLandTransport truck = new CargoLandTransport(2000, 250, 5,
                Model.MAZ, 6, 16.3, 18);
        CivilAirPlane passengerJet = new CivilAirPlane(30843, 2335, 487.5,
                Model.BOEING, 63, 300, 624, true);
        List<MilitaryAirPlane> militaryPlanesList = new ArrayList<>(){{
            add(new MilitaryAirPlane(10333, 3000, 100,
                    Model.F_21, 21, 100, true, 1));
            add(new MilitaryAirPlane(10333, 3000, 100,
                    Model.F_16, 21, 100, false, 0));
        }};

        System.out.println();

        System.out.println(passengerCar.toString());
        passengerCar.printDistanceAndFuelConsumptionCalculationResults(2.5);

        System.out.println("\n");

        System.out.println(truck.toString());
        System.out.println(truck.freeSpaceAvailability(10));
        System.out.println(truck.freeSpaceAvailability(20));

        System.out.println();

        System.out.println(passengerJet.toString());
        System.out.println(passengerJet.freeSpaceAvailability(600));
        System.out.println(passengerJet.freeSpaceAvailability(800));

        System.out.println();

        for (MilitaryAirPlane plane : militaryPlanesList) {
            System.out.println(plane.toString());
            System.out.println(plane.launchMissile());
            System.out.println(plane.escapeSystemlaunch());
            System.out.println();
        }
    }
}
