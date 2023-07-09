import java.util.Random;
import java.util.Scanner;

public class Forest {
    Lion lion = new Lion();

    Random random = new Random();

    Boolean result;

    Player player;

    Game game;

    public Forest(Player player, Game game) {
        this.player = player;
        this.game = game;
    }
    Scanner scan = new Scanner(System.in);

    int counter = 1;
    int firstAttack = random.nextInt(2);

    public void check() {
        if (player.wood) {
            System.out.println("Burayı zaten yagmaladın");
            game.hub();
        }
        else {
            attack();
        }
    }

    public void attack() {
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
            if (lion.health <= 0) {
                System.out.println("Odun kazandin!!");
                player.wood = true;
                game.hub();
                break;
            }
            lionAttack(player);
            counter++;
            if(player.health <= 0) {
                System.out.println("Kaybettin");
                break;
            }
        }
    }

    public void fight2 (Player player) {
        while (true) {
            System.out.println("================= "+ counter + ". Tur" + " =================");
            lionAttack(player);
            if (player.health <= 0) {
                System.out.println("Kaybettin");
                break;
            }
            playerAttack(player);
            counter++;
            if (lion.health <= 0) {
                System.out.println("Odun kazandin!!");
                player.wood = true;
                game.hub();
                break;
            }

        }
    }


    public void firstAttack (Player player) {
        if (firstAttack == 1) {
            System.out.println("Ilk saldiri arslanda");
            lionAttack(player);
        }
        else {
            System.out.println("Ilk saldiri oyuncuda");
            playerAttack(player);
        }
    }

    public void lionAttack(Player player) {
        System.out.println("Arslan saldırıya geçti!!!");
        player.health -= lion.attack;
        System.out.println("Arslanın verdigi hasar: " + lion.attack);
        System.out.println("Oyuncunun canı: " + player.health);
    }

    public void playerAttack(Player player) {
        System.out.println("Ne yapmak istersin? \n1-Saldır \n2-Kendini iyilestir");
        int decision = scan.nextInt();
        if (decision == 1) {
            System.out.println("Saldırıya gectin");
            lion.health -= player.attack;
            System.out.println("Toplam verdigin hasar: " + player.attack);
            System.out.println("Arslanın canı: " + lion.health);
        }
        else if (decision == 2) {
            player.heal();
        }
    }

}
