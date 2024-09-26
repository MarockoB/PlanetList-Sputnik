public class Sputnik {
    String name;
    double mass;
    String color;

    public Sputnik(String name, double mass, String color) {
        this.name = name;
        this.mass = mass;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Спутник{" + "Имя='" + name + '\'' + ", Масса=" + mass + ", Цвет='" + color + '\'' + '}';
    }
}
