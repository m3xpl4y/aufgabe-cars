package at.maximilian.cars;

public class Engine {
    private int horsePower;
    public enum TYPE {DIESEL, GAS}
    private TYPE type;
    private int speed =0;
    private FuelTank fuelTank;
    private Vehicle vehicle;

    //Constructor
    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }
    //Getter
    public int getHorsePower() {
        return horsePower;
    }
    public TYPE getType() {
        return type;
    }
    // Setter
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public void setType(TYPE type) {
        this.type = type;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    //Functions
    public int setSpeed(int speed)
    {
        this.speed = speed;
        return speed;
    }
    public void drive(int km) {

        accelerate(this.speed);

        double consummation = vehicle.getFuelTank().getFuelConsummation()/ 100;
        for (int i = 0; i <= km; i++) {
            vehicle.setDrivenKM(i);
            vehicle.setRestFuel(vehicle.getFuelTank().getFuelCapacity()-(i*consummation));

            if(vehicle.getRestFuel() < consummation)
                break;
        }
        if (vehicle.getRestFuel() > consummation){
            System.out.println("Willkommen in Valhalla");
            System.out.println("Du bist " + vehicle.getDrivenKM() +" Kilometer gefahren");
            System.out.println("Der durchschnittsverbrauch lag bei " + vehicle.getFuelTank().getFuelConsummation() +".");
            System.out.println("Tankinhalt: " + vehicle.getRestFuel());
            System.out.println("Tankinhalt beim start: " + vehicle.getFuelTank().getFuelCapacity());
        }
        if(vehicle.getRestFuel() < consummation)
        {
            double restKM = km - vehicle.getDrivenKM();
            double neededFuel = restKM * consummation;
            System.out.println("Du bist " + vehicle.getDrivenKM() +" Kilometer gefahren");
            System.out.println("Verbleidender Tankinhalt: " + vehicle.getRestFuel());
            System.out.println("Tankinhalt beim start: " + fuelTank.getFuelCapacity());
            System.out.println("Ihr Treibstoff reicht nicht um die gesamte Reststrecke von " + restKM + " Kilometer zu fahren!");
            System.out.println("Sie müssen noch mindestens " + neededFuel + " Liter Treibstoff tanken!");
            System.out.println(consummation + " verbrauch");
        }
    }
    public void accelerate(int speed) {
        double consummation1 = vehicle.getFuelTank().getFuelConsummation();
        if(speed < 1)
        {
            consummation1 = 0;
        }
        else if(speed >=1 && speed <= 60)
        {
            double percentage = consummation1*(25.0f/100.0f);
            consummation1 = consummation1 - percentage;
        }
        else if(speed >= 61 && speed <= 90)
        {
            double percentage = consummation1*(15.0f/100.0f);
            consummation1 = consummation1 - percentage;
        }
        else if(speed >= 91 && speed <= 130)
        {
            consummation1 = vehicle.getFuelTank().getFuelConsummation();
        }
        else  if(speed >= 131 && speed <= 180)
        {
            double percentage = consummation1*(15.0f/100.0f);
            consummation1 = consummation1 + percentage;
        }
        else if(speed >= 181 && speed <= 250)
        {
            double percentage = consummation1*(25.0f/100.0f);
            consummation1 = consummation1 + percentage;
        }
        else
        {
            consummation1 = 2000;
        }
        vehicle.getFuelTank().setFuelConsummation(consummation1);
    }
}
