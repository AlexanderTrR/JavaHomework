package transport;

public class Airplane extends Transport implements HasWheels, HasScrew, HasWings, TransportsCargo {
    public Airplane(int wheels) {
        super(wheels);
    }
}
