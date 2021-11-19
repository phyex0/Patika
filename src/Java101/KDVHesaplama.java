package Java101;

import java.util.Scanner;

public class KDVHesaplama {
    Scanner scanner;

    public KDVHesaplama() {
        scanner = new Scanner(System.in);
    }

    public void run(){
        double price = 0;

        System.out.println("Enter price");
        price = scanner.nextDouble();
        double kdv =  price > 1000 ? price * 0.08 : price * 0.18;

        System.out.println("KDVsiz : " + price);
        System.out.println("KDV : " + kdv);
        System.out.println("Sum : " + (kdv + price));


    }
}
