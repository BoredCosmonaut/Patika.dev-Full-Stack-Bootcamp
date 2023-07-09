import java.util.Random;
import java.util.Scanner;

public class River {
    Shark shark = new Shark();
    
    Random random = new Random();
    
    Player player;
    
    Game game;
    
    Scanner scan = new Scanner(System.in);

    public River(Player player, Game game) {
        this.player = player;
        this.game = game;
    }

    int counter = 1;
    int firstAttack = random.nextInt(2);

    public void check() {
        if (player.water) {
            System.out.println("Burayı Daha Onceden Yagmaladın");
            game.hub();
        }
        else  {
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
            if (shark.health <= 0) {
                System.out.println("Su kazandin!!");
                player.water = true;
                game.hub();
                break;
            }
            sharkAttack(player);
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
            sharkAttack(player);
            if (player.health <= 0) {
                System.out.println("Kaybettin");
                break;
            }
            playerAttack(player);
            counter++;
            if (shark.health <= 0) {
                System.out.println("Su kazandin!!");
                player.water = true;
                game.hub();
                break;
            }

        }
    }


    public void firstAttack (Player player) {
        if (firstAttack == 1) {
            System.out.println("Ilk saldiri kopekbaliginda");
            sharkAttack(player);
        }
        else {
            System.out.println("Ilk saldiri oyuncuda");
            playerAttack(player);
        }
    }

    public void sharkAttack(Player player) {
        System.out.println("Kopekbaligi saldırıya geçti!!!");
        player.health -= shark.attack;
        System.out.println("Koplekbaliginin verdigi hasar: " + shark.attack);
        System.out.println("Oyuncunun canı: " + player.health);
    }

    public void playerAttack(Player player) {
        System.out.println(" Ne yapmak istersin? \n 1-Saldır \n 2-Kendini iyilestir");
        int decision = scan.nextInt();
        if (decision == 1) {
            System.out.println("Saldırıya gectin");
            shark.health -= player.attack;
            System.out.println("Toplam verdigin hasar: " + player.attack);
            System.out.println("Kopekbaliginin canı: " + shark.health);
        }
        else if (decision == 2) {
            player.heal();
        }
    }
}
