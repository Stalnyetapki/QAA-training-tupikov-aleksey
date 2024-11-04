package animals;

import aviaries.AviarySize;

public class Bear extends Carnivorous implements Swim, Run, Voice {


    private AviarySize aviarySize = AviarySize.SIZE_4;

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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public AviarySize getAviarySize() {
        return aviarySize;
    }
}
