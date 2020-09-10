package Praktika3;

class Rib {
    Rib(int age, String color) {
        this.age = age;
        this.color = color;
    }

    Rib(int age) {
        this.age = age;
    }

    protected int age;
    protected String color = "White";

    void growOlder() {
        age++;
    }

}

class Woman extends Rib {
    Woman(int age, int height) {
        super(age);
        this.height = height;
    }

    Woman(int age, int height, String color) {
        super(age, color);
        this.height = height;
    }

    protected int height;
}

public class Human { // basically a Main class

    public static void main(String[] args) {
        Rib rib = new Rib(0);
        rib.growOlder();
        Woman eve = new Woman(0, 170, "Black");
        eve.growOlder();
    }

}