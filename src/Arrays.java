public class Arrays {

    public static void main(String[] args) {
//        deklaracja

//        typ[] nazwaTablicy = new typ[LiczbaElementów];
//        typ nazwaTablci[] = new typ[liczbaElementów];

//        deklaracja+inicjalizacja

//        typ[] nazwaTablicy = {wartosc1, wartosc2, wartosc3};

//        odwołanie do elementu tablicy

//    int nazwaZmiennej = nazwaTablicy[index]

//        int[] tablica = new int[10];
//
//        for (int i = 0; i < 10; i++) {
//            tablica[i] += 1;
//        }
//        System.out.println(Arrays.toString(tablica));
//        for (int i = 0; i < tablica.length; i++) {
//            System.out.println(tablica[i]);
//        }

//==============================================================
//        int[] intTab = {10, 20, 15, 5, 40};
//
//        int suma = 0;
//
//        for (int i = 0; i < intTab.length; i++) {
//            suma += intTab[i];
//        }
//
//        System.out.println("Suma: " + suma);
//        System.out.println("Srednia: " + suma / intTab.length);
//
//        int max = intTab[0];
//        for (int i = 0; i < intTab.length; i++) {
//            if (intTab[i] > max) {
//                max = intTab[i];
//            }
//        }
//        int min = intTab[0];
//        for (int i = 0; i < intTab.length; i++) {
//            if (intTab[i] < min) {
//                min = intTab[i];
//            }
//        }
//        System.out.println("Max: " + max);
//        System.out.println("Min: " + min);

        int n = 10;
        int[] squareArr = new int[n];

        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i] = i * i;
            System.out.println("Index " + i + " o wartości " + i + " = " + squareArr[i]);
        }
        System.out.println("cała tablica: " + java.util.Arrays.toString(squareArr));

    }


}
