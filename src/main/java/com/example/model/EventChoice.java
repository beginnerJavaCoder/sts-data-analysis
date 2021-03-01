package com.example.model;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "run_id")
    private Run run;
    @OneToMany(mappedBy = "eventChoice", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<EventCardsRemoved> eventCardsRemovedList;
    @OneToMany(mappedBy = "eventChoice", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<EventCardsTransformed> eventCardsTransformedList;
    @OneToMany(mappedBy = "eventChoice", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<EventCardsObtained> eventCardsObtainedList;
    @OneToMany(mappedBy = "eventChoice", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<EventCardsUpgraded> eventCardsUpgradedList;
    @OneToMany(mappedBy = "eventChoice", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<EventRelicsObtained> eventRelicsObtainedList;
    @OneToMany(mappedBy = "eventChoice", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<EventRelicsLost> eventRelicsLostList;
    @OneToMany(mappedBy = "eventChoice", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<EventPotionsObtained> eventPotionsObtainedList;

    public EventChoice() {
        eventCardsRemovedList = new ArrayList<>();
        eventCardsTransformedList = new ArrayList<>();
        eventCardsObtainedList = new ArrayList<>();
        eventCardsUpgradedList = new ArrayList<>();
        eventRelicsObtainedList = new ArrayList<>();
        eventRelicsLostList = new ArrayList<>();
        eventPotionsObtainedList = new ArrayList<>();
    }

    public void addEventCardsRemoved(EventCardsRemoved eventCardsRemoved) {
        eventCardsRemovedList.add(eventCardsRemoved);
        eventCardsRemoved.setEventChoice(this);
    }

    public void removeEventCardsRemoved(EventCardsRemoved eventCardsRemoved) {
        eventCardsRemovedList.remove(eventCardsRemoved);
        eventCardsRemoved.setEventChoice(null);
    }

    public void addEventCardsTransformed(EventCardsTransformed eventCardsTransformed) {
        eventCardsTransformedList.add(eventCardsTransformed);
        eventCardsTransformed.setEventChoice(this);
    }

    public void removeEventCardsTransformed(EventCardsTransformed eventCardsTransformed) {
        eventCardsTransformedList.remove(eventCardsTransformed);
        eventCardsTransformed.setEventChoice(null);
    }

    public void addEventCardsObtained(EventCardsObtained eventCardsObtained) {
        eventCardsObtainedList.add(eventCardsObtained);
        eventCardsObtained.setEventChoice(this);
    }

    public void removeEventCardsObtained(EventCardsObtained eventCardsObtained) {
        eventCardsObtainedList.remove(eventCardsObtained);
        eventCardsObtained.setEventChoice(null);
    }

    public void addEventCardsUpgraded(EventCardsUpgraded eventCardsUpgraded) {
        eventCardsUpgradedList.add(eventCardsUpgraded);
        eventCardsUpgraded.setEventChoice(this);
    }

    public void removeEventCardsUpgraded(EventCardsUpgraded eventCardsUpgraded) {
        eventCardsUpgradedList.remove(eventCardsUpgraded);
        eventCardsUpgraded.setEventChoice(null);
    }

    public void addEventRelicsObtained(EventRelicsObtained eventRelicsObtained) {
        eventRelicsObtainedList.add(eventRelicsObtained);
        eventRelicsObtained.setEventChoice(this);
    }

    public void removeEventRelicsObtained(EventRelicsObtained eventRelicsObtained) {
        eventRelicsObtainedList.remove(eventRelicsObtained);
        eventRelicsObtained.setEventChoice(null);
    }

    public void addEventRelicsLost(EventRelicsLost eventRelicsLost) {
        eventRelicsLostList.add(eventRelicsLost);
        eventRelicsLost.setEventChoice(this);
    }

    public void removeEventRelicsLost(EventRelicsLost eventRelicsLost) {
        eventRelicsLostList.remove(eventRelicsLost);
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

    public List<EventCardsRemoved> getEventCardsRemovedList() {
        return eventCardsRemovedList;
    }

    public void setEventCardsRemovedList(List<EventCardsRemoved> eventCardsRemovedList) {
        this.eventCardsRemovedList = eventCardsRemovedList;
    }

    public List<EventCardsTransformed> getEventCardsTransformedList() {
        return eventCardsTransformedList;
    }

    public void setEventCardsTransformedList(List<EventCardsTransformed> eventCardsTransformedList) {
        this.eventCardsTransformedList = eventCardsTransformedList;
    }

    public List<EventCardsObtained> getEventCardsObtainedList() {
        return eventCardsObtainedList;
    }

    public void setEventCardsObtainedList(List<EventCardsObtained> eventCardsObtainedList) {
        this.eventCardsObtainedList = eventCardsObtainedList;
    }

    public List<EventCardsUpgraded> getEventCardsUpgradedList() {
        return eventCardsUpgradedList;
    }

    public void setEventCardsUpgradedList(List<EventCardsUpgraded> eventCardsUpgradedList) {
        this.eventCardsUpgradedList = eventCardsUpgradedList;
    }

    public List<EventRelicsObtained> getEventRelicsObtainedList() {
        return eventRelicsObtainedList;
    }

    public void setEventRelicsObtainedList(List<EventRelicsObtained> eventRelicsObtainedList) {
        this.eventRelicsObtainedList = eventRelicsObtainedList;
    }

    public List<EventRelicsLost> getEventRelicsLostList() {
        return eventRelicsLostList;
    }

    public void setEventRelicsLostList(List<EventRelicsLost> eventRelicsLostList) {
        this.eventRelicsLostList = eventRelicsLostList;
    }

    public List<EventPotionsObtained> getEventPotionsObtainedList() {
        return eventPotionsObtainedList;
    }

    public void setEventPotionsObtainedList(List<EventPotionsObtained> eventPotionsObtainedList) {
        this.eventPotionsObtainedList = eventPotionsObtainedList;
    }
}
