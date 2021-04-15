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

    //Setter
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
