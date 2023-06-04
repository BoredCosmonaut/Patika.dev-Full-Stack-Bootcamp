import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin satır ve sütun sayısını giriniz");
        int satir = scan.nextInt();
        int sutun = scan.nextInt();
        int[][] array = new int[satir][sutun];
        int[][] transpoze = new int[sutun][satir];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println(i + ". satır " + j + ". sütunun degerini giriniz:");
                array[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                transpoze[i][j] = array[j][i];
            }
        }
        System.out.println("--------------------------------------------");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoze[i][j] + " ");;
            }
            System.out.println();
        }
    }
}