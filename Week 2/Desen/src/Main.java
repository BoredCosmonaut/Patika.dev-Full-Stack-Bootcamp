import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = scanner.nextInt();
        recursiveOperation(num);
    }

    public static void  recursiveOperation(int num) {
        if (num > 0) {
            num -= 5;
            System.out.println("Çıkarılan sayı: " + num);
            if (num > 0) {
                recursiveOperation(num);
            } else {
                num += 5;
                System.out.println("Eklenen sayı: " + num);
                recursiveOperation(num);
            }
        } else {
            num += 5;
            System.out.println("Eklenen sayı: " + num);
            if (num <= 0) {
                return;
            }
        }
    }
}