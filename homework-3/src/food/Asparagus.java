package food;

public class Asparagus extends Grass{

    private final int foodSatiety = 2;

    @Override
    public String toString(){
        return "Asparagus";
    }

    @Override
    public int getFoodSatiety() {
        return foodSatiety;
    }
}
