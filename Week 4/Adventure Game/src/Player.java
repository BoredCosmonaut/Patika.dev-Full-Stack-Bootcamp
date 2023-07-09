import java.util.Random;

public class Player {
    Random random = new Random();
    String name;
    int health;
    int attack;

    boolean food = false;

    boolean water = false;

    boolean wood = false;

    int lootType;

    int type;

    public Player(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void heal() {
        System.out.println("Kendini biraz iyilestirdin");
        health += random.nextInt(20);
        System.out.println("Mevcut Canın: " + health);
    }

    public  void loot() {
        lootType = random.nextInt(100);
        if (lootType <= 25) {
            type = random.nextInt(100);
            if (type <= 20) {
                System.out.println("Tabanca kazandın!!");
                System.out.println("Saldırı gücün 20 arttı");
                attack += 20;
            }
            else if(type > 20 && type <= 50) {
                System.out.println("Kılıc kazandın!!");
                System.out.println("Saldırı gücün 10 arttı");
                attack += 10;
            }

            else{
                System.out.println("Taş buldun!!");
                System.out.println("Saldırı gücün 5 arttı");
                attack += 5;
            }
        }

        else if(lootType > 25 && lootType <= 50) {
            type = random.nextInt(100);
            if (type <= 20) {
                System.out.println("Zırh kazandın!!");
                System.out.println("Can 50 arttı");
                health += 50;
            }
            else if( type > 20 && type <= 50) {
                System.out.println("Kalkan kazandın!!");
                System.out.println("Can 30 arttı");
                health += 30;
            }

            else {
                System.out.println("Kask buldun");
                System.out.println("Can 5 arttı");
                health += 5;
            }
        }
        else if(lootType > 50 && lootType <=100) {
            System.out.println("Bir şey bulamadın!!!");
        }
    }
}
