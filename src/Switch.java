import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

//        switch (wartość){
//            case 1:
//                instrukcja;
//                break;
//            case 2:
//                instrukcja;
//                break;
//            default:
//                instrukcja;
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        int num1 = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę");
        int num2 = scanner.nextInt();
        System.out.println("Twoje wybrane liczby to: " + num1 + " i " + num2);
        System.out.println("wybierz operację:\n1-dodawanie\n2-odejmowanie\n3-mnożenie\n4-dzielenie");
        int operation = scanner.nextInt();
        int resultat;

        switch (operation) {
            case 1:
                resultat = num1 + num2;
                System.out.println("Twoje równanie: " + num1 + "+" + num2 + "=" + resultat);
                break;
            case 2:
                resultat = num1 - num2;
                System.out.println("Twoje równanie: " + num1 + "-" + num2 + "=" + resultat);
                break;
            case 3:
                resultat = num1 * num2;
                System.out.println("Twoje równanie: " + num1 + "*" + num2 + "=" + resultat);
                break;
            case 4:
                resultat = num1 / num2;
                System.out.println("Twoje równanie: " + num1 + "/" + num2 + "=" + resultat);
                break;
            default:
                System.out.println("Nie wybrałeś operacji (zakres od 1 do 4)");

        }

    }
}
