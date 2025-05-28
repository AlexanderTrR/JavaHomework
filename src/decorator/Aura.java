package decorator;

public class Aura extends OptionDecorator {
    public Aura(Service service) {
        super(service, "Характеристика ауры", 1500);
    }
}
