package at.maximilian.cars;

public class Tire {
    private String tireBrand;
    private int tireWidth;
    private int tireHeight;
    private int tireRadial;
    public enum TYPE{WINTER, SUMMER}
    private TYPE type;

    //Constructor
    public Tire(String tireBrand, int tireWidth, int tireHeight, int tireRadial, TYPE type) {
        this.tireBrand = tireBrand;
        this.tireWidth = tireWidth;
        this.tireHeight = tireHeight;
        this.tireRadial = tireRadial;
        this.type = type;
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

    public TYPE getType() {
        return type;
    }

    //Setter


    public void setTireBrand(String tireBrand) {
        this.tireBrand = tireBrand;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    public void setTireHeight(int tireHeight) {
        this.tireHeight = tireHeight;
    }

    public void setTireRadial(int tireRadial) {
        this.tireRadial = tireRadial;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
