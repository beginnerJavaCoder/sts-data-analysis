package com.example.model.upgraded;

import javax.persistence.*;

@Entity
@Table(name = "campfire_choices")
public class CampfireChoice extends Model {

    private String data;
    private Integer floor;
    private String choice;

    @ManyToOne
    @JoinColumn(name = "run_id")
    private Run run;

    public CampfireChoice() {

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }
}
