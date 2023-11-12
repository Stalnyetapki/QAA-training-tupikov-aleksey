package food;

public class Tuna extends Meat{

    private final int foodSatiety = 8;

    @Override
    public String toString(){
        return "Tuna";
    }

    @Override
    public int getFoodSatiety() {
        return foodSatiety;
    }
}
