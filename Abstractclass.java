abstract class animal {
    int x, y;

    abstract void sound();

    void sleep() {
        System.out.print("Dogs MAke Sound:");
    }

}

class Dog extends animal {
    @Override
    void sound() {
        System.out.print("don't make sound ");
    }
}

class cat extends animal {
    @Override
    void sound() {
        System.out.println("meaow");
    }
}

public class Abstractclass {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        cat c1 = new cat();
        d1.sound();
        c1.sound();
        d1.sleep();
    }
}
