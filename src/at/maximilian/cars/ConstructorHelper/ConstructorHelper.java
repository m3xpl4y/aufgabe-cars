package at.maximilian.cars.ConstructorHelper;

import at.maximilian.cars.*;
import java.util.List;

public class ConstructorHelper {

    public static void CreateVehicle(Vehicle v,Car c, Engine e, FuelTank f, Trunk t, List<Tire> tires, List<Mirror> m, Producer p)
    {
        v.setCar(c);
        e.setVehicle(v);
        e.setFuelTank(f);
        v.setTrunk(t);
        v.setTires(tires);
        v.setMirrors(m);
        v.setProducer(p);
        f.setVehicle(v);
    }



    public static void CreateMotobike(Vehicle v, Engine e, FuelTank f, Trunk t, List<Tire> tires, List<Mirror> m, Producer p)
    {
        e.setVehicle(v);
        e.setFuelTank(f);
        v.setTrunk(t);
        v.setTires(tires);
        v.setMirrors(m);
        v.setProducer(p);
    }
}
