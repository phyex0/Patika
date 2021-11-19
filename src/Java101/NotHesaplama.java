package Java101;

import java.util.Scanner;

public class NotHesaplama {
    // Create an object and then use the run method to test...
    public NotHesaplama() {
    }

    Scanner scanner;
    int matematik = 0, fizik = 0, kimya = 0, turkce = 0, tarih = 0, muzik = 0;

    public void run() {
        scanner = new Scanner(System.in);

        System.out.println("Matematik notunu gir");
        matematik = scanner.nextInt();

        System.out.println("Fizik notunu gir");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunu gir");
        kimya = scanner.nextInt();

        System.out.println("Türkçe notunu gir");
        turkce = scanner.nextInt();

        System.out.println("Tarih notunu gir");
        tarih = scanner.nextInt();

        System.out.println("Müzik notunu gir");
        muzik = scanner.nextInt();

        int avg = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        String result = avg >= 60 ? "Geçtin" : "Kaldın";
        System.out.println(result);


    }


}
