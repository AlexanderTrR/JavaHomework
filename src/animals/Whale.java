package animals;

public class Whale extends Animal implements Mammal, LivesInWater {

    @Override
    public void eat() {
        System.out.println("The whale ate");
    }

    @Override
    public void getWaterType() {
        System.out.println("The water type is ocean water");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Fed the whale");
    }
}