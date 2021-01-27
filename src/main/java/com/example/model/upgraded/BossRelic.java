package com.example.model.upgraded;

import javax.persistence.*;

@Entity
@Table(name = "boss_relics")
public class BossRelic extends Model {

    @Column(name = "number_of_choice")
    private Integer numberOfChoice;
    @Column(name = "is_picked")
    private Boolean isPicked;
    private String relic;

    @ManyToOne
    @JoinColumn(name = "run_id")
    private Run run;

    public BossRelic() {

    }

    public Integer getNumberOfChoice() {
        return numberOfChoice;
    }

    public void setNumberOfChoice(Integer numberOfChoice) {
        this.numberOfChoice = numberOfChoice;
    }

    public Boolean getPicked() {
        return isPicked;
    }

    public void setPicked(Boolean picked) {
        isPicked = picked;
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
