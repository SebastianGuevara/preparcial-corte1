package entities;

import java.util.ArrayList;
import java.util.List;

public class Activity {

    private List<Record> records;

    public Activity() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        this.records.add(record);
    }
}
