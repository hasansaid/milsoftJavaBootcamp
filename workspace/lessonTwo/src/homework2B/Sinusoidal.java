package homework2B;

public class Sinusoidal implements Function{

    private double a;
    private double b;
    private double c;

    public Sinusoidal(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double evaluate(double x) {
        double y=a*Math.sin(b*x+c);
        return y;
    }
}
