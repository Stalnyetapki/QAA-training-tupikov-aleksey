package aviaries;

import animals.Animals;

import java.util.HashMap;

public class Aviary<T extends Animals> {

    AviarySize aviarySize;

    public Aviary(AviarySize aviarySize) {
        this.aviarySize = aviarySize;

    }

    private HashMap<String, T> aviary = new HashMap();

    public void addAnimal(T animal) {
        if (animal.getAviarySize().getValue() > aviarySize.getValue()) {
            System.out.println("Size of " + animal.getName() + " too big for this type of aviary");
        } else {
            aviary.put(animal.getName(), animal);
        }

    }

    public void removeAnimal(T animal) {
        aviary.remove(animal.getName());
    }

    public T getAnimalLink(String animalName) {
        return aviary.get(animalName);
    }
}
