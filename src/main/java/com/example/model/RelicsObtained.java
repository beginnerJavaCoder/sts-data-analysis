package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "relics_obtained")
public class RelicsObtained extends Model {

    private String relic;
    private Integer floor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "run_id")
    private Run run;

    public RelicsObtained() {

    }

    public String getRelic() {
        return relic;
    }

    public void setRelic(String relic) {
        this.relic = relic;
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
