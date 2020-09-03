public class Ball {

    public String type;
    public double diameter;
    public String colour;

    @Override
    public String toString() {
        return "Мяч типа " + type + ", диаметром " + diameter + ", цвет " + colour + ". Класс: Кетер";
    }
}
