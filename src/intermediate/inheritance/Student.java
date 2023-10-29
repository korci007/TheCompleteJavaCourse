package intermediate.inheritance;

public class Student extends Person{
    private final int idNumber;
    private final double averageGrade;
    private final String attendsClass;
    public Student(String name, int age, String address, String phoneNumber, String emailAddress, String likes, double averageGrade, String attendsClass) {
        super("Student", name, age, address, phoneNumber, emailAddress, likes);
        this.averageGrade = averageGrade;
        this.attendsClass = attendsClass;
        this.idNumber = Person.getIdNumber();
    }

    @Override
    public void getBio() {
        System.out.println("Person ID: " + idNumber);
        super.getBio();
        System.out.println(super.getName() + " attends " + attendsClass + " with the average grade of: " + averageGrade);
    }
}
