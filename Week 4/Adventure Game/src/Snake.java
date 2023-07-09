import java.util.Random;

public class Snake {
    int id = 4;
    int health = 20;
    int attack;
    Random random = new Random();

    public int snakeAttack() {
        attack = random.nextInt(6);
        return attack;
    }
}
