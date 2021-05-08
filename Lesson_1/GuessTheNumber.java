public class GuessTheNumber {
    public static void main(String[] args) {
        int hiddenNumber = 0;
        int estimatedNumber = 2;
        for(int i = 0; i < 101; i++) {
            if (estimatedNumber < hiddenNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер.");
                estimatedNumber++;
            } else if (estimatedNumber > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер.");
                estimatedNumber--;
            } else {
                System.out.println("Поздравляю, число угадано!");
                break;
            }
        }
    }
}