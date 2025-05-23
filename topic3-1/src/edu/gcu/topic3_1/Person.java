package edu.gcu.topic3_1;

public class Person implements PersonInterface, Comparable<Person> {
    private String name;
    private int age;
    private boolean running;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.running = false;
    }

    // toString override
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // equals override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    // walk() method from PersonInterface
    @Override
    public void walk() {
        running = false;
        System.out.println(name + " is walking.");
    }

    // run() method from PersonInterface
    @Override
    public void run() {
        running = true;
        System.out.println(name + " is running.");
    }

    // isRunning() method from PersonInterface
    @Override
    public boolean isRunning() {
        return running;
    }

    // compareTo() method from Comparable interface
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    // Getters for testing and access
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
