package com.example.model.upgraded;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "master_deck")
public class MasterDeck extends Model {

    private String card;

    @ManyToOne
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
