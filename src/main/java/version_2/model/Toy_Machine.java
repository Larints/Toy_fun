package version_2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Toy_Machine implements Toy_Machine_Interface {

    private int id;

    private ParticipantQueue participantQueue;

    private List<Integer> idList;

    private List<Integer> weightList;

    private List<String> nameList;

    private List<Toy> toyList;

    private Random random;


    public Toy_Machine(ParticipantQueue participantQueue) {
        idList = new ArrayList<>();
        weightList = new ArrayList<>();
        nameList = new ArrayList<>();
        this.participantQueue = participantQueue;
        random = new Random();
    }

    @Override
    public void put(String name, int weight) throws IllegalArgumentException {
        idList.add(++id);
        nameList.add(name);
        weightList.add(weight);
        toyList.add(new Toy(++id, name, weight));
    }

    @Override
    public String get(String name) {
        return null;
    }


    @Override
    public int getToy() {
        int randomValue = random.nextInt(1, 101);
        int cumulativeProbability = 0;

        for (int i = 0; i < idList.size(); i++) {
            cumulativeProbability += toyList.get(i).getWeight();
            if (randomValue < cumulativeProbability) {
                int result = toyList.get(i).getId();
                toyList.remove(i);
                return result;
            }
        }
        return toyList.get(toyList.size() - 1).getId();
    }

    @Override
    public void getAllToys() {

    }

    @Override
    public void letsFun() {
        while (!participantQueue.isEmpty()) {
            int toyId = getToy();
            if (toyId == 0) {
                System.out.println("Розыгрыш на сегодня окончен");
                break;
            } else {
                System.out.println("Участник под номером " + participantQueue.getParticipants() +
                        " получает игрушку под номером " + toyId);
                participantQueue.removeParticipants();
            }
        }
        if (participantQueue.isEmpty()) System.out.println("Очередь пуста");
    }
}
