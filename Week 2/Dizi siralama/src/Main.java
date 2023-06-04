import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin uzunluğunu giriniz");
        int length = scan.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println((i + 1) + ". elemanı giriniz");
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.print("Sıralama: ");
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}