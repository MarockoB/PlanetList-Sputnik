import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        solarSys();
    }

    private static void solarSys() {
        List<Planet> planetList = new ArrayList<>();
        planetList.add(new Planet("Mercury", 3.33022e23));
        planetList.add(new Planet("Venera", 4.8675e24));
        planetList.add(new Planet("Earth", 5.9726e24));
        planetList.add(new Planet("Mars", 6.4171e23));
        planetList.add(new Planet("Jupiter", 1.8986e27));
        planetList.add(new Planet("Saturn", 5.6846e26));
        planetList.add(new Planet("Uran", 8.6813e25));
        planetList.add(new Planet("Neptune", 1.02409e26));
        System.out.println(planetList);

        planetList.sort(new Astronom());
        System.out.println("Сортировка планет по массе: " + planetList);

        planetList.sort(new Zvezdochet());
        System.out.println("Сортировка планет по названию: " + planetList);

        Planet earth = planetList.get(2);
        System.out.println(earth.getMoons());
        earth.addMoon(new Sputnik("Луна", 7.3477e22, "Серый"));
        System.out.println(earth.getMoons());

        Planet mars = planetList.get(3);
        mars.addMoon(new Sputnik("Фобос", 1.072e16, "Коричневый"));
        mars.getMoons().add(new Sputnik("Деймос", 1.48e15, "Коричневый"));
        System.out.println(mars.getMoons());

        Planet jupiter = planetList.get(4);
        jupiter.addMoon(new Sputnik("Ио", 8.9319e22, "Желтый"));
        jupiter.getMoons().add(new Sputnik("Европа", 4.8017e22, "Серый"));
        jupiter.getMoons().add(new Sputnik("Ганимед", 1.4819e23, "Светло-серый"));
        jupiter.getMoons().add(new Sputnik("Каллисто", 1.075e23, "Камуфляж"));
        System.out.println(jupiter.getMoons());

        //planetList.sort(Comparator.comparingInt()); //не сделано
    }
}

class Astronom implements Comparator<Planet> {
    @Override
    public int compare(Planet t1, Planet t2) {
        return Double.compare(t1.massa, t2.massa);
    }
}

class Zvezdochet implements Comparator<Planet> {
    @Override
    public int compare(Planet a, Planet b) {
        return a.name.compareTo(b.name);
    }
}