package animals;

import aviaries.AviarySize;
import exceptions.WrongFoodException;
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
            try {
                throw new WrongFoodException(getName() + " doesn't eat grass!");
            } catch (WrongFoodException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
