package entities;

import java.util.Date;

public class Session {

    private char type;
    private int dayoOfWeek;


    private Activity activity;

    public void assignActivity(Activity activity) {
        this.activity = activity;
    }
    public Date date()
    {
        return new Date();
    }

}
