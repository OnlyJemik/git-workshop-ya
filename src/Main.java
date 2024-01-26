import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[][] plansza = {{"-", "-", "-"},{"-", "-", "-"},{"-", "-", "-"}};
    public static void main(String[] args) {
        for(int i = 0; i<5; i++) {
            ruch(plansza);
        }
    }

    static void sprawdzWinO(){

        if(plansza[0][0].equals("O") && plansza[0][1].equals("O") && plansza[0][2].equals("O")) {
            System.out.println("Gracz 1 wygrał!");
            System.exit(-1);
        }else{
            if(plansza[0][0].equals("O") && plansza[1][1].equals("O") && plansza[2][2].equals("O")) {
                System.out.println("Gracz 1 wygrał!");
                System.exit(-1);
            }else{
                if(plansza[0][0].equals("O") && plansza[1][0].equals("O") && plansza[2][0].equals("O")) {
                    System.out.println("Gracz 1 wygrał!");
                    System.exit(-1);
                }else{
                    if(plansza[1][0].equals("O") && plansza[1][1].equals("O") && plansza[1][2].equals("O")) {
                        System.out.println("Gracz 1 wygrał!");
                        System.exit(-1);
                    }else{
                        if(plansza[2][0].equals("O") && plansza[2][1].equals("O") && plansza[2][2].equals("O")) {
                            System.out.println("Gracz 1 wygrał!");
                            System.exit(-1);
                        }else{
                            if(plansza[0][1].equals("O") && plansza[1][1].equals("O") && plansza[2][1].equals("O")) {
                                System.out.println("Gracz 1 wygrał!");
                                System.exit(-1);
                            }else{
                                if(plansza[0][2].equals("O") && plansza[1][2].equals("O") && plansza[2][2].equals("O")) {
                                    System.out.println("Gracz 1 wygrał!");
                                    System.exit(-1);
                                }else{
                                    if(plansza[0][2].equals("O") && plansza[2][1].equals("O") && plansza[2][0].equals("O")) {
                                        System.out.println("Gracz 1 wygrał!");
                                        System.exit(-1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static void sprawdzWinX(){

        if(plansza[0][0].equals("X") && plansza[0][1].equals("O") && plansza[0][2].equals("X")) {
            System.out.println("Gracz 2 wygrał!");
            System.exit(-1);
        }else{
            if(plansza[0][0].equals("X") && plansza[1][1].equals("X") && plansza[2][2].equals("X")) {
                System.out.println("Gracz 2 wygrał!");
                System.exit(-1);
            }else{
                if(plansza[0][0].equals("X") && plansza[1][0].equals("X") && plansza[2][0].equals("X")) {
                    System.out.println("Gracz 2 wygrał!");
                    System.exit(-1);
                }else{
                    if(plansza[1][0].equals("X") && plansza[1][1].equals("X") && plansza[1][2].equals("X")) {
                        System.out.println("Gracz 2 wygrał!");
                        System.exit(-1);
                    }else{
                        if(plansza[2][0].equals("X") && plansza[2][1].equals("X") && plansza[2][2].equals("X")) {
                            System.out.println("Gracz 2 wygrał!");
                            System.exit(-1);
                        }else{
                            if(plansza[0][1].equals("X") && plansza[1][1].equals("X") && plansza[2][1].equals("X")) {
                                System.out.println("Gracz 2 wygrał!");
                                System.exit(-1);
                            }else{
                                if(plansza[0][2].equals("X") && plansza[1][2].equals("X") && plansza[2][2].equals("X")) {
                                    System.out.println("Gracz 2 wygrał!");
                                    System.exit(-1);
                                }else{
                                    if(plansza[0][2].equals("X") && plansza[2][1].equals("X") && plansza[2][0].equals("X")) {
                                        System.out.println("Gracz 2 wygrał!");
                                        System.exit(-1);
                                    }
                                }
                            }
                        }
                    }
                }
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

        plansza[xmove][ymove] = "0";
        pokazPlansze();
        sprawdzWinO();

        System.out.println("Gracz 2 wpisuje ruch.");
        System.out.println("x: ");
        xmove = Integer.parseInt(x.nextLine());
        System.out.println("y: ");
        ymove = Integer.parseInt(y.nextLine());

        plansza[xmove][ymove] = "X";
        pokazPlansze();
        sprawdzWinX();
    }

    static void pokazPlansze(){
        System.out.println(Arrays.deepToString(plansza[0]));
        System.out.println(Arrays.deepToString(plansza[1]));
        System.out.println(Arrays.deepToString(plansza[2]));
    }
}
