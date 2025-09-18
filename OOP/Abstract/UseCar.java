class Car {
    private void moveBreakPads() {
        System.out.println("Brake pads applied.");
    }

    private void changePistonSpeed() {
        System.out.println("Piston speed increased.");
    }

    private void createSpark() {
        System.out.println("Spark created, car is on.");
    }

    public void turnOnCar() {
        createSpark();
    }

    public void accelerate() {
        changePistonSpeed();
    }

    public void brake() {
        moveBreakPads();
    }

}

public class UseCar {
    public static void main(String[] args) {
        Car a = new Car();
        a.turnOnCar();
        a.accelerate();
        a.brake();
    }
}
