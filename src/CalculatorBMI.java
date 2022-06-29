import java.util.Random;

public class CalculatorBMI {
    private double masaCiala;
    private double wzrost;
    private int id;

    //Random liczba = new Random();

    public CalculatorBMI() {
    }

    public CalculatorBMI(double masaCiala, double wzrost, Random liczba) {
        this.masaCiala = masaCiala;
        this.wzrost = wzrost;
        this.id = liczba.nextInt(25);
    }

    public double getMasaCiala() {
        return masaCiala;
    }

    public double getWzrost() {
        return wzrost;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Masa ciała: ")
                .append(this.getMasaCiala())
                .append("kg")
                .append(" Wzrost: ")
                .append(this.getWzrost())
                .append("m")
                .append(" Twoje ID: ")
                .append(this.getId());

        return sb.toString();
    }
}
