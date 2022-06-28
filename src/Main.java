import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GUI gui = new GUI();
        CalculatorBMI bmi = new CalculatorBMI();

        while(true) {
            gui.showMainMenu();
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("Podaj swoją wagę: ");
                    double mass = scanner.nextDouble();
                    System.out.println("Podaj swój wzrost w cm: ");
                    double height = scanner.nextDouble();
                    System.out.println("Twój wskaźnik BMI wynosi: " + bmi.calcBMI(mass,height));
                    System.out.println();
                    break;
//                case "2":
//                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
