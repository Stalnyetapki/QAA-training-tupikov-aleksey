package animals;

import aviaries.AviarySize;
import food.Food;

public abstract class Animals {

    private int satiety = 2;
    private String name;
    private AviarySize aviarySize = AviarySize.SIZE_1;

    public Animals(String name) {
        this.name = name;
    }

    abstract public void eat(Food food);

    protected int getSatiety() {
        return satiety;
    }

    protected void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public AviarySize getAviarySize() {
        return aviarySize;
    }

}
