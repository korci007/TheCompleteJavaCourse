package intermediate.inheritance;

public class Person {
    private String occupation;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String occupation, String name, int age, String address, String phoneNumber, String emailAddress) {
        this.occupation = occupation;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void getBio() {
        System.out.println("Name: " + name + " (" + occupation + ")");
        System.out.println("Age: " + age );
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phoneNumber + " , Email: " + emailAddress);
    }

    public String getName() {
        return name;
    }
}
