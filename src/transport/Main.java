package transport;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(3);
        Boat boat = new Boat(4);
        Helicopter helicopter = new Helicopter(3);
        Tanker tanker = new Tanker(6);
        Taxi taxi = new Taxi(4);
        Truck truck = new Truck(4);
        System.out.println(airplane.getWheels());
        System.out.println(boat.getWheels());
    }
}