package Exercises;

public class Decision {

    public static void main(String[] args) {


//        Q01 Even or Odd
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę naturalną");
//        int numberQ1 = scanner.nextInt();
//
//        if (numberQ1 % 2 == 0) {
//            System.out.println("Liczba " + numberQ1 + " jest parzysta.");
//        } else {
//            System.out.println("Liczba " + numberQ1 + " jest nieparzysta.");
//        }

//        Q02 Absolute value
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę naturalną");
//        int numberQ2 = scanner.nextInt();
//
//        if (numberQ2 > 0) {
//            System.out.println("Wartość bezwględna wynosi " + numberQ2);
//        } else if (numberQ2 < 0) {
//            System.out.println("Wartość bezwględna wynosi " + numberQ2 * -1);
//        } else {
//            System.out.println("Wartość bezwględna wynosi 0");
//        }

//        Q3 Discount and Revenue
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj cenę produktu");
//        double price = scanner.nextDouble();
//        System.out.println("Podaj ilość");
//        int quantity = scanner.nextInt();
//
//        if (quantity <= 5000 && quantity > 0) {
//            System.out.println("Przychód: " + quantity * price);
//        } else if (quantity > 5000) {
//            System.out.println("Przychód z rabatem 10%: " + quantity * price * .9);
//        } else {
//            System.out.println("Niepoprawne dane");
//        }

//        Q4 Largest Number
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj trzy liczby całkowite");
//        int numberA = scanner.nextInt();
//        int numberB = scanner.nextInt();
//        int numberC = scanner.nextInt();
//
//        if (numberA > numberB && numberA > numberC) {
//            System.out.println("Liczba " + numberA + " jest największa.");
//        } else if (numberB > numberA && numberB > numberC) {
//            System.out.println("Liczba " + numberB + " jest największa.");
//        } else if (numberC > numberB && numberC > numberA) {
//            System.out.println("Liczba " + numberC + " jest największa.");
//        } else {
//            System.out.println("Liczby powinny być różne");
//        }

//        Q5 Positive, negative or zero
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wprowadź liczbę całkowitą");
//        int numberQ5 = scanner.nextInt();
//        if (numberQ5 < 0) {
//            System.out.println("liczba negatywna");
//        } else if (numberQ5 > 0) {
//            System.out.println("Liczba pozytywna");
//        } else {
//            System.out.println("Liczba zerowa");
//        }

//        Q6 Valid Triangle
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wprowadź trzy konta trójkąta");
//        int angle1 = scanner.nextInt();
//        int angle2 = scanner.nextInt();
//        int angle3 = scanner.nextInt();
//
//        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
//            System.out.println("triangle is valid");
//        } else {
//            System.out.println("triangle is not valid");
//        }

//        Q7Leap Year
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj rok");
//        int year = scanner.nextInt();
//
//        if ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))) {
//            System.out.println("A leap year");
//        } else {
//            System.out.println("Not a leap year");
//        }
//    Q8Telephone Bill
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ilość call-ów:");
//        int callsQty = scanner.nextInt();
//        double bill = 200;
//
//        if (callsQty > 0 && callsQty <= 100) {
//        } else if (callsQty > 100 && callsQty <= 150) {
//            callsQty -= 100;
//            bill = 200 + callsQty * .6;
//        } else if (callsQty > 150 && callsQty <= 200) {
//            callsQty -= 150;
//            bill = 200 + 50 * .6 + callsQty * .6;
//        } else if (callsQty > 200) {
//            callsQty -= 200;
//            bill = 200 + 50 * .6 + 50 * .5 + callsQty * .4;
//        } else {
//            System.out.println("Error: wartość ujemna lub zerowa");
//        }
//        System.out.println("telephone bill: " + bill);


//        Q10Meaning of Grade
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wprowadź stopień: A; B; C; D lub F");
//        String grade = scanner.next();
//
//        switch (grade) {
//            case "A":
//                System.out.println("Excellent");
//                break;
//            case "B":
//                System.out.println("Good");
//                break;
//            case "C":
//                System.out.println("Averge");
//                break;
//            case "D":
//                System.out.println("Deficent");
//                break;
//            case "F":
//                System.out.println("Failing");
//        }


    }
}
