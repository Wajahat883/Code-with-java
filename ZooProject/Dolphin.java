package ZooProject;

public class Dolphin extends Animal implements Swim {
    private String colorOfDolphin;
    private int swimmingSpeed;

    public void setProperties(String color, int speed) {
        this.colorOfDolphin = color;
        this.swimmingSpeed = speed;
    }

    public void displayProperties() {
        System.out.println("Color: " + colorOfDolphin);
        System.out.println("Swimming Speed: " + swimmingSpeed);
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed);
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin is eating fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin has completed eating.");
    }
}
