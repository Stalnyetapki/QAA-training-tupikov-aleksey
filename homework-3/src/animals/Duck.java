package animals;

import aviaries.AviarySize;

public class Duck extends Herbivore implements Swim, Run, Fly, Voice{

    final AviarySize aviarySize = AviarySize.SIZE_1;
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String voice() {
        return "Quack";
    }
}
