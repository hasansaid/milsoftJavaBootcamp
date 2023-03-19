package interfaces;

public class Bat extends Mammal implements Flyable{
    Bat(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Yarasa " + name + " uçar.");
    }

    @Override
    public void land() {
        System.out.println("Yarasa " + name + " konar.");
    }
}

