import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calısanın ismi nedir:");
        String name = scan.next();
        System.out.println("Maasını giriniz :");
        int salary = scan.nextInt();
        System.out.println("Calısma saatini giriniz :");
        int workHours = scan.nextInt();
        System.out.println("Baslangıc yılını giriniz");
        int hireYear = scan.nextInt();
        Employee employee = new Employee(name, salary, workHours, hireYear);
        employee.info();
    }
}