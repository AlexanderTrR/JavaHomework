package animals;

public interface Mammal extends HaveSpine{
    void feedWithMilk();

    @Override
    void setSpineLength(int spineLength);
}
