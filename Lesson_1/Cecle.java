public class Cecle {
    public static void main(String[] args) {
        int i = 6;

        for(int i =0; i <= 20; i++) {
            System.out.println(i);
        }

        while(i >= -6) {
            System.out.println(i);
            i -= 2;
        }

        do {
            System.out.println(i);
            i -= 2;
        } while(i >= -6);
    }
}