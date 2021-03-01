package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "event_relics_lost")
public class EventRelicsLost extends Model {

    private String relic;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private EventChoice eventChoice;

    public EventRelicsLost() {

    }

    public String getRelic() {
        return relic;
    }

    public void setRelic(String relic) {
        this.relic = relic;
    }

    public EventChoice getEventChoice() {
        return eventChoice;
    }

    public void setEventChoice(EventChoice eventChoice) {
        this.eventChoice = eventChoice;
    }
}
