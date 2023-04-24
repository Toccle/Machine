public class Truck extends Machine {
    private float capacity;

    public Truck(String color, int speed, float loadCapacity, int maxSpeed, float capacity) {
        super(color, speed, loadCapacity, maxSpeed);
        this.capacity = capacity;
    }



    @Override
    public void brake() {
        setSpeed(0);
    }
}
