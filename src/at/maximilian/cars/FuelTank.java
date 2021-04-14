package at.maximilian.cars;

public class FuelTank{
    private int fuelCapacity;
    private double fuelConsummation;
    private double restFuelCapacity;

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
    public double getRestFuelCapacity() {
        return restFuelCapacity;
    }

    //Setter
    public void setRestFuelCapacity(double restFuelCapacity) {
        this.restFuelCapacity = restFuelCapacity;
    }
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public void setFuelConsummation(double fuelConsummation) {
        this.fuelConsummation = fuelConsummation;
    }
}
