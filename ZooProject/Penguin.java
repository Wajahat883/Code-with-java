package ZooProject;

public class Penguin extends Animal implements Walk, Swim {
    private String featherColor;
    private int walkSpeed;
    private int swimSpeed;

    public void setProperties(String color, int walk, int swim) {
        this.featherColor = color;
        this.walkSpeed = walk;
        this.swimSpeed = swim;
    }

    public void displayProperties() {
        System.out.println("Feather Color: " + featherColor);
        System.out.println("Walking Speed: " + walkSpeed);
        System.out.println("Swimming Speed: " + swimSpeed);
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed " + walkSpeed);
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed);
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin is eating fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin has completed eating.");
    }
}
