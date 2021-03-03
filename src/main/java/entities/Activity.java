package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity {

    private long id;
    private String comments;
    private double duration;
    private Date date;
    private double distance;

    private List<Record> records;
    private List<Session> session = new ArrayList<>();

    public Activity() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        this.records.add(record);
    }
    public double averageBeats()
    {
        int aab=0;
        for (Record r : records)
        {
            aab+=r.getBeats();

        }

        return this.records.size() == 0 ? 0 : aab/this.records.size();
    }
}
