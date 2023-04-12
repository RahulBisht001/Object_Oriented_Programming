public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        car.stop();
        car.accelerate();
    }
}

class Car implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("I Brake like a Normal Car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a Normal Car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine  like a Normal Car");

    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a Normal Car");

    }

}

interface Engine {

    int milage = 50;

    void start();

    void stop();

    void accelerate();

}

interface Brake {

    void brake();
}

interface Media {

    void start();

    void stop();
}
