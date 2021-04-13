package at.maximilian.cars;

public class Car extends Vehicle{
    private String brand;
    private String color;
    private String serialNumb;
    private int price;

    //Constructor

    public Car(String brand, String color, String serialNumb, int price) {
        this.brand = brand;
        this.color = color;
        this.serialNumb = serialNumb;
        this.price = price;
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

    public int getPrice() {
        return price;
    }
}
