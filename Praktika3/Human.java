package Praktika3;

class Head {
    Head(double height, int iq, String color) {
        this.height = height;
        this.iq = iq;
        this.color = color;
    }

    private int iq;
    private double height;
    private String color;

    public double getHeight() {
        return height;
    }

    public int getIq() {
        return iq;
    }

    public String getColor() {
        return color;
    }

    public void think() {
        if (Math.random() > 0.5) {
            iq++;
        }
        else {
            iq--;
        }
    }
}

class Leg {
    Leg(double height, String color) {
        this.height = height;
        this.color = color;
    }

    private double height;
    private String color;

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}

class Hand {
    Hand(double height, String color) {
        this.height = height;
        this.color = color;
    }

    private double height;
    private String color;

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}

public class Human {

    Human(double height, int age, int iq, String color) {
        rightLeg = new Leg(height / 2, color);
        leftLeg = new Leg(height / 2, color);
        rightHand = new Hand(height / 3, color);
        leftHand = new Hand(height / 3, color);
        head = new Head(height / 6, iq, color);
        this.age = age;
    }

    private Leg rightLeg;
    private Leg leftLeg;
    private Hand rightHand;
    private Hand leftHand;
    private Head head;

    private int age;

    public double getApproximateHeight() {
        return rightLeg.getHeight() + rightHand.getHeight() + head.getHeight();
    }

    public void live() {
        head.think();
        age++;
    }

    public static void main(String[] args) { // for testing purposes
        Human danya = new Human(140, 90, 90, "Olive");
        danya.live();
        System.out.println(danya.getApproximateHeight());
    }
}
