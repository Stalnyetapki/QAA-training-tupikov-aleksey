import animals.*;
import food.*;
import workers.Worker;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Barsik");
        Bear bear = new Bear("Mihalych");
        Cow cow = new Cow("Zor'ka");
        Duck duck = new Duck("Nosatyi");
        Horse horse = new Horse("Gnedoi");
        Fish fish = new Fish("Pike");

        Beef beef = new Beef();
        Dill dill = new Dill();
        Parsley parsley = new Parsley();
        Pork pork = new Pork();
        Asparagus asparagus = new Asparagus();
        Tuna tuna = new Tuna();
        Worker worker = new Worker();

        worker.feed(cat, beef);
        worker.feed(bear, parsley);
        worker.feed(cow, asparagus);
        worker.feed(horse, tuna);
        worker.getVoice(cat);
        worker.getVoice(duck);
        worker.getVoice(horse);

        ArrayList<Swim> pond = new ArrayList<>();

        pond.add(bear);
        pond.add(cow);
        pond.add(duck);
        pond.add(horse);
        pond.add(fish);

        for (Swim animal: pond) {
            animal.swim();
        }

    }
}
