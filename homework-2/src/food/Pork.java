package food;

public class Pork extends Meat{

    private final int foodSatiety = 12;

    @Override
    public String toString(){
        return "Pork";
    }

    @Override
    public int getFoodSatiety() {
        return foodSatiety;
    }
}
