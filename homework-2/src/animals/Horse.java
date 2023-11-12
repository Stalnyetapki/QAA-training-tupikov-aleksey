package animals;

public class Horse extends Herbivore implements Run, Voice, Swim {

    public Horse(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The horse " + getName() + " is running");
        } else {
            System.out.println("The horse " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public void swim() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The horse " + getName() + " is swimming");
        } else {
            System.out.println("The horse " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public String voice() {
        return "Neigh";
    }
}
