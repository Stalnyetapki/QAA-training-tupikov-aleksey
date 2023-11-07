import model.Kotik;

import static model.Kotik.getCatsNumber;

public class Application {

    public static void main(String[] args) {
        Kotik catFirst = new Kotik("Vasya", 5, 10, "salam");
        Kotik catSecond = new Kotik();

        catSecond.setName("Synok");
        catSecond.setWeight(10);
        catSecond.setSatiety(23);
        catSecond.setMeow("meow");

        catSecond.liveAnotherDay();
        System.out.println(catSecond.getName());
        System.out.println(catFirst.getMeow().equals(catSecond.getMeow()));
        System.out.println(getCatsNumber());
    }
}
