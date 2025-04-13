package transport;

public abstract class Transport {
    private int wheels;

    public Transport(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }
}
