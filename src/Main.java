import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());

        while (!queue.isEmpty()) {

            Person passenger = queue.poll();
            passenger.removeTicket();
            if (passenger.numberOfTickets != 0) {
                queue.add(passenger);
            }

            System.out.println(passenger.name + " " + passenger.surname + " rode the ride");

        }

    }

    public static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Harry", "Potter", 3));
        clients.add(new Person("Frodo", "Baggins", 9));
        clients.add(new Person("Rose", "Tyler", 2));
        clients.add(new Person("Phil", "Dunphy", 12));
        clients.add(new Person("Morticia", "Addams", 6));
        return clients;
    }
}