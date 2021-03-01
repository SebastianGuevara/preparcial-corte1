package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Week {

    private int number;
    private Duration rideTime;
    private String objective;

    private Plan plan;
    private List<Session> sessions;

    public Week() {
        this.sessions = new ArrayList<>();
    }

    public void registerSession(Session session) {
        this.sessions.add(session);
    }

    public void assingPlan(Plan plan) {
        this.plan = plan;
    }

}
