package at.maximilian.cars;

public class Mirror {
    private int size;
    public enum POSITION {LINKS,MITTE,RECHTS}
    private POSITION position;

    //Constructor

    public Mirror(int size, POSITION position) {
        this.size = size;
        this.position = position;
    }

    //Functions

    //Getter
    public POSITION getPosition() {
        return position;
    }
    public int getSize() {
        return size;
    }

    //Setter
    public void setSize(int size) {
        this.size = size;
    }
    public void setPosition(POSITION position) {
        this.position = position;
    }
}