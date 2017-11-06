import java.util.Scanner;

public class TestIDE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv något");
        String s = scanner.nextLine();
        System.out.println("Du skrivde:" + s);
    }
}
