package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "hp_per_floor")
public class HpPerFloor extends Model {

    @Column(name = "current_hp")
    private Integer currentHp;
    @Column(name = "max_hp")
    private Integer maxHp;
    private Integer floor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "run_id")
    private Run run;

    public HpPerFloor() {

    }

    public Integer getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(Integer currentHp) {
        this.currentHp = currentHp;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(Integer maxHp) {
        this.maxHp = maxHp;
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
