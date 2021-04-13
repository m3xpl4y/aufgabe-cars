package at.maximilian.cars;

public class Tire {
    private String tireBrand;
    private int tireWidth;
    private int tireHeight;
    private int tireRadial;
    public enum TYPE{WINTER, SUMMER}

    //Constructor
    public Tire(String tireBrand, int tireWidth, int tireHeight, int tireRadial) {
        this.tireBrand = tireBrand;
        this.tireWidth = tireWidth;
        this.tireHeight = tireHeight;
        this.tireRadial = tireRadial;
    }
    //Getter

    public String getTireBrand() {
        return tireBrand;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public int getTireHeight() {
        return tireHeight;
    }

    public int getTireRadial() {
        return tireRadial;
    }
}
