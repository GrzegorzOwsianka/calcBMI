import java.util.ArrayList;
import java.util.List;

public class DataBase {
    double mass;
    double height;
    public List<CalculatorBMI> calc = new ArrayList<>();

    private static final DataBase instance = new DataBase();

    private DataBase() {

    }

    public double calcBMI (double mass, double height) {
        double calculate = (mass/Math.pow(height,2));
        calculate = Math.round(calculate*100) / 100;
        return calculate;
    }

    public void remindBMI (int liczba) {
        for (CalculatorBMI bmi : this.calc) {
            if (bmi.getId() == liczba){
                System.out.print("Twoja waga to: " + bmi.getMasaCiala());
                System.out.println();
                System.out.print("Twój wzrost to: " + bmi.getWzrost());
                System.out.println();
            }
        }
    }

    public void addBMI(CalculatorBMI calculate){
        this.calc.add(calculate);
    }

    public List<CalculatorBMI> getBMI() {
        return calc;
    }

    public static DataBase getInstance() {
        return instance;
    }


}
