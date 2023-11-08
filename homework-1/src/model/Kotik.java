package model;

public class Kotik {

    private String name;
    private int weight;
    private int satiety;
    private String meow;

    private static int catsNumber;

    public Kotik() {
        catsNumber++;
    }

    public Kotik(String name, int weight, int satiety, String meow) {
        this.name = name;
        this.weight = weight;
        this.satiety = satiety;
        this.meow = meow;
        catsNumber++;
    }

    public static int getCatsNumber() {
        return catsNumber;
    }

    public void play() {
        System.out.println("The cat played");
    }

    public void sleep() {
        System.out.println("The cat slept");
    }

    public void chaseMouse() {
        System.out.println("The cat was chasing mice");
    }

    public void doTygydyk() {
        System.out.println("The cat did tygydyk");
    }

    public void sharpenClaws() {
        System.out.println("The cat sharpened his claws");
    }

    public void eat() {
        eat(1, "fish");
    }

    public void eat(int satietyPoint) {
        eat(satietyPoint, "meat");
    }

    public void eat(int satietyPoint, String foodName) {
        this.satiety += satietyPoint;
        System.out.println("The cat " + name + " ate the " + foodName + " and restored " + satietyPoint + " point/points of satiety");
    }

    public void liveAnotherDay() {
        for (var i = 0; i < 24; i++) {
            if (satiety > 0) {
                int random = (int) (Math.random() * 4);
                switch (random) {
                    case 0:
                        play();
                        satiety--;
                        break;
                    case 1:
                        sleep();
                        satiety--;
                        break;
                    case 2:
                        chaseMouse();
                        satiety--;
                        break;
                    case 3:
                        doTygydyk();
                        satiety--;
                        break;
                    case 4:
                        sharpenClaws();
                        satiety--;
                        break;
                }
            } else {
                System.out.print("The cat " + name + " doesn't have enough energy. ");
                eat();
            }
        }
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }
}
