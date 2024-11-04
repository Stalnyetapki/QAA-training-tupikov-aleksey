package food;

public class Sparrowgrass extends Grass {

    private final int foodSatiety = 2;

    @Override
    public String toString() {
        return "Sparrowgrass";
    }

    @Override
    public int getFoodSatiety() {
        return foodSatiety;
    }
}
