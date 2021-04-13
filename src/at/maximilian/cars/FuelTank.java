package at.maximilian.cars;

public class FuelTank{
    int fuelCapacity;
    double fuelConsummation;

    //Constructor
    public FuelTank(int fuelCapacity, double fuelConsummation) {
        this.fuelCapacity = fuelCapacity;
        this.fuelConsummation = fuelConsummation;
    }

    //Getter
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public double getFuelConsummation() {
        return fuelConsummation;
    }
}
