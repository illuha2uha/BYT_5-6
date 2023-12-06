package Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator chat1 = new Mediator();
        Mediator chat2 = new Mediator();

        Person person1 = new Person(chat1, "Sam");
        Person person2 = new Person(chat1, "James");
        Person person3 = new Person(chat1, "Illia");

        Person person4 = new Person(chat2, "Wiktor");
        Person person5 = new Person(chat2, "Oleg");
        Person person6 = new Person(chat2, "Olga");

        person1.sendMessage("Hi, guys!");
        person3.sendMessage("Hello, Sam");
        System.out.println("\n\n\n");
        person5.sendMessage("Bye, my dear friends");
        person4.sendMessage("Goodbye!!!");



    }
}
