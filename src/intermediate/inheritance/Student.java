package intermediate.inheritance;

public class Student extends Person{
    private double averageGrade;
    private String attendsClass;
    public Student(String name, int age, String address, String phoneNumber, String emailAddress, double averageGrade, String attendsClass) {
        super("Student", name, age, address, phoneNumber, emailAddress);
        this.averageGrade = averageGrade;
        this.attendsClass = attendsClass;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println(super.getName() + " attends " + attendsClass + " with the average grade of: " + averageGrade);
    }
}
