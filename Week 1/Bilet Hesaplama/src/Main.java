import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz:");
        double mesafe = scan.nextDouble();
        if (mesafe < 0) {
            System.out.println("Hatali veri girdiniz");
        }
        double tutar = mesafe * 0.10;
        System.out.println("Yaşınızı giriniz:");
        int yas = scan.nextInt();
        if (yas < 0) {
            System.out.println("Hatali veri girdiniz");
        }
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int type = scan.nextInt();
        if (type == 2) {
            double gidisDicount = tutar * 0.20;
            tutar = tutar - gidisDicount;
            System.out.println(tutar);
        }
        if(yas <= 12) {
            double Under12 = tutar * 0.5;
            tutar = tutar - Under12;
        }
        else if (yas <=24 && yas > 12) {
            double Under24 = tutar * 0.1;
            tutar = tutar - Under24;
        }
        else if(yas >=65) {
            double Above65 = tutar * 0.3;
            tutar = tutar - Above65;
        }
        System.out.println("Tutarınız: " + tutar);
    }
}