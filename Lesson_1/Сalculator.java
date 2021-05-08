public class Calculator {
    public static void main(String[] args) {
        String mathOperation = "%";
        int a = -5;
        int b = 3;
        int result = 0;
        if(a >= 0 && b >= 0) {
            if (mathOperation == "+") {
                result = a + b;
                System.out.println("Итог сложения = " + result);
            } else if (mathOperation == "-") {
                result = a - b;
                System.out.println("Итог вычитания = " + result);
            } else if (mathOperation == "*") {
                result = a * b;
                System.out.println("Итог умножения = " + result);
            } else if (mathOperation == "/") {
                result = a / b;
                System.out.println("Итог деления = " + result);
            } else if (mathOperation == "^") {
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                System.out.println("Итог возведения в степень = " + result);
            } else if (mathOperation == "%") {
                result = a % b;
                System.out.println("Остаток = " + result);
            } else {
                System.out.println("Данная операция не поддерживается");
            }
        } else {
            System.out.println("Ошибка! Числа < 0");
        }
    }
}