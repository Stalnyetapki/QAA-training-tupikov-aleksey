package food;

public class Dill extends Grass{

    private final int foodSatiety = 1;
    @Override
    public String toString(){
        return "Dill";
    }

    @Override
    public int getFoodSatiety() {
        return foodSatiety;
    }
}
