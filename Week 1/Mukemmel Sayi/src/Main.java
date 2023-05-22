import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        System.out.println("Bir sayı giriniz");
        int number = scan.nextInt();
        for (int i = 0; i <= number; i++) {
            int current = i + 1;
            if (number % current == 0) {
                toplam = toplam + current;
                if (toplam == number) {
                    break;
                }
            }
        }
        if (toplam == number) {
            System.out.println(number + " mukemmel sayıdır");
        }
        else {
            System.out.println(number + " mukemmel sayı değildir");
        }
    }
}