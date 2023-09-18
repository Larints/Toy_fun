package version_2.cotroller;

import version_2.model.ParticipantQueue;
import version_2.model.Toy_Machine;
import version_2.viewer.UI;


/**
 * @apiNote Класс Контроллер, реализующий модель MVC
 */
public class Controller {

    private ParticipantQueue participantQueue;

    private Toy_Machine toyMachine;

    private UI userInterface;

    public Controller() {
        this.participantQueue = new ParticipantQueue();
        this.toyMachine = new Toy_Machine(participantQueue);
        this.userInterface = new UI();
    }


    /**
     * Метод старта программы
     */
    public void letsGo() {

        while (true) {
            String toy = userInterface.addToy();
            if (toy.equalsIgnoreCase("стоп")) break;
            else toyMachine.put(toy);
        }
        registration();
    }

    /**
     * Метод регистрации участников
     */
    public void registration() {
        while (true) {
            String participant = userInterface.registrations();
            if (participant.equalsIgnoreCase("стоп")) break;
            else {
                participantQueue.addParticipant(participant);
                System.out.println(UI.ticket + participantQueue.getParticipants());
            }
        }
        letsFun();
    }

    /**
     * Метод розыгрыша
     */
    public void letsFun() {
        while (true) {
            System.out.println(UI.menu);
            int select = userInterface.select();
            switch (select) {
                case 1 -> toyMachine.getAllToys();
                case 2 -> {
                    toyMachine.letsFun();
                    return;
                }
                case 3 -> {
                    return;
                }
            }
        }
    }
}
