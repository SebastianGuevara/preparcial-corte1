package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cyclist
{
    private String email;
    private String name;
    private Date birthDate;
    private int level;
    private double  height;
    private double weight;

    private List<Activity> results = new ArrayList<>();
    private List<Plan> plans = new ArrayList<>();

    public List<Plan> getPlans()
    {
        return this.plans;
    }
    public String getName()
    {
        return this.name;
    }

}
