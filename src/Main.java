import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] tablica = {100, 9, 20, 30};
        int max = findmax(tablica);
        System.out.println("max " + max);
    }
    public static int findmax(int[] tablica) {
        int max = tablica[0];
        for (int liczba : tablica) {
            if (liczba > max) {
                max = liczba;
            }

    //Random random = new Random();
       // int Real = random.nextInt(4);
       // System.out.println("Trzy odbicia, jedno prawdziwe");
      // int i;
      // for (i = 0; i < 3; i++) {
           // System.out.println("...");
      // }
       // if (i == Real) {
        //    System.out.println("Odbicie było prawdziwe");
       // } else {
       //     System.out.println("Odbicie Było fałszywe");
        }
        return max;
        }
    }