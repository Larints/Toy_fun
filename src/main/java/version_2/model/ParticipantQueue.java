package version_2.model;

import java.util.PriorityQueue;

public class ParticipantQueue  {

    private int id;
    private PriorityQueue<Participant> participants;

    public ParticipantQueue() {
        participants = new PriorityQueue<>();
    }

    public void addParticipant(int id, String name) {
        participants.add(new Participant(id, name));
    }

    public boolean isEmpty() {
        return participants.isEmpty();
    }

    public int getParticipants() {
        return participants.peek() != null ? participants.peek().getTicket() : 0;
    }

    public void removeParticipants() {
        participants.poll();
    }
}






