package com.example.model.upgraded;

import javax.persistence.*;

@Entity
@Table(name = "card_choices")
public class CardChoice extends Model {

    private String card;
    @Column(name = "is_picked")
    private Boolean isPicked;
    private Integer floor;

    @ManyToOne
    @JoinColumn(name = "run_id")
    private Run run;

    public CardChoice() {

    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Boolean getPicked() {
        return isPicked;
    }

    public void setPicked(Boolean picked) {
        isPicked = picked;
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
