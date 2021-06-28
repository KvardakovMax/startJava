import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        int number1;
        int number2;
        String mathSymbol;
        String answer = "yes";
        while (answer.equals("yes")) {
            Calculator calculator = new Calculator();
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число:");
            number1 = in.nextInt();
            System.out.println("Введите знак математической операции:");
            in.nextLine();
            mathSymbol = in.nextLine();
            System.out.println("Введите второе число:");
            number2 = in.nextInt();
            calculator.what(number1, mathSymbol, number2);
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            in.nextLine();
            answer = in.nextLine();
        }
        System.out.println("End");

    }
}