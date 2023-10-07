package intermediate.inheritance;

public class PersonList {
    public static void main(String[] args) {
        Student pipko = new Student("Odri Anna", 11, "2131 God, Bornemissza Pal u. 15", "+36305557880", "anna.odri@gmail.com", 4.23, "5.B");
        Student klambi = new Student("Odri Adam", 6, "2131 God, Bornemissza Pal u., 15", "+36305557881", "adam.odri@gmail.com", 0, "Napsugar");

        Student[] students = new Student[2];
        students[0] = pipko;
        students[1] = klambi;

        for ( Student student : students) {
            System.out.println("---------------------------------");
            student.getBio();
        }

        Teacher annaneni = new Teacher("Fulop Anna", 45, "2132 God, Pesti ut 10", "+36205551440", "annaneni78@yahoo.com", "Mathematics", 87);
        Teacher kungFuBela = new Teacher("Orban 'KungFu' Bela", 48, "2330 Vac, Nekeresd u. 11", "+36705552998", "kungfu-kutya@gmail.com", "Kung Fu", 1);

        Teacher[] teachers = new Teacher[2];
        teachers[0] = annaneni;
        teachers[1] = kungFuBela;

        for (Teacher teacher: teachers) {
            System.out.println("---------------------------------");
            teacher.getBio();
        }
    }
}
