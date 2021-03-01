package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "master_deck")
public class MasterDeck extends Model {

    private String card;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "run_id")
    private Run run;

    public MasterDeck() {

    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }
}
