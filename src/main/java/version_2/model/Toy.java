package version_2.model;

/**
 * @author <a href="Larin";
 * Класс игрушка, представляющий собой модель игрушки в магазине
 */
public class Toy implements Comparable<Toy> {

    private int id;

    private String name;

    private int weight;


    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Toy o) {
        return this.weight - o.weight;
    }
}
