package animals;

public class Bear extends Carnivorous implements Swim, Run, Voice {

    public Bear(String name) {
        super(name);
    }

    @Override
    public void swim() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The bear " + getName() + " is swimming");
        } else {
            System.out.println("The bear " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public void run() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The bear " + getName() + " is running");
        } else {
            System.out.println("The bear " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public String voice() {
        return "GRRRRRR";
    }
}
