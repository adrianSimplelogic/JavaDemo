import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        int sum = add(numberFromUser(), numberFromUser());
        System.out.println(sum);
        int sub = subtract(numberFromUser(), numberFromUser());
        System.out.println(sub);
        int mul = multiply(numberFromUser(), numberFromUser());
        System.out.println(mul);
        int div = divide(numberFromUser(), numberFromUser());
        System.out.println(div);
    }

    public static int add(int a, int b) {
        int score = a + b;
        return score;
    }

    public static int subtract(int a, int b) {
        int score = a - b;
        return score;
    }

    public static int multiply(int a, int b) {
        int score = a * b;
        return score;
    }

    public static int divide(int a, int b) {
        int score = a / b;
        return score;
    }

    public static int numberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Poodaj liczbę");
        int userNum = scanner.nextInt();
        return userNum;
    }

}
