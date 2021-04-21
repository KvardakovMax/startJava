public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        double height = 2.0;
        boolean isMan = true;
        char firstLetterName = 'M';

        if(age > 20) {
            System.out.println("Добро пожаловать");
        }

        if(isMan) {
            System.out.println("Это мужчина");
        }

        if(!isMan) {
            System.out.println("Это женщина");
        }

        if(height < 1.80) {
            System.out.println("Подходящие размеры одежды отсутствуют");
        } else {
            System.out.println("Товары имеются в наличии");
        }

        if(firstLetterName == 'M') {
            System.out.println("Для вас скидка 50%");
        } else if(firstLetterName == 'I'){
            System.out.println("Для вас скидка 30%");
        } else {
            System.out.println("Для вас скидка 10%");
        }
    }
}