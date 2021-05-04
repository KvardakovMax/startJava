public class calculator {
    public static void main(String[] args) {
        String symbol = "%";
        int a = -5;
        int b = 3;
        int result = 0;
        int resultOfExponentiation = 1;
        if(a >= 0 && b >= 0) {
            if (symbol == "+") {
                result = a + b;
                System.out.println("Итог сложения = " + result);
            }
            if (symbol == "-") {
                result = a - b;
                System.out.println("Итог вычитания = " + result);
            }
            if (symbol == "*") {
                result = a * b;
                System.out.println("Итог умножения = " + result);
            }
            if (symbol == "/") {
                result = a / b;
                System.out.println("Итог деления = " + result);
            }
            if (symbol == "^") {
                for (int i = 1; i <= b; i++) {
                    resultOfExponentiation *= a;
                }
                System.out.println("Итог возведения в степень = " + resultOfExponentiation);
            }
            if (symbol == "%") {
                result = a % b;
                System.out.println("Остаток = " + result);
            }
        } else {
            System.out.println("Ошибка! Числа < 0");
        }
    }
}