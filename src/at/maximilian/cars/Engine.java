package at.maximilian.cars;

public class Engine {
    private int horsePower;
    public enum TYPE {DIESEL, GAS};

    //Constructor
    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }
    //Getter
    public int getHorsePower() {
        return horsePower;
    }
}
