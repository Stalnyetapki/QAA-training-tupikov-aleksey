package animals;

import aviaries.AviarySize;

public class Cat extends Carnivorous implements Run, Voice {

    final AviarySize aviarySize = AviarySize.SIZE_1;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The cat " + getName() + " is running");
        } else {
            System.out.println("The cat " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public String voice() {
        return "Meow";
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
