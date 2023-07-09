import java.util.Random;
import java.util.Scanner;

public class Cave {
    Bear bear = new Bear();
    Random random = new Random();

    Boolean result;

    Player player;

    Game game;

    public Cave(Player player, Game game) {
        this.player = player;
        this.game = game;
    }
    Scanner scan = new Scanner(System.in);

    int counter = 1;
    int firstAttack = random.nextInt(2);

    public void check() {
        if (player.food) {
            System.out.println("Burayı zaten yagmaladın");
            game.hub();
        }
        else {
            attack();
        }
    }

    public void attack() {
        System.out.println(firstAttack);
        System.out.println("================= "+ counter + ". Tur" + " =================");
        firstAttack(player);
        if (firstAttack == 1) {
            counter++;
            fight1(player);
        }
        else {
            counter++;
            fight2(player);
        }
    }

    public void fight1 (Player player) {
        while(true) {
            System.out.println("================= "+ counter + ". Tur" + " =================");
            playerAttack(player);
            if (bear.health <= 0) {
                System.out.println("Yiyecek kazandin!!");
                player.food = true;
                game.hub();
                break;
            }
            bearAttack(player);
            counter++;
            if (player.health <= 0) {
                System.out.println("Kaybettin");
                break;
            }
        }
    }

    public void fight2 (Player player) {
        while (true) {
            System.out.println("================= "+ counter + ". Tur" + " =================");
            bearAttack(player);
            if (player.health <= 0) {
                System.out.println("Kaybettin");
                break;
            }
            playerAttack(player);
            counter++;
            if (bear.health <= 0) {
                System.out.println("Yiyecek kazandin!!");
                player.food = true;
                game.hub();
                break;
            }
        }
    }


    public void firstAttack (Player player) {
        if (firstAttack == 1) {
            System.out.println("Ilk saldiri ayida");
            bearAttack(player);
        }
        else {
            System.out.println("Ilk saldiri oyuncuda");
            playerAttack(player);
        }
    }

    public void bearAttack(Player player) {
        System.out.println("Ayı saldırıya geçti!!!");
        player.health -= bear.attack;
        System.out.println("Ayının verdigi hasar: " + bear.attack);
        System.out.println("Oyuncunun canı: " + player.health);
    }

    public void playerAttack(Player player) {
        System.out.println("Ne yapmak istersin? \n1-Saldır \n2-Kendini iyilestir");
        int decision = scan.nextInt();
        if (decision == 1) {
            System.out.println("Saldırıya gectin");
            bear.health -= player.attack;
            System.out.println("Toplam verdigin hasar: " + player.attack);
            System.out.println("Ayının canı: " + bear.health);
        }
        else if (decision == 2) {
            player.heal();
        }
    }


}
