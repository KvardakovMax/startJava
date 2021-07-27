import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private double targetNumber;
    private double player1Number;
    private double player2Number;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        targetNumber = Math.round(Math.random() * 101);

        while (true) {
            player1.playerName();
            System.out.println("Угадай число:");
            player1Number = in.nextDouble();
            if (player1Number > targetNumber) {
                System.out.println("Компьютер загадал число меньше");
            } else if (player1Number < targetNumber) {
                System.out.println("Компьютер загадал число больше");
            } else {
                System.out.println("WIN");
                break;
            }

            player2.playerName();
            System.out.println("Угадай число:");
            player2Number = in.nextDouble();
            if (player2Number > targetNumber) {
                System.out.println("Компьютер загадал число меньше");
            }
            if (player2Number < targetNumber) {
                System.out.println("Компьютер загадал число больше");
            }
            if (player2Number == targetNumber) {
                System.out.println("WIN");
                break;
            }
        }
    }
}