public class GameDemo {
    public static void main(String[] args) {
        Pikachu myPikachu = new Pikachu(100);
        Pikachu yourPikachu = new Pikachu(100);
        Squirtle enemySquirtle = new Squirtle(120);
        System.out.println("Game start~");
        myPikachu.attack(enemySquirtle);
        enemySquirtle.attack(myPikachu);
    }
}
