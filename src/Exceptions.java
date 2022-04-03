public class Exceptions {

    public static void main(String[] args) {

//        int i = 2 / 0;
//        System.out.println(i);

//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            int liczba = scanner.nextInt();
//            System.out.println(liczba);
//        } catch (InputMismatchException exception) {
//            System.out.println("Podałeś teskt zamiast liczbę");
//        }

        int[] tab = {1, 2, 3};

        try {
            System.out.println(tab[10]);
        } catch (Exception e) {
            System.out.println("Tablica nie jest tak duża");
        }

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(tab[i]);
            } catch (Exception e) {
                System.out.println("Tablica ma rozmiar " + tab.length);
            }


        }
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(tab[i]);
            }
        } catch (Exception e) {
            System.out.println("Tablica za duża");
        }

    }

//    ctrl+alt+T

}
