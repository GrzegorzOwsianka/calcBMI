import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GUI gui = new GUI();
        DataBase db = DataBase.getInstance();
        Random losID = new Random();
        double mass;
        double height;

        while(true) {
            gui.showMainMenu();
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("Podaj swoją wagę: ");
                    mass = scanner.nextDouble();
                    System.out.println("Podaj swój wzrost w cm: ");
                    height = scanner.nextDouble();
                    CalculatorBMI calc = new CalculatorBMI(mass,height,losID);
                    db.addBMI(calc);
                    System.out.println("Twój wskaźnik BMI wynosi: " + db.calcBMI(mass,height));
                    System.out.println(calc.getId());
                    break;
                case "2":
                    System.out.println("Podaj swoje ID: ");
                    int id = scanner.nextInt();
                    db.remindBMI(id);
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}

