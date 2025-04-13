package animals;

public class Fish extends Animal implements LivesInWater {

    @Override
    public void eat() {
        System.out.println("The fish ate");
    }

    @Override
    public void getWaterType() {
        System.out.println("The water type is river water");
    }
}
