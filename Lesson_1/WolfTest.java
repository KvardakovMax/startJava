public class WolfTest {
    public static void main(String[] args) {
    Wolf oldWolf = new Wolf();

    oldWolf.name = "Ben";
    System.out.println("Имя волка " + oldWolf.name);

    oldWolf.gender = 'M';
    System.out.println("Пол волка " + oldWolf.gender);

    oldWolf.weight = 25;
    System.out.println("Вес волка " + oldWolf.weight);

    oldWolf.age = 30;
    System.out.println("Возраст волка " + oldWolf.age);

    oldWolf.color = "серый";
    System.out.println("Цвет шерсти волка " + oldWolf.color);

    oldWolf.go();
    oldWolf.sit();
    oldWolf.run();
    oldWolf.howl();
    oldWolf.hunt();
    }
}