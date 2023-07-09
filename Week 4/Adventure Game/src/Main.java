public class Main {
    public static void main(String[] args) {
        //Karakter özelliklerini burada giriyorsunuz
        Player player = new Player("Berk", 200, 10);
        Game game = new Game(player);
        game.start();
    }
}