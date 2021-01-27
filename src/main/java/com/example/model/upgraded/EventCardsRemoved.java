package com.example.model.upgraded;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "event_cards_removed")
public class EventCardsRemoved extends Model {

    private String card;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventChoice eventChoice;

    public EventCardsRemoved() {

    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public EventChoice getEventChoice() {
        return eventChoice;
    }

    public void setEventChoice(EventChoice eventChoice) {
        this.eventChoice = eventChoice;
    }
}
