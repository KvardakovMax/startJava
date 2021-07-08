public class GuessNumber {
    private Player player1;
    private Player player2;
    private double pcNumber;
    private double player1Number;
    private double player2Number;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        pcNumber = Math.round(Math.random() * 100);

        while (true) {
            player1.getName();
            System.out.println("Угадай число:");
            player1Number = in.nextDouble();
            if (player1Number > pcNumber) {
                System.out.println("Компьютер загадал число меньще");
            }
            if (player1Number < pcNumber) {
                System.out.println("Компьютер загадал число больше");
            }
            if (player1Number == pcNumber) {
                System.out.println("WIN");
                break;
            }

            player2.getName();
            System.out.println("Угадай число:");
            player2Number = in.nextDouble();
            if (player2Number > pcNumber) {
                System.out.println("Компьютер загадал число меньще");
            }
            if (player2Number < pcNumber) {
                System.out.println("Компьютер загадал число больше");
            }
            if (player2Number == pcNumber) {
                System.out.println("WIN");
                break;
            }
        }
    }
}