import java.util.Random;
import java.util.Scanner;

public class Mine {
    int snakeDamage;
    Snake snake = new Snake();
    Random random = new Random();

    Boolean result;

    Player player;

    Game game;

    public Mine(Player player, Game game) {
        this.player = player;
        this.game = game;
    }
    Scanner scan = new Scanner(System.in);

    int counter = 1;
    int firstAttack = random.nextInt(2);

    int snakeAmount = random.nextInt(6);

    public void check() {
        if (snakeAmount > 0) {
            System.out.println("Karsında toplam " + snakeAmount + " tane yılan var");
            snake.health = snake.health * snakeAmount;
            attack();
        }
        else if (snakeAmount == 0){
            System.out.println("Karşına hiç yılan çıkmadı!!!");
            game.hub();
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
            if (snake.health <= 0) {
                player.loot();
                game.hub();
                break;
            }
            snakeAttack(player);
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
            snakeAttack(player);
            if (player.health <= 0) {
                System.out.println("Kaybettin");
                break;
            }
            playerAttack(player);
            counter++;
            if (snake.health <= 0) {
                player.loot();
                game.hub();
                break;
            }
        }
    }


    public void firstAttack (Player player) {
        if (firstAttack == 1) {
            System.out.println("Ilk saldiri yılanda");
            snakeAttack(player);
        }
        else {
            System.out.println("Ilk saldiri oyuncuda");
            playerAttack(player);
        }
    }

    public void snakeAttack(Player player) {
        System.out.println("Yılan saldırıya geçti!!!");
        for (int i = 0; i < snakeAmount; i++) {
            snakeDamage = snake.snakeAttack();
            System.out.println((i + 1) + ". yılanın verdiği hasar: " + snakeDamage);
            player.health -= snakeDamage;
        }
        System.out.println("Oyuncunun canı: " + player.health);
    }

    public void playerAttack(Player player) {
        System.out.println("Ne yapmak istersin? \n1-Saldır \n2-Kendini iyilestir");
        int decision = scan.nextInt();
        if (decision == 1) {
            System.out.println("Saldırıya gectin");
            snake.health -= player.attack;
            System.out.println("Toplam verdigin hasar: " + player.attack);
            System.out.println("Yılanın canı: " + snake.health);
        }
        else if (decision == 2) {
            player.heal();
        }
    }

}
