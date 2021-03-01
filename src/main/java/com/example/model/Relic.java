package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "relics")
public class Relic extends Model {

    private String relic;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "run_id")
    private Run run;

    public Relic() {

    }

    public String getRelic() {
        return relic;
    }

    public void setRelic(String relic) {
        this.relic = relic;
    }

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }
}
