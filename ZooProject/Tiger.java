package ZooProject;

public class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    public void setProperties(int stripes, int speed, int soundLevel) {
        this.numberOfStripes = stripes;
        this.speed = speed;
        this.soundLevelOfRoar = soundLevel;
    }

    public void displayProperties() {
        System.out.println("Stripes: " + numberOfStripes);
        System.out.println("Speed: " + speed);
        System.out.println("Roar Sound Level: " + soundLevelOfRoar);
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed " + speed);
    }

    @Override
    public void eatingFood() {
        System.out.println("Tiger is eating meat.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger has completed eating.");
    }
}
