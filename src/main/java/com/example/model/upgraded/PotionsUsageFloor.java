package com.example.model.upgraded;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "potions_usage_floors")
public class PotionsUsageFloor extends Model {

    private Integer floor;

    @ManyToOne
    @JoinColumn(name = "run_id")
    private Run run;

    public PotionsUsageFloor() {

    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }
}
