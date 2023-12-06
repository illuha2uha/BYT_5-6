package Mediator;
import java.util.*;
public class Mediator {
    private final List<Person> people;

    public Mediator() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void sendMessage(String message, Person sender) {
        for (Person person : people) {
            if (!person.equals(sender)) {
                person.receiveMessage(message);
            }
        }
    }
}
