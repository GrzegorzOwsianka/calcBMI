import java.util.Random;

public class CalculatorBMI {
    private double masaCiala;
    private double wzrost;

    public CalculatorBMI() {
    }

    public CalculatorBMI(double masaCiala, double wzrost) {
        this.masaCiala = masaCiala;
        this.wzrost = wzrost;
    }

    public double calcBMI (double mass, double height) {
        double BMI = mass/Math.pow(height,2);
        return BMI;
    }
}
