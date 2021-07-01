import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        int number1;
        int number2;
        String sign;
        String answer = "yes";

        Scanner in = new Scanner(System.in);
        while(true) {
            while (answer.equals("yes")) {
                Calculator calculator = new Calculator();

                System.out.println("Введите первое число:");
                number1 = in.nextInt();

                System.out.println("Введите знак математической операции:");
                in.nextLine();
                sign = in.nextLine();

                System.out.println("Введите второе число:");
                number2 = in.nextInt();

                calculator.calculate(number1, sign, number2);

                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                in.nextLine();
                answer = in.nextLine();
            }
            if(answer.equals("no")) {
                System.out.println("End");
                break;
            }
            System.out.println("Введите корректный ответ: yes/no")
            answer = in.nextLine();
        }
    }
}