package entities;

import java.util.ArrayList;
import java.util.List;

public class MasterTraining {

    public static final int undefined = 1;

    private List<Plan> plans;
    private List<Cyclist> cyclists = new ArrayList<>();
    private List<Trainer> trainers = new ArrayList<>();
    private List<Workout> workouts = new ArrayList<>();
    public MasterTraining() {
        this.plans = new ArrayList<>();
    }

    /**
     * Determina para un plan específico el rendimiento del corazón del ciclista.
     * Si el corazón presenta latidos irregulares, crea un nuevo plan de tipo “Heart Care” para dicho ciclista.
     *
     * @param number El numero del plan a verificar
     * @return Plan: El nuevo plan creado en caso de necesitarlo, de lo contrario null.
     */
    public Plan checkHeart(long number) {
        return null;
    }

    public void addPlan(Plan plan) {
        this.plans.add(plan);
    }

    public int countPlans() {
        return this.plans.size();
    }
}
