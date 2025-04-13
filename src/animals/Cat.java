package animals;

public class Cat extends Animal implements Mammal, HasFur {

    @Override
    public void eat() {
        System.out.println("The cat ate");
    }

    @Override
    public void getFurColor() {
        System.out.println("The black color");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Fed the cat");
    }
}
