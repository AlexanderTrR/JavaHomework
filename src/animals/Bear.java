package animals;

public class Bear extends Animal implements Mammal, HasFur {
  private int spineLength;

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

    @Override
    public void setSpineLength(int spineLength) {
        this.spineLength = spineLength;
    }
}
