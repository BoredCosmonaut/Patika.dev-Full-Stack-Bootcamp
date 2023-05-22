import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Basamak sayısı kaç olacak");
        int basamak = scan.nextInt();
        for (int i = 0; i < basamak; i++) {
            for (int j = basamak - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}