package com.example.model.upgraded;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "event_choices")
public class EventChoice extends Model {

    @Column(name = "damage_healed")
    private Integer damageHealed;
    @Column(name = "damage_taken")
    private Integer damageTaken;
    @Column(name = "gold_gain")
    private Integer goldGain;
    @Column(name = "gold_loss")
    private Integer goldLoss;
    @Column(name = "max_hp_gain")
    private Integer maxHpGain;
    @Column(name = "max_hp_loss")
    private Integer maxHpLoss;
    @Column(name = "event_name")
    private String eventName;
    @Column(name = "player_choice")
    private String playerChoice;
    private Integer floor;

    @ManyToOne
    @JoinColumn(name = "run_id")
    private Run run;

    @OneToMany(mappedBy = "eventChoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EventCardsRemoved> eventCardsRemoveds;
    @OneToMany(mappedBy = "eventChoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EventCardsTransformed> eventCardsTransformeds;
    @OneToMany(mappedBy = "eventChoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EventCardsObtained> eventCardsObtaineds;
    @OneToMany(mappedBy = "eventChoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EventCardsUpgraded> eventCardsUpgradeds;
    @OneToMany(mappedBy = "eventChoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EventRelicsObtained> eventRelicsObtaineds;
    @OneToMany(mappedBy = "eventChoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EventRelicsLost> eventRelicsLosts;
    @OneToMany(mappedBy = "eventChoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EventPotionsObtained> eventPotionsObtaineds;

    public EventChoice() {
        eventCardsRemoveds = new ArrayList<>();
        eventCardsTransformeds = new ArrayList<>();
        eventCardsObtaineds = new ArrayList<>();
        eventCardsUpgradeds = new ArrayList<>();
        eventRelicsObtaineds = new ArrayList<>();
        eventRelicsLosts = new ArrayList<>();
        eventPotionsObtaineds = new ArrayList<>();
    }

    public void addEventCardsRemoved(EventCardsRemoved eventCardsRemoved) {
        eventCardsRemoveds.add(eventCardsRemoved);
        eventCardsRemoved.setEventChoice(this);
    }

    public void removeEventCardsRemoved(EventCardsRemoved eventCardsRemoved) {
        eventCardsRemoveds.remove(eventCardsRemoved);
        eventCardsRemoved.setEventChoice(null);
    }

    public void addEventCardsTransformed(EventCardsTransformed eventCardsTransformed) {
        eventCardsTransformeds.add(eventCardsTransformed);
        eventCardsTransformed.setEventChoice(this);
    }

    public void removeEventCardsTransformed(EventCardsTransformed eventCardsTransformed) {
        eventCardsTransformeds.remove(eventCardsTransformed);
        eventCardsTransformed.setEventChoice(null);
    }

    public void addEventCardsObtained(EventCardsObtained eventCardsObtained) {
        eventCardsObtaineds.add(eventCardsObtained);
        eventCardsObtained.setEventChoice(this);
    }

    public void removeEventCardsObtained(EventCardsObtained eventCardsObtained) {
        eventCardsObtaineds.remove(eventCardsObtained);
        eventCardsObtained.setEventChoice(null);
    }

    public void addEventCardsUpgraded(EventCardsUpgraded eventCardsUpgraded) {
        eventCardsUpgradeds.add(eventCardsUpgraded);
        eventCardsUpgraded.setEventChoice(this);
    }

    public void removeEventCardsUpgraded(EventCardsUpgraded eventCardsUpgraded) {
        eventCardsUpgradeds.remove(eventCardsUpgraded);
        eventCardsUpgraded.setEventChoice(null);
    }

    public void addEventRelicsObtained(EventRelicsObtained eventRelicsObtained) {
        eventRelicsObtaineds.add(eventRelicsObtained);
        eventRelicsObtained.setEventChoice(this);
    }

    public void removeEventRelicsObtained(EventRelicsObtained eventRelicsObtained) {
        eventRelicsObtaineds.remove(eventRelicsObtained);
        eventRelicsObtained.setEventChoice(null);
    }

    public void addEventRelicsLost(EventRelicsLost eventRelicsLost) {
        eventRelicsLosts.add(eventRelicsLost);
        eventRelicsLost.setEventChoice(this);
    }

    public void removeEventRelicsLost(EventRelicsLost eventRelicsLost) {
        eventRelicsLosts.remove(eventRelicsLost);
        eventRelicsLost.setEventChoice(null);
    }

    public Integer getDamageHealed() {
        return damageHealed;
    }

    public void setDamageHealed(Integer damageHealed) {
        this.damageHealed = damageHealed;
    }

    public Integer getDamageTaken() {
        return damageTaken;
    }

    public void setDamageTaken(Integer damageTaken) {
        this.damageTaken = damageTaken;
    }

    public Integer getGoldGain() {
        return goldGain;
    }

    public void setGoldGain(Integer goldGain) {
        this.goldGain = goldGain;
    }

    public Integer getGoldLoss() {
        return goldLoss;
    }

    public void setGoldLoss(Integer goldLoss) {
        this.goldLoss = goldLoss;
    }

    public Integer getMaxHpGain() {
        return maxHpGain;
    }

    public void setMaxHpGain(Integer maxHpGain) {
        this.maxHpGain = maxHpGain;
    }

    public Integer getMaxHpLoss() {
        return maxHpLoss;
    }

    public void setMaxHpLoss(Integer maxHpLoss) {
        this.maxHpLoss = maxHpLoss;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
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

    public List<EventCardsRemoved> getEventCardsRemoveds() {
        return eventCardsRemoveds;
    }

    public void setEventCardsRemoveds(List<EventCardsRemoved> eventCardsRemoveds) {
        this.eventCardsRemoveds = eventCardsRemoveds;
    }

    public List<EventCardsTransformed> getEventCardsTransformeds() {
        return eventCardsTransformeds;
    }

    public void setEventCardsTransformeds(List<EventCardsTransformed> eventCardsTransformeds) {
        this.eventCardsTransformeds = eventCardsTransformeds;
    }

    public List<EventCardsObtained> getEventCardsObtaineds() {
        return eventCardsObtaineds;
    }

    public void setEventCardsObtaineds(List<EventCardsObtained> eventCardsObtaineds) {
        this.eventCardsObtaineds = eventCardsObtaineds;
    }

    public List<EventCardsUpgraded> getEventCardsUpgradeds() {
        return eventCardsUpgradeds;
    }

    public void setEventCardsUpgradeds(List<EventCardsUpgraded> eventCardsUpgradeds) {
        this.eventCardsUpgradeds = eventCardsUpgradeds;
    }

    public List<EventRelicsObtained> getEventRelicsObtaineds() {
        return eventRelicsObtaineds;
    }

    public void setEventRelicsObtaineds(List<EventRelicsObtained> eventRelicsObtaineds) {
        this.eventRelicsObtaineds = eventRelicsObtaineds;
    }

    public List<EventRelicsLost> getEventRelicsLosts() {
        return eventRelicsLosts;
    }

    public void setEventRelicsLosts(List<EventRelicsLost> eventRelicsLosts) {
        this.eventRelicsLosts = eventRelicsLosts;
    }

    public List<EventPotionsObtained> getEventPotionsObtaineds() {
        return eventPotionsObtaineds;
    }

    public void setEventPotionsObtaineds(List<EventPotionsObtained> eventPotionsObtaineds) {
        this.eventPotionsObtaineds = eventPotionsObtaineds;
    }
}
