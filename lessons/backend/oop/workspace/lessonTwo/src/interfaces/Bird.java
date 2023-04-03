package interfaces;

public abstract   class Bird extends Animal implements Flyable{
    Bird(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Güvercin " + name + " uçar.");
    }

    @Override
    public void land() {
        System.out.println("Güvercin " + name + " konar.");
    }
}
