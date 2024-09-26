import java.util.ArrayList;
import java.util.List;

public class Planet {
    String name;
    double massa;
    private List<Sputnik> moons = new ArrayList<>();

    public Planet(String name, double massa) {
        this.name = name;
        this.massa = massa;
    }

    @Override
    public String toString() {
        return "Планета " + "Название='" + name + '\'' + ", Масса=" + massa;
    }

    public double getMass() {
        return massa;
    }

    public void addMoon(Sputnik m){
        this.moons.add(m);
    }

    public List<Sputnik> getMoons() {
        return moons;
    }
}

