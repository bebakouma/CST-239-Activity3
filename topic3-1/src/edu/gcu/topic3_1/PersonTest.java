package edu.gcu.topic3_1;

import java.util.Arrays;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);
        Person p3 = new Person("Alice", 30);

        System.out.println("=== toString & equals ===");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        System.out.println("\np1 == p2? " + p1.equals(p2));
        System.out.println("p1 == p3? " + p1.equals(p3));

        System.out.println("\n=== walk/run/isRunning ===");
        p1.walk();
        System.out.println("Is " + p1.getName() + " running? " + p1.isRunning());

        p1.run();
        System.out.println("Is " + p1.getName() + " running? " + p1.isRunning());

        System.out.println("\n=== Sorting by Age ===");
        Person[] people = {
            new Person("Anna", 22),
            new Person("Charlie", 28),
            new Person("Brian", 20)
        };

        Arrays.sort(people);

        for (Person person : people) {
            System.out.println(person.getName() + " - Age: " + person.getAge());
        }
    }
}
