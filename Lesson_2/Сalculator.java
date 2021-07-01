public class Calculator {
    public static void calculate(int a, String sign, int b) {
        switch(sign) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "^":
                int result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                System.out.println(result);
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
