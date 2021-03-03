package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plan {

    public static final int MIN_BEATS = 90;
    public static final int MAX_BEATS = 160;


    private long number;
    private Date date;
    private String type;
    private int level;
    private boolean active;
    private Date start;
    private Date end;

    private Cyclist cyclist;
    private Trainer trainer;
    private List<ProgressLog> progress = new ArrayList<>();
    private List<Week> weeks;

    public Plan(long number) {
        this.number = number;
        this.weeks = new ArrayList<>();
    }
    public Plan(String type,Cyclist c)
    {
        this.type=type;
        this.cyclist=c;
    }

    public void addWeek(Week week) {
        this.weeks.add(week);
    }

    public long getNumber() {
        return number;
    }

    public double avarageBeats()
    {
        double wab = 0;
        for (Week week : weeks) {
            wab += week.avarageBeats();
        }
        return this.weeks.size() == 0 ? 0 : wab/ this.weeks.size();
    }
    public Cyclist findCyclist(String name)
    {
        if (cyclist.getName().equals(name))
            return this.cyclist;
        else
            return null;
    }
    public void setWeeks(int now)
    {
        for (int i=0;i<now;i++)
        {
            this.weeks.add(new Week());
        }
    }

    public Cyclist getCyclist() {
        return cyclist;
    }
}
