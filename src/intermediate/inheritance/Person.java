package intermediate.inheritance;

public class Person {
    private String occupation;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    private String likes;

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
}
