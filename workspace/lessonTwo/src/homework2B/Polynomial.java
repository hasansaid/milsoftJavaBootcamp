package homework2B;

public class Polynomial implements Function{

    private double[] coefficients;

    public Polynomial(double... args) {
        this.coefficients = args;
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double evaluate(double x) {

        //a0+a1*x+a2*x^2+ a3*x^3
        double y=coefficients[0];
        for(int i = 1; i<coefficients.length;i++){
            y +=coefficients[i] * Math.pow(x, i);
        }

        return y;
    }


}
