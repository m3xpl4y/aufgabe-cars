package at.maximilian.cars;

public class Car extends Vehicle{
    private String brand;
    private String color;
    private String serialNumb;

    //Constructor
    public Car(String brand, String color, String serialNumb) {
        this.brand = brand;
        this.color = color;
        this.serialNumb = serialNumb;
    }

    //Getter
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumb() {
        return serialNumb;
    }
}
