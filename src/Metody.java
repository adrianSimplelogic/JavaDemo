public class Metody {

    public static void main(String[] args) {

//        public static zwracanyTyp nazwaMetody (){}

//        printHelloWorld("Hello");
//        printHello("printHello");
//        printBye("Zmyłka(printBye)");
//        System.out.println("Pierwsza metoda zwraca: " + methodInt());
//        System.out.println("Druga metoda zwraca: " + methodString() + " to jest string");
//        System.out.println("Trzecia metoda zwraca: " + methodBoolean());
//        isEven(5);
//        isEven(4);
//        for (int i = 0; i < 5; i++) {
//            testMethod(randomNum(), randomNum2());
//        }

        int[] tab = {2, 3, 4};
        for (int i = 0; i < tab.length; i++) {
            testMethod(randomNum(), tab[i]);
        }


    }

    public static void printHelloWorld(String s) {
        System.out.println(s);
    }

    public static void printHello(String name) {
        System.out.println("Moja nazwa to " + name);
        printBye("printBye");
    }

    public static void printBye(String name) {
        System.out.println("Moja nazwa to " + name);
    }

    public static int methodInt() {
        int random_int = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);
        return random_int;
    }

    public static String methodString() {
        int random_int = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);
        return String.valueOf(random_int);
    }

    public static boolean methodBoolean() {
        return true;
    }

    public static void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }


    public static void testMethod(int z1, int z2) {
        if (z1 % z2 == 0) {
            System.out.println("Liczba " + z1 + " jest podzielna przez " + z2);
        } else {
            System.out.println("Liczba " + z1 + " jest niepodzielna przez " + z2);
        }
    }

    public static int randomNum() {
        int random_int = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
        return random_int;
    }

    public static int randomNum2() {
        int random_int = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        return random_int;
    }


}
