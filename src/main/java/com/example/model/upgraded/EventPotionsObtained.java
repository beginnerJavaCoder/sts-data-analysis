package com.example.model.upgraded;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "event_potions_obtained")
public class EventPotionsObtained extends Model {

    private String potion;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventChoice eventChoice;

    public EventPotionsObtained() {

    }

    public String getPotion() {
        return potion;
    }

    public void setPotion(String potion) {
        this.potion = potion;
    }

    public EventChoice getEventChoice() {
        return eventChoice;
    }

    public void setEventChoice(EventChoice eventChoice) {
        this.eventChoice = eventChoice;
    }
}
