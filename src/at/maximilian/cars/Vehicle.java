package at.maximilian.cars;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private double restFuel;
    private double drivenKM;
    private int constructionYear;
    private int seats;
    private enum DRIVER_LICENCE{A,B,C}

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


    
    
}
