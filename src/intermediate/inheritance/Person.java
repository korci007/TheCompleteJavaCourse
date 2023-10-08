package intermediate.inheritance;

public class Person {
    private static int idNumber;
    private final String occupation;
    private final String name;
    private final int age;
    private final String address;
    private final String phoneNumber;
    private final String emailAddress;
    private final String likes;

    public Person(String occupation, String name, int age, String address, String phoneNumber, String emailAddress, String likes) {
        this.occupation = occupation;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.likes = likes;
    }

    public void getBio() {
        System.out.println("Name: " + name + " (" + occupation + ")");
        System.out.println("Age: " + age );
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phoneNumber + " , Email: " + emailAddress);
    }

    public String getLikes() {
        return likes;
    }

    public String getName() {
        return name;
    }

    public static int getIdNumber() {
        return ++Person.idNumber;
    }
}
