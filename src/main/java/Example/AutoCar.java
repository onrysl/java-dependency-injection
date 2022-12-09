package Example;

public class AutoCar implements Car {

    Engine engine;

    public AutoCar(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        String engineStart = engine.start();
        System.out.println(engineStart);
    }
}
