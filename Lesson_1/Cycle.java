public class Cycle {
    public static void main(String[] args) {
        for(int i =0; i <= 20; i++) {
            System.out.println(i);
        }

        int i =6;
        while(i >= -6) {
            System.out.println(i);
            i -= 2;
        }

        int number = 10;
        int result = 0;
        do {
            if(number % 2 != 0) {
                result += number;
            }
            number++;
        } while(number < 20);
        System.out.println(result);
    }
}