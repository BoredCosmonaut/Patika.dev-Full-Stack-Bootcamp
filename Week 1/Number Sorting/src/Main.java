import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac sayi gireceksiniz");
        int length = scan.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            System.out.println((i + 1) + ". sayıyı giriniz");
            array.add(scan.nextInt());
        }
        Collections.sort(array);
        System.out.println("En büyük sayı: " + array.get(length - 1));
        System.out.println("En küçük sayı: " + array.get(0));
    }
}