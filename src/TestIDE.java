import java.util.Scanner;

public class TestIDE {
    public static void main(String[] args) {
        Scanner gissning = new Scanner(System.in);
        double rng = Math.random();
        int random = (int) (rng * 100) + 1;
        int svar = 0;
        int tries = 0;
        while (tries < 10) {
            System.out.println("gissa");
            svar = gissning.nextInt();
            if (svar > random) {
                System.out.println("Talet ska vara mindre");
                tries++;
            } else if(svar == random){
                System.out.println("Du gissade rätt!");
                System.exit(0);
                tries++;
            }else if (svar < random){
                System.out.println("talet ska vara större");
                tries++;
        }
    }
}}