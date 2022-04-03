import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie");
        String x = scanner.nextLine();

        System.out.println("podaj nazwisko");
        String y = scanner.nextLine();

//        scanner.nextLine();

        System.out.println("podaj wiek");
        int z = scanner.nextInt();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
