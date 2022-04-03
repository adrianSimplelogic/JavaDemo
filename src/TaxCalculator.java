import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę dochodu");
        double x = scanner.nextInt();
        double y; //kwota podatku

        if (x <= 120000) {
            y = x * .17;
            System.out.println("Pierwszy próg dochodowy");
        } else if (x > 120000 && x < 1000000) {
            y = x * .17 + (x - 120000) * .32;
            System.out.println("Drugi próg dochodowy");
        } else {
            y = x * .17 + 880000 * .32 + (x - 1000000) * .36;
            System.out.println("Drugi próg dochodowy + podatek solidarnościowy");
        }
        System.out.println("Twoja kwota podatku to: " + y);
    }

}
