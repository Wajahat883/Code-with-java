class Student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;

    }

    public void setage(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Invalid age");
        }

    }

    public int getage() {
        return age;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Wajahat");
        s1.setage(23);
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getage());
    }

}