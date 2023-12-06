package Mediator;

public class Person {
    private final Mediator chat;
    private final String name;

    public Person(Mediator chat, String name) {
        this.chat = chat;
        this.name = name;
        chat.addPerson(this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }

    public void sendMessage(String message) {
        System.out.println(name + " sends message: " + message);
        chat.sendMessage(message, this);
    }
}
