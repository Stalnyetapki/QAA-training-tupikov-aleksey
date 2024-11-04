package animals;

import aviaries.AviarySize;
import exceptions.WrongFoodException;
import food.Food;
import food.Grass;

public abstract class Herbivore extends Animals {

    public AviarySize aviarySize;

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            setSatiety(getSatiety() + food.getFoodSatiety());
            System.out.println(getName() + " have ate " + food + " and his satiety = " + getSatiety());
        } else {
            try {
                throw new WrongFoodException(getName() + " doesn't eat meat!");
            } catch (WrongFoodException e) {
                e.printStackTrace();
            }
        }
    }

}
