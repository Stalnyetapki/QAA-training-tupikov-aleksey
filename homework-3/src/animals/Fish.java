package animals;

import aviaries.AviarySize;

public class Fish extends Carnivorous implements Swim {

    private AviarySize aviarySize = AviarySize.SIZE_1;

    public Fish(String name) {
        super(name);
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
    public void swim() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The fish " + getName() + " is swimming");
        } else {
            System.out.println("The fish " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public AviarySize getAviarySize() {
        return aviarySize;
    }
}
