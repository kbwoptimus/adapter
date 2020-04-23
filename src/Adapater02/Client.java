package Adapater02;

public class Client {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Robot robot = new CatAdapter(cat);
        robot.cry();
        robot.move();
    }
}
