import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizi kaç elemanlı olsun ?");
        int uzunluk = scan.nextInt();
        int sayı = 0;
        int sayı2 = 1;
        int total = 0;
        for (int i = 0; i < uzunluk; i++) {
            System.out.println(total);
            total = sayı + sayı2;
            sayı = sayı2;
            sayı2 = total;
        }
    }
}