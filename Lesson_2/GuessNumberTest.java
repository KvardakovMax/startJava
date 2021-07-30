import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "yes";


        System.out.println("Игрок 1, введите свой ник: ");
        String player1Name = in.nextLine();
        Player player1 = new Player(player1Name);

        System.out.println("Игрок 2, введите свой ник: ");
        String player2Name = in.nextLine();
        Player player2 = new Player(player2Name);

        GuessNumber game = new GuessNumber(player1, player2);

        while (answer.equals("yes")) {
            game.start();

            System.out.println("Хотите продолжить игру? [yes/no]: ");
            answer = in.nextLine();
        }
        while (answer.equals("no")) {
            System.out.println("END");
        }
        while (!answer.equals("yes") || !answer.equals("no")) {
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            answer = in.nextLine();
        }




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