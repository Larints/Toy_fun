package model;

import java.util.PriorityQueue;

public class Toy_Machine implements Toy_Machine_Interface {

    private int id;

    private PriorityQueue<Toy> toys;

    public Toy_Machine() {
        toys = new PriorityQueue<>(Toy::compareTo);
    }

    @Override
    public void put(String name) throws IllegalArgumentException {
        switch (name) {
            case "Конструктор", "Робот" -> toys.add(new Toy(id++, name, 2));
            case "Кукла" -> toys.add(new Toy(id++, name, 6));
        }
    }

    @Override
    public String get(String name) {
        for (Toy toy : toys) {
            if (toy.getName().equals(name)) {
                return toy.toString();
            }
        }
        return null;
    }


    @Override
    public void letsFun() {
        System.out.println(toys.peek() != null ? toys.peek().toString() : null);
        toys.poll();
    }

    @Override
    public void getAllToys() {
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }
}
