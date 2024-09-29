package food;

public class Beef extends Meat{

    private final int foodSatiety = 9;

    @Override
    public String toString(){
        return "Beef";
    }

    @Override
    public int getFoodSatiety() {
        return foodSatiety;
    }
}
