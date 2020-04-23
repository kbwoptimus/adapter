package adapter01;


public class DogAdapter extends Dog implements Robot {
    @Override
    public void cry() {
        System.out.println("Robot simulation cry:");
        super.wang();
    }

    @Override
    public void move() {
        System.out.println("Robot simulation move:");
        super.run();
    }
}
