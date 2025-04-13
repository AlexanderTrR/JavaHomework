package animals;

public class Cat extends Animal implements Mammal, HasFur {
 private int spineLength;

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

    @Override
    public void setSpineLength(int spineLength) {
        this.spineLength = spineLength;
    }
}
