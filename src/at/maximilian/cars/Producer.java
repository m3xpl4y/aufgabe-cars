package at.maximilian.cars;

public class Producer {
    private String companyName;
    private String origin;
    private int discount;

    //Constructor
    public Producer(String companyName, String origin, int discount) {
        this.companyName = companyName;
        this.origin = origin;
        this.discount = discount;
    }

    //Getter
    public String getCompanyName() {
        return companyName;
    }

    public String getOrigin() {
        return origin;
    }

    public int getDiscount() {
        return discount;
    }
}
