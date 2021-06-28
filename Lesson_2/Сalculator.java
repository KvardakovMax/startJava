public class Calculator {
    static int result;
    public static void what(int a, String mathOperation, int b) {
        switch(mathOperation) {
            case "+":
                result = a + b;
                System.out.println(result);
                break;
            case "-":
                result = a - b;
                System.out.println(result);
                break;
            case "*":
                result = a * b;
                System.out.println(result);
                break;
            case "/":
                result = a / b;
                System.out.println(result);
                break;
            case "^":
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                System.out.println(result);
                break;
            case "%":
                result = a % b;
                System.out.println(result);
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
