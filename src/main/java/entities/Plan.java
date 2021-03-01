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
    public Plan(String type)
    {
        this.type=type;
        //this.cyclist=c;
    }

    public void addWeek(Week week) {
        this.weeks.add(week);
    }

    public long getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public int avarageBeats()
    {
        int pab = 0;
        for (Week week : weeks) {
            pab = week.avarageBeats();
        }
        return pab;
    }

}
