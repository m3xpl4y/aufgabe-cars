package at.maximilian.cars;

public class Engine {
    private int horsePower;
    public enum TYPE {DIESEL, GAS}
    private TYPE type;

    //Constructor
    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }
    //Getter
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    
    //Functions
    public void drive(int speed)
    {
        System.out.println("Der Motor läuft mit " + speed);
    }
    public TYPE getType() {
        return type;
    }
    public void setType(TYPE type) {
        this.type = type;
    }
}
