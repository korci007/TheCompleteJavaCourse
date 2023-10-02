package intermediate.classesandobjects;

public class MovieActorApp {
    public static void main(String[] args) {
        int actorId = 1;
        MovieActor margot = new MovieActor("Margot Robbie", 1990, "single", actorId++);
        MovieActor tom = new MovieActor("Tom Cruise", 1963, "married", actorId++);
        MovieActor  monica = new MovieActor("Monica Bellucci", 1964, "married", actorId);

        MovieActor[] movieActors = {margot, tom, monica};

        for (MovieActor movieActor: movieActors) {
            System.out.println(movieActor.actorName + ", Born: " + movieActor.actorBirtDate + "("
                    + movieActor.getActorAge()+ "), Status: " + movieActor.getActorStatus() + ", Id: "
                    + movieActor.getActorId());
        }
    }
}
