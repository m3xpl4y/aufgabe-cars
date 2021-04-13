package at.maximilian.cars;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Car c1 =  new Car("BMW", "Black", "DX44756", 25000, 280000);
        Engine e1 = new Engine(150);
        FuelTank f1 = new FuelTank(65, 7.8);
        Producer p1 = new Producer("BMW", "Germany", 17);
        Trunk t1 = new Trunk(450);
        Mirror m1 = new Mirror(-70, 20);
        Mirror m2 =  new Mirror(70, 20);
        Tire tire1 = new Tire("Firestone", 225, 50, 18);
        Tire tire2 = new Tire("Firestone", 225, 50, 18);
        Tire tire3 = new Tire("Firestone", 225, 50, 18);
        Tire tire4 = new Tire("Firestone", 225, 50, 18);
        Vehicle v1 = new Vehicle(2013, 5, c1, e1, f1, p1, t1);
        v1.addMirror(m1);
        v1.addMirror(m2);
        v1.addTire(tire1);
        v1.addTire(tire2);
        v1.addTire(tire3);
        v1.addTire(tire4);
        t1.getTrunkCapacity();
    }
}
