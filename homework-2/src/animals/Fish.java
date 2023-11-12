package animals;

public class Fish extends Carnivorous implements Swim{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The fish " + getName() + " is swimming");
        } else {
            System.out.println("The fish " + getName() + " doesn't have enough energy.");
        }
    }
}
