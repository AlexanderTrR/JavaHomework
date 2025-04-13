package transport;

public class Truck extends Transport implements HasWheels, TransportsCargo {
    public Truck(int wheels) {
        super(wheels);
    }
}
