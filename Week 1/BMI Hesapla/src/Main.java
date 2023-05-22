import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz");
        float boy = scan.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz");
        float kilo = scan.nextFloat();
        float BMI = kilo / (boy * boy);
        System.out.println("BMI:" + BMI);
    }
}