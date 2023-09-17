package version_2.model;

public class Participant implements Comparable<Participant> {

    private int ticket;

    private String name;

    public Participant(int id, String name) {
        this.name = name;
        this.ticket = id;
    }

    public int getTicket() {
        return ticket;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "id=" + ticket +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Participant o) {
        return this.ticket - o.getTicket();
    }
}
