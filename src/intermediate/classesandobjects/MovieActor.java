package intermediate.classesandobjects;

public class MovieActor {

    String actorName;
    int actorBirtDate;
    int date = 2023;
    private int actorAge;
    private String actorStatus;
    private int actorId;

    public MovieActor(String actorName, int actorBirtDate, String actorStatus, int actorId) {
        this.actorName = actorName;
        this.actorBirtDate = actorBirtDate;
        this.actorAge = this.date - actorBirtDate;
        this.actorStatus = actorStatus;
        this.actorId = actorId;
    }
    public String getActorStatus() {
        return this.actorStatus;
    }
    public int getActorAge() {
        if (actorAge > 18) {
            return this.actorAge;
        } else {
            return -1;
        }
    }

    public int getActorId() {
        return this.actorId;
    }
}
