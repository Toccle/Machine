public class Bus extends Machine {
    int peopleCapacity;
    int peopleCount;

    public Bus(String color, int speed, float loadCapacity, int maxSpeed, int peopleCapacity, int peopleCount) {
        super(color, speed, loadCapacity, maxSpeed);
        this.peopleCapacity = peopleCapacity;
        this.peopleCount = peopleCount;
    }

    private void boarding(int people) {
        if (peopleCapacity >= peopleCount + people) {
            this.peopleCount = peopleCount + people;
        } else this.peopleCount = peopleCapacity;
    }

    @Override
    public void brake() {
        setSpeed(0);
    }
}
