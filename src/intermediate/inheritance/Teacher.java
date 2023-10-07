package intermediate.inheritance;

public class Teacher extends Person{
    private final String teachesSubject;
    private final int numberOfStudents;
    public Teacher(String name, int age, String address, String phoneNumber, String emailAddress, String likes, String teachesSubject, int numberOfStudents) {
        super("Teacher" ,name, age, address, phoneNumber, emailAddress, likes);
        this.teachesSubject = teachesSubject;
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println(super.getName() + " teaches " + teachesSubject + " and has " + numberOfStudents + " student(s)");
    }
}
