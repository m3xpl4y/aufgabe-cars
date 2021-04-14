package at.maximilian.cars;

public class Car{
    private String brand;
    private String color;
    private String serialNumb;
    private int price;
    private int mileage;

    //Constructor
    public Car(String brand, String color, String serialNumb, int price, int mileage) {
        this.brand = brand;
        this.color = color;
        this.serialNumb = serialNumb;
        this.price = price;
        this.mileage = mileage;
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
    public int getMileage() {
        return mileage;
    }

    //Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSerialNumb(String serialNumb) {
        this.serialNumb = serialNumb;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
