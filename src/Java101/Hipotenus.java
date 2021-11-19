package Java101;

import java.util.Scanner;

public class Hipotenus {

    Scanner scanner;

    public Hipotenus() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        int u = 0, a = 0, b = 0, c = 0;

        System.out.println("Enter a");
        a = scanner.nextInt();
        System.out.println("Enter b");
        b = scanner.nextInt();
        System.out.println("Enter c");
        c = scanner.nextInt();

        u = (a + b + c) / 2;

        System.out.println("Çevre : " + (2 * u));
        int alan = u * (u - a) * (u - b) * (u - c);
        System.out.println("Alan : " + (int) Math.sqrt(alan));
    }
}
