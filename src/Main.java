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

        }
        return max;
        }
    }