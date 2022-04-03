public class Loop {
    public static void main(String[] args) {

//        for(wyrażenie początkowe;warunek;modyfikatorLiczniak){
//            instrukcje
//        }

        int max = 10;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        int sum = 0;
        int loops = 1;

        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(loops + ":" + i);
                sum += i;
                loops++;
            }
        }
        loops--;
        System.out.println("Suma liczb = " + sum);
        System.out.println("Suma pętli = " + loops);

        int size = 6;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        //dopóki warunek będzie prawdziwy, pętla będzie wykonywana
        int k = 0;
        while (k < 5) {
            System.out.println(k);
            k++;
        }

        //pętla będzie wykonywana, dopóki warunek nie zostanie spełniony
        int z = 0;
        do {
            System.out.println(z);
            z++;
        }
        while (z < 5);



    }
}
