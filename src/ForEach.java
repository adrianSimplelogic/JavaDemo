public class ForEach {

    public static void main(String[] args) {

//        for(deklaracjaZmiennejPetli:tablica){
//            instrukcjeDoWykonania
//        }

        int[] tab = {1, 2, 3, 4, 5};

        for (int i : tab) {
            System.out.println(i);
        }

        String[] cars = {"audi", "bmw", "mercedes", "porshe"};

        for (String i : cars) {
            System.out.println(i);
        }


    }


}
