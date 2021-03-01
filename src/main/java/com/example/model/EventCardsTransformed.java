package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "event_cards_transformed")
public class EventCardsTransformed extends Model {

    private String card;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private EventChoice eventChoice;

    public EventCardsTransformed() {

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
