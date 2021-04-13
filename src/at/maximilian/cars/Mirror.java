package at.maximilian.cars;

public class Mirror {
    private int position;
    private int size;

    //Constructor
    public Mirror(int position, int size) {
        this.position = position;
        this.size = size;
    }
    //Functions

    //Getter
    public int getPosition() {
        return position;
    }

    public int getSize() {
        return size;
    }
}
