
import version_2.model.ParticipantQueue;
import version_2.model.Toy_Machine;

public class Main {
    public static void main(String[] args) {
        ParticipantQueue participantQueue = new ParticipantQueue();
        Toy_Machine toyMachine = new Toy_Machine(participantQueue);
        participantQueue.addParticipant(1, "John");
        participantQueue.addParticipant(2, "John");
        participantQueue.addParticipant(3, "John");
        participantQueue.addParticipant(4, "John");
        participantQueue.addParticipant(5, "John");
        toyMachine.put("Кукла", 20);
        toyMachine.put("Робот", 20);
        toyMachine.put("Конструктор", 60);
        toyMachine.put("Конструктор", 60);
        toyMachine.put("Конструктор", 60);
        toyMachine.letsFun();

    }
}
