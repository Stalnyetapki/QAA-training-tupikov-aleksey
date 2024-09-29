package food;

public class Parsley extends Grass{

    private final int foodSatiety = 1;

    @Override
    public String toString(){
        return "Parsley";
    }

    @Override
    public int getFoodSatiety() {
        return foodSatiety;
    }
}
