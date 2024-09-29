package animals;

public class Cat extends Carnivorous implements Run,Voice{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (getSatiety() >= 1) {
            setSatiety(getSatiety() - 1);
            System.out.println("The cat " + getName() + " is running");
        } else {
            System.out.println("The cat " + getName() + " doesn't have enough energy.");
        }
    }

    @Override
    public String voice() {
        return "Meow";
    }
}
