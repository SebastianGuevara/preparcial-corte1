package entities;

import java.time.Instant;

public class Record {

    private int beats;
    private double speed;
    private int power;
    private Instant time;

    public Record(int beats) {
        this.beats = beats;
    }
}
