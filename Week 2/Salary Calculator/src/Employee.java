public class Employee {
    String name;
    int salary, workHours, hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    int tax(int salary) {
        if (salary < 1000) {
            return 0;
        }
        else {
            int vergi = (int) (salary * 0.03);
            return vergi;
        }
    }

    int bonus(int workHours) {
        if (workHours > 40) {
            int bonus = (workHours - 40) * 30;
            return bonus;
        }
        else {
            return 0;
        }
    }

    int raiseSalary(int hireYear) {
        int length = hireYear - 2021;
        if (length < 10) {
            int increase = (int) (this.salary * 0.05);
            return this.salary + increase;
        } else if (length > 10 && length < 20) {
            int increase = (int) (this.salary * 0.1);
            return this.salary + increase;
        } else {
            int increase = (int) (this.salary * 0.15);
            return this.salary + increase;
        }
    }

    void info() {
        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax(this.salary));
        System.out.println("Bonus : " + bonus(this.workHours));
        System.out.println("Maaş Artışı : " + raiseSalary(this.hireYear));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax(this.salary) + bonus(this.workHours)));
        System.out.println("Toplam maaş : " + raiseSalary(this.hireYear));
    }
}
