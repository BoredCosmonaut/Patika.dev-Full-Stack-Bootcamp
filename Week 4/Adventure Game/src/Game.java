import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);

    Player player;

    int decision;

    boolean result = false;

    public Game(Player player) {
        this.player = player;
    }

    public void start () {
        hub();
    }

    public void hub() {
        result = check();
        if (result) {
            System.out.println("Oyunu kazandın");
        }
        else  {
            System.out.println("Nereye gitmek istiyorsun?");
            System.out.println("1-Magara \n2-Nehir \n3-Orman \n4-Maden");
            decision = scan.nextInt();
            if (decision == 1) {
                Cave cave = new Cave(player, new Game(player));
                cave.check();
            }

            else if(decision == 2) {
                River river = new River(player, new Game(player));
                river.check();
            }

            else if (decision == 3){
                Forest forest = new Forest(player, new Game(player));
                forest.check();
            }
            else if (decision == 4) {
                Mine mine = new Mine(player, new Game(player));
                mine.check();
            }
        }
    }

    public boolean check() {
        if (player.wood && player.water && player.food) {
            return true;
        }
        else {
            return false;
        }
    }
}
