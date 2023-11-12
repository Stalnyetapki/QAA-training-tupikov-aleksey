package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animals{

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food){
        if (food instanceof Meat) {
            setSatiety(getSatiety() + food.getFoodSatiety());
            System.out.println(getName() + " have ate " + food + " and his satiety = " + getSatiety());
        }
        else {
            System.out.println(getName() + " doesn't eat grass!");
        }
    }
}
