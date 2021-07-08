import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String player1Name;
        String player2Name;
        String answer = "yes";
        Scanner in = new Scanner(System.in);

        System.out.println("Игрок 1, введите свой ник: ");
        player1Name = in.nextLine();
        Player player1 = new Player(player1Name);

        System.out.println("Игрок 2, введите свой ник: ");
        player2Name = in.nextLine();
        Player player2 = new Player(player2Name);

        GuessNumber game = new GuessNumber(player1, player2);

        while (answer.equals("yes")) {
            game.start();

            System.out.println("Хотите продолжить игру? [yes/no]: ");
            answer = in.nextLine();
        }
        System.out.println("END");




        /*while (true) {
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            answer = in.nextLine();

            if (answer.equals("yes")) {
                game.start();
            }
            if (answer.equals("no")) {
                System.out.println("End");
                break;
            }*/
    }
}