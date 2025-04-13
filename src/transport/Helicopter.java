package transport;

public class Helicopter extends Transport implements HasWheels, HasScrew, TransportsCargo {
    public Helicopter(int wheels) {
        super(wheels);
    }
}
