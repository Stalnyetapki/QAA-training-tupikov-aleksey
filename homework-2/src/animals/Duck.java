package animals;

public class Duck extends Herbivore implements Swim, Run, Fly, Voice{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The duck " + getName() + " is swimming");
        } else {
            System.out.println("The duck " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public void fly() {
        if (getSatiety() >= 2) {
            setSatiety(getSatiety() - 2);
            System.out.println("The duck " + getName() + " is flying");
        } else {
            System.out.println("The duck " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public void run() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The duck " + getName() + " is running");
        } else {
            System.out.println("The duck " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public String voice() {
        return "Quack";
    }
}
