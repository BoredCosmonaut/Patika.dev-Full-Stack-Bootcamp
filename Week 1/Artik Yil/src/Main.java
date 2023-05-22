import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz:");
        int year = scan.nextInt();
        if (year % 4 == 0) {
            System.out.println("Artık yıl");
        }
        else if(year % 100 == 0 && year % 400 == 0) {
            System.out.println("Artık yıl");
        }
        else {
            System.out.println(year + " artık bir yıl değil");
        }
    }
}