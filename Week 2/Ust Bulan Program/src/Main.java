import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban değerini giriniz: ");
        int taban = scan.nextInt();
        System.out.println("Ust degerini giriniz: ");
        int ust = scan.nextInt();
        int sonuc = funciton(taban,ust);
        System.out.println(sonuc);
    }

    static int funciton(int taban, int ust) {
        if (ust == 0) {
            return 1;
        }
        else {
            return taban * funciton(taban , ust - 1);
        }
    }
}