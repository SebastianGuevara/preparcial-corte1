package entities;

import java.util.ArrayList;
import java.util.List;

public class Week {

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
