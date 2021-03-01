package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "potions_floor_spawned")
public class PotionsFloorSpawned extends Model {

    private Integer floor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "run_id")
    private Run run;

    public PotionsFloorSpawned() {

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
