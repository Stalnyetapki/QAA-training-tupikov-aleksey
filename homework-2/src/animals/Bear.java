package animals;

public class Bear extends Carnivorous implements Swim{
    @Override
    public void swim() {
        System.out.println("Swim");
    }
}
