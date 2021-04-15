package at.maximilian.cars;

public class FuelTank{
    private int fuelCapacity;
    private double fuelConsummation;
    private double restFuelCapacity;
    private Vehicle vehicle;

    //Constructor
    public FuelTank(int fuelCapacity, double fuelConsummation) {
        this.fuelCapacity = fuelCapacity;
        this.fuelConsummation = fuelConsummation;
    }
    //Functions

    public double checkConsummation()
    {
        if(getVehicle().getCar().getMileage() > 50000)
            this.fuelConsummation = fuelConsummation + (9.8f/100);
        return this.fuelConsummation;
    }

    //Getter
    public int getFuelCapacity() {
        return fuelCapacity;
    }
    public double getFuelConsummation() {
        checkConsummation();
        return fuelConsummation;
    }
    public double getRestFuelCapacity() {
        return restFuelCapacity;
    }
    public Vehicle getVehicle() {
        return vehicle;
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
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
