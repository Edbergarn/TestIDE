import java.util.Scanner;

public class TestIDE {
    public static void main(String[] args) {
        Scanner gissning = new Scanner(System.in);
        double rng = Math.random();
        int random = (int) (rng * 100) + 1;
        int svar = 0;
        while (true) {
            System.out.println("gissa");
            svar = gissning.nextInt();
            if (svar > random) {
                System.out.println("Talet ska vara mindre");
            } else if(svar == random){
                System.out.println("Du gissade rätt!");
                System.exit(0);
            }else if (svar < random){
                System.out.println("talet ska vara större");
        }
    }
}}