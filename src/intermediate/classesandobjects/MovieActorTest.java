package intermediate.classesandobjects;

public class MovieActorTest {
    public static void main(String[] args) {
        /* String name = "Margot Robbie";
         * int dateOfBirth = 1990;
         * int currentDate = 2023;
         */
        MovieActor margotRobbie = new MovieActor("Margot Robbie", 1990, "single",1 );
        MovieActor tomCruise = new MovieActor("Tom Cruise", 1963, "married",2);

        // test for status
        System.out.print("Test 1: ");
        if (tomCruise.getActorStatus().equals("married")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // Test for age
        System.out.print("Test 2: ");
        if (margotRobbie.getActorAge() == 33) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

    }
}
