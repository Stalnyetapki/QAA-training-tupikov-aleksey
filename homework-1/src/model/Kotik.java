package model;

public class Kotik {

    private String name;
    private int weight;
    private int satiety;
    private static int catsNumber;
    private String nameFood;
    private String meow;
    private static int i = 1;

    public Kotik() {
        setName("cat" + i);
        i++;
        setWeight((int) (Math.random() * 10 + 1));
        setSatiety((int) (Math.random() * 23 + 1));
        setMeow("meow");
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

    public static void setCatsNumber(int catsNumber) {
        Kotik.catsNumber = catsNumber;
    }

    public void play() {
        if (satiety > 0) {
            System.out.println("The cat played");
            satiety--;
        } else {
            System.out.println("The cat " + name + " hasn't enough energy");
        }
    }

    public void sleep() {
        if (satiety > 0) {
            System.out.println("The cat slept");
            satiety--;
        } else {
            System.out.println("The cat " + name + " hasn't enough energy");
        }
    }

    public void chaseMouse() {
        if (satiety > 0) {
            System.out.println("The cat was chasing mice");
            satiety--;
        } else {
            System.out.println("The cat " + name + " hasn't enough energy");
        }
    }

    public void doTygydyk() {
        if (satiety > 0) {
            System.out.println("The cat did tygydyk");
            satiety--;
        } else {
            System.out.println("The cat " + name + " hasn't enough energy");
        }
    }

    public void sharpenClaws() {
        if (satiety > 0) {
            System.out.println("The cat sharp claws");
            satiety--;
        } else {
            System.out.println("The cat " + name + " hasn't enough energy");
        }
    }

    public void eat(int satietyPoint) {
        this.satiety += satietyPoint;
    }

    public void eat(int satietyPoint, String nameFood) {
        this.satiety += satietyPoint;
        this.nameFood = nameFood;

    }

    public void eat() {
        eat(1, "fish");
    }

    public void liveAnotherDay() {
        for (var i = 0; i < 24; i++) {
            int random = (int) (Math.random() * 4);
            switch (random) {
                case 0:
                    play();
                    break;
                case 1:
                    sleep();
                    break;
                case 2:
                    chaseMouse();
                    break;
                case 3:
                    doTygydyk();
                    break;
                case 4:
                    sharpenClaws();
                    break;
            }
        }
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
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
