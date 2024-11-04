package animals;

import aviaries.AviarySize;

public class Cow extends Herbivore implements Run, Swim, Voice {

    final AviarySize aviarySize = AviarySize.SIZE_3;

    public Cow(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The cow " + getName() + " is running");
        } else {
            System.out.println("The cow " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public void swim() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The cow " + getName() + " is swimming");
        } else {
            System.out.println("The cow " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String voice() {
        return "Moo";
    }
}
