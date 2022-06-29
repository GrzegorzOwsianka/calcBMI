public class GUI {

    void showMainMenu() {
        System.out.println("1. Oblicz BMI");
        System.out.println("2. Przypomnij BMI");
        System.out.println("3. Exit");
    }

    public static void list() {
        for (CalculatorBMI calc : DataBase.getInstance().getBMI()) {
            System.out.println(calc.toString());
        }
    }
}
