import java.util.Scanner;

public class Noname {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int x = scanner.nextInt();
//        System.out.println(x);

        if (x % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else if (x < 0) {
            System.out.println("Liczba ujemna");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }

    }
    
}
