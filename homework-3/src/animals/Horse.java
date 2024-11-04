package animals;

import aviaries.AviarySize;

public class Horse extends Herbivore implements Run, Voice, Swim {

    final AviarySize aviarySize = AviarySize.SIZE_3;

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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
