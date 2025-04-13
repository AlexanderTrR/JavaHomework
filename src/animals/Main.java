package animals;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Bear bear = new Bear();
        Cat cat = new Cat();
        Whale whale = new Whale();
        bear.getFurColor();
        whale.getWaterType();
        fish.getWaterType();
        cat.eat();
        cat.getFurColor();
    }
}
