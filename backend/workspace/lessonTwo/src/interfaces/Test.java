package interfaces;

public class Test {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon("Paçalı");
        pigeon.fly();
        pigeon.land();

        Bird bird = new Pigeon("Paçalı");
        bird.fly();
        bird.land();

        Flyable flyable  = new Pigeon("Paçalı");
        flyable.fly();
        flyable.land();

        Bat bat = new Bat("Vampir");
        bat.fly();
        bat.land();

        // Hatalı nesne türetimi...
        Mammal mammal  = new Bat("Vampir");
        //mammal.fly();
        //mammal.land();

        System.out.println("****************************");
        makeFly(bird);
        makeFly(bat);
        makeFly(pigeon);
    }

    static void makeFly(Flyable flyable){
        System.out.println();
        System.out.println("UÇ");
        flyable.fly();
        System.out.println("KON");
        flyable.land();
    }
}
