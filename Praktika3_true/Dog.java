package Praktika3_true;

public abstract class Dog {
    private int hp = -1;
    private String color;

    Dog(String color) {
        this.color = color;
    }

    public int getHp() {
        return hp;
    }

    protected void setHp(int hp) {
        if (this.hp == 0) {
            return;
        }
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public abstract void eat(String foodType);

    public abstract void socialize(Dog otherDog);

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Shiba();
        dogs[1] = new Labrador("black");
        dogs[2] = new Pug("white");

        for (int i = 0; i < 3; i++) {
            //dogs[i].eat("chocolate");
            dogs[i].socialize(dogs[(i + 1) % 3]);
        }

        for (Dog dog : dogs) {
            System.out.println(dog.getColor() + " " + dog.getHp());
        }

    }

}

class Shiba extends Dog {
    Shiba() {
        super("yellow");
        setHp(15);
    }

    @Override
    public void eat(String foodType) {
        if (foodType.equals("chocolate")) {
            setHp(getHp() - 1);
        }
        else if (foodType.equals("sushi")) {
            setHp(getHp() + 1);
        }
    }

    @Override
    public void socialize(Dog otherDog) {
        otherDog.setHp(otherDog.getHp() - 1);
    }
}

class Pug extends Dog {
    Pug(String color) {
        super(color);
        setHp(5);
    }

    @Override
    public void eat(String foodType) {
        if (foodType.equals("chocolate")) {
            setHp(getHp() - 1);
        }
    }

    @Override
    public void socialize(Dog otherDog) {
        otherDog.setHp(otherDog.getHp() + 1);
    }
}

class Labrador extends Dog {
    Labrador(String color) {
        super(color);
        setHp(25);
    }

    @Override
    public void eat(String foodType) {
        setHp(getHp() + 1);
    }

    @Override
    public void socialize(Dog otherDog) {
        otherDog.setHp(otherDog.getHp() + 1);
    }
}