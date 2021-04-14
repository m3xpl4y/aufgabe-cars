package at.maximilian.cars;

import at.maximilian.cars.Engine.TYPE;
import at.maximilian.cars.Constructor;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Car c1 =  new Car("BMW", "Black", "DX44756", 25000, 280000);
        Engine e1 = new Engine(150, TYPE.DIESEL);
        FuelTank f1 = new FuelTank(65, 7.8);
        Producer p1 = new Producer("BMW", "Germany", 17);
        Trunk t1 = new Trunk(450);
        Mirror m1 = new Mirror(-70, 20);
        Mirror m2 =  new Mirror(70, 20);
        Tire tire1 = new Tire("Firestone", 225, 50, 18, Tire.TYPE.SUMMER);
        Tire tire2 = new Tire("Firestone", 225, 50, 18, Tire.TYPE.SUMMER);
        Tire tire3 = new Tire("Firestone", 225, 50, 18, Tire.TYPE.SUMMER);
        Tire tire4 = new Tire("Firestone", 225, 50, 18, Tire.TYPE.SUMMER);
        List<Mirror> mirrorList = new ArrayList<>();
        List<Tire> tireList = new ArrayList<>();
        tireList.add(tire1);
        tireList.add(tire2);
        tireList.add(tire3);
        tireList.add(tire4);

        Vehicle v1 = new Vehicle(2013,  5, Vehicle.DRIVER_LICENCE.B, c1, e1, f1, p1, t1, mirrorList, tireList);

        Constructor.CreateVehicle(v1, e1, f1);

//        e1.setVehicle(v1);
//        e1.setFuelTank(f1);

        System.out.println(v1.getTires().get(0).getType());
        System.out.println(v1.getTires().toString());
        v1.getEngine().drive(1235);
    }
}
