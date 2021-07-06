public class GuessNumber {
    Player player1;
    Player player2;
    double pcNumber;
    double player1Number;
    double player2Number;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Scanner in = new Scanner(System.in);
        pcNumber = Math.round(Math.random() * 100);

            while (true) {
                System.out.println(player1.name + ", угадай число: ");
                player1Number = in.nextDouble();
                if (player1Number > pcNumber) {
                    System.out.println("Компьютер загадал число меньще");
                }
                if (player1Number < pcNumber) {
                    System.out.println("Компьютер загадал число больше");
                }
                if (player1Number == pcNumber) {
                    System.out.println(player1.name + " WIN");
                    break;
                }

                System.out.println(player2.name + ", угадай число: ");
                player2Number = in.nextDouble();
                if (player2Number > pcNumber) {
                    System.out.println("Компьютер загадал число меньще");
                }
                if (player2Number < pcNumber) {
                    System.out.println("Компьютер загадал число больше");
                }
                if (player2Number == pcNumber) {
                    System.out.println(player2.name + " WIN");
                    break;
                }
            }
    }
}