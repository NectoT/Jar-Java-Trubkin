public class Dog {

    public Dog(String breed, int age, String colour) {
        this.breed = breed;
        this.age = age;
        this.colour = colour;
    }

    private String breed;
    private int age;
    private String colour;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Гав";
    }

    public int dogAgeToHuman() {
        return age * 7;
    }
}
