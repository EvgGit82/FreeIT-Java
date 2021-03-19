package lesson_5.com.abstractclassestasks.transport_project;

import lesson_5.com.abstractclassestasks.transport_project.abstracts.Transport;
import lesson_5.com.abstractclassestasks.transport_project.classes.CargoLandTransport;
import lesson_5.com.abstractclassestasks.transport_project.classes.CivilAirPlane;
import lesson_5.com.abstractclassestasks.transport_project.classes.MilitaryAirPlane;
import lesson_5.com.abstractclassestasks.transport_project.classes.PassengerLandTransport;
import lesson_5.com.abstractclassestasks.transport_project.enums.Model;

import java.util.ArrayList;
import java.util.List;

public class TransportRunner {
    public static void main(String[] args) {

        PassengerLandTransport passengerCar = new PassengerLandTransport(250, 250, 1.5,
                Model.BMW, 4, 9.4, 5);
        CargoLandTransport truck = new CargoLandTransport(2000, 250, 5,
                Model.MAZ, 6, 16.3, 18);
        CivilAirPlane passengerJet = new CivilAirPlane(30843, 2335, 487.5,
                Model.BOEING, 63, 300, 624, true);
        MilitaryAirPlane interceptor = new MilitaryAirPlane(10333, 3000, 100,
                Model.F_21, 21, 100, true, 1);
        MilitaryAirPlane fighter = new MilitaryAirPlane(10333, 3000, 100,
                Model.F_16, 21, 100, false, 0);


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

        System.out.println(interceptor.toString());
        System.out.println(interceptor.launchMissile());
        System.out.println(interceptor.escapeSystemlaunch());

        System.out.println();

        System.out.println(fighter.toString());
        System.out.println(fighter.launchMissile());
        System.out.println(fighter.escapeSystemlaunch());

    }
}
