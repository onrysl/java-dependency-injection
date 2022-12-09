package Best;

public class Main {
    public static void main(String[] args) {
        Car car = new AutoCar(new ElectricEngine());
        car.drive();
    }
}
