import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[][] plansza = {{"-", "-", "-"},{"-", "-", "-"},{"-", "-", "-"}};
    static boolean koniec = false;
    public static int ruchy = 0;
    public static void main(String[] args) {
        while (!koniec) {
            ruch(plansza);
        }
    }
    static void sprawdzWin(String gracz) {
        for (int i = 0; i < 3; i++) {
            boolean Owygra = true;
            for (int j = 0; j < 3; j++) {
                if (!plansza[i][j].equals(gracz)) {
                    Owygra = false;
                    break;
                }
            }
            if (Owygra) {
                System.out.println("Gracz wygrał");
                koniec = true;


            }
        }
    }

    static void ruch(String[][] plansza){
        int xmove;
        int ymove;
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        System.out.println("Gracz 1 wpisuje ruch.");
        System.out.println("x: ");
        xmove = Integer.parseInt(x.nextLine());
        System.out.println("y: ");
        ymove = Integer.parseInt(y.nextLine());

        plansza[xmove][ymove] = "O";
        pokazPlansze();
        sprawdzWin("O");
        if (koniec) return;
        System.out.println("Gracz 2 wpisuje ruch.");
        System.out.println("x: ");
        xmove = Integer.parseInt(x.nextLine());
        System.out.println("y: ");
        ymove = Integer.parseInt(y.nextLine());

        plansza[xmove][ymove] = "X";
        pokazPlansze();
        sprawdzWin("X");
        if (koniec) return;
    }
    static void pokazPlansze(){
        System.out.println(Arrays.deepToString(plansza[0]));
        System.out.println(Arrays.deepToString(plansza[1]));
        System.out.println(Arrays.deepToString(plansza[2]));
    }
}
