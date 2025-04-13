package transport;

public class Boat extends Transport implements HasScrew, TransportsCargo {
    public Boat(int wheels) {
        super(wheels);
    }
}
