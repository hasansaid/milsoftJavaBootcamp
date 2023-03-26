package homework2B;

public class Test {
    public static void main(String[] args) {
        /*Polynomial polynomial = new Polynomial();
        polynomial.setCoefficients(array);
        System.out.println( polynomial.evaluate(10));*/

        Drawer drawer = new Drawer();
        Function f1 = new Polynomial(-6,5,1);
        drawer.draw(f1,5,10,8);
        System.out.println("*****************");
        Function f2 = new Sinusoidal(10,2,Math.PI/6);
        drawer.draw(f2,5,10,8);
    }
}
