package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animals{

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food){
        if (food instanceof Grass) {
            setSatiety(getSatiety() + food.getFoodSatiety());
            System.out.println(getName() + " have ate " + food + " and his satiety = " + getSatiety());
        }
        else {
            System.out.println(getName() + " doesn't eat meat!");
        }
    }
}
