import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double toplam = 0;
        double urunAdet;
        String[] sorular = { "Armut Kaç Kilo ?", "Elma Kaç Kilo ?", "Domates Kaç Kilo ?","Muz Kaç Kilo ?", "Patlıcan Kaç Kilo ?"};
        double[] fiyatlar = {2.14, 3.67, 1.11, 0.95, 5.00};
        for (int i = 0; i < fiyatlar.length; i++) {
            System.out.println(sorular[i]);
            urunAdet = scan.nextDouble();
            toplam = toplam + fiyatlar[i] * urunAdet;
        }
        System.out.println("Toplam: " + toplam);
    }
}