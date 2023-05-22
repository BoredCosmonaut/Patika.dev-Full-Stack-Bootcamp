import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] zodiacs = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz");
        int birth = scan.nextInt();
        int left = birth % 12;
        for (int i = 0; i <zodiacs.length; i++) {
            if (left == i) {
                System.out.println(zodiacs[i]);
                break;
            }
        }
    }
}