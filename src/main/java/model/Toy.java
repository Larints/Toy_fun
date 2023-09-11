package model;

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
