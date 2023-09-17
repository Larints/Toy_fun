//package model;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Random;
//
//public class Toy_Machine implements Toy_Machine_Interface {
//
//    private int id;
//
//    private PriorityQueue<Toy> toys;
//
//    private List<Integer> idList;
//
//    private List<Integer> weightList;
//
//    private List<String> nameList;
//
//
//    public Toy_Machine() {
//        toys = new PriorityQueue<>();
//        idList = new ArrayList<>();
//        weightList = new ArrayList<>();
//        nameList = new ArrayList<>();
//    }
//
//    @Override
//    public void put(String name, int weight) throws IllegalArgumentException {
//        switch (name) {
//            case "Конструктор":
//                idList.add(id++);
//                weightList.add(weight);
//                nameList.add(name);
//            case "Кукла":
//                idList.add(id++);
//                weightList.add(weight);
//                nameList.add(name);
//            case "Робот":
//                idList.add(id++);
//                weightList.add(weight);
//                nameList.add(name);
//        }
//    }
//
//    @Override
//    public String get(String name) {
//        for (Toy toy : toys) {
//            if (toy.getName().equals(name)) {
//                return toy.toString();
//            }
//        }
//        return null;
//    }
//
//
//    @Override
//    public int letsFun() {
//        Random random = new Random();
//        int randomValue = random.nextInt(1, 101);
//        int cumulativeProbability = 0;
//
//        for (int i = 0; i < idList.size(); i++) {
//            cumulativeProbability += weightList.get(i);
//            if (randomValue < cumulativeProbability) {
//                toys.add(new Toy(idList.get(i), nameList.get(i), weightList.get(i)));
//                int result = idList.get(i);
//                idList.remove(idList.get(i));
//                return result;
//            }
//        }
//        return idList.get(idList.size() - 1);
//    }
//
//    @Override
//    public void getAllToys() {
//        for (Toy toy : toys) {
//            System.out.println(toy);
//        }
//    }
//
//    public void saveResult() {
//        if (toys.size() != 0) {
//            toys.forEach(toy -> write(toy.toString()));
//        }
//    }
//
//    private void write(String result) {
//        File resultFile = new File("/src/main/java/result.txt");
//        try (FileWriter fw = new FileWriter("result.txt")) {
//            fw.write(result);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
