package animals;

public class Bear extends Animal implements Mammal, HasFur {

    @Override
    public void eat() {
        System.out.println("The bear ate");
    }

    @Override
    public void getFurColor() {
        System.out.println("The brown color");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Fed the bear");
    }
}
