package at.maximilian.cars;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private double restFuel;
    private double drivenKM;
    private int constructionYear;
    private int seats;
    public enum DRIVER_LICENCE{A,B,C}
    private DRIVER_LICENCE driverLicence;

    private Car car;
    private Engine engine;
    private FuelTank fuelTank;
    private Producer producer;
    private Trunk trunk;
    private List<Mirror> mirrors;
    private List<Tire> tires;

        //Constructor
    public Vehicle(int constructionYear, int seats, Car car, Engine engine, FuelTank fuelTank,
            Producer producer, Trunk trunk) {
        this.constructionYear = constructionYear;
        this.seats = seats;
        this.mirrors = new ArrayList<>();
        this.car = car;
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.producer = producer;
        this.tires = new ArrayList<>();
        this.trunk = trunk;
    }

    public Vehicle(int constructionYear, int seats, DRIVER_LICENCE driverLicence, Car car, Engine engine, FuelTank fuelTank, Producer producer, Trunk trunk, List<Mirror> mirrors, List<Tire> tires) {
        this.constructionYear = constructionYear;
        this.seats = seats;
        this.driverLicence = driverLicence;
        this.car = car;
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.producer = producer;
        this.trunk = trunk;
        this.mirrors = mirrors;
        this.tires = tires;
    }

    //Functions
    public void addMirror(Mirror rearMirror)
    {
        this.mirrors.add(rearMirror);
    }
    public void addTire(Tire tires)
    {
        this.tires.add(tires);
    }
    //Getter & Setter
    public List<Mirror> getMirrors()
    {
        return mirrors;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    public double getRestFuel() {
        return restFuel;
    }

    public void setRestFuel(double restFuel) {
        this.restFuel = restFuel;
    }

    public double getDrivenKM() {
        return drivenKM;
    }

    public void setDrivenKM(double drivenKM) {
        this.drivenKM = drivenKM;
    }

    public DRIVER_LICENCE getDriverLicence() {
        return driverLicence;
    }

}
