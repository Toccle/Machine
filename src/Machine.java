public abstract class Machine {
    private String color;
    private int speed;
    private float loadCapacity;

    private int maxSpeed;

    public Machine(String color, int speed, float loadCapacity, int maxSpeed) {
        this.color = color;
        this.speed = speed;
        this.loadCapacity = loadCapacity;
        this.maxSpeed = maxSpeed;
    }

    public abstract void brake();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(float loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setSpeed(int speed) {
        if (speed < maxSpeed) {
            this.speed = speed;
        } else this.speed = maxSpeed;
    }
}
