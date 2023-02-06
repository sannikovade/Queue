public class Person {
    public String name;
    public String surname;
    public int numberOfTickets;

    public Person(String name, String surname, int numberOfTickets) {
        this.name = name;
        this.surname = surname;
        this.numberOfTickets = numberOfTickets;
    }

    public boolean removeTicket() {
        if (numberOfTickets > 0) {
            numberOfTickets--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  name + " " + surname + " - " + numberOfTickets + " tickets";
    }
}
