package animals;

public class Whale extends Animal implements Mammal, LivesInWater {
    private int spineLength;

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

    @Override
    public void setSpineLength(int spineLength) {
        this.spineLength = spineLength;
    }
}
