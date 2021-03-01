package com.example.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "runs")
public class Run extends Model {

    @Column(name = "floor_reached")
    private Integer floorReached;
    private Integer playtime;
    private Integer score;
    @Column(name = "local_time")
    private Timestamp localTime;
    @Column(name = "is_ascension_mode")
    private Boolean isAscensionMode;
    @Column(name = "neow_cost")
    private String neowCost;
    @Column(name = "circlet_count")
    private Integer circletCount;
    @Column(name = "chosen_character")
    private String chosenCharacter;
    @Column(name = "campfire_rested")
    private Integer campfireRested;
    private Integer gold;
    @Column(name = "neow_bonus")
    private String neowBonus;
    @Column(name = "chose_seed")
    private Boolean choseSeed;
    @Column(name = "campfire_upgraded")
    private Integer campfireUpgraded;
    @Column(name = "build_version")
    private String buildVersion;
    @Column(name = "purchased_purges")
    private Integer purchasedPurges;
    private Boolean victory;
    @Column(name = "player_experience")
    private Integer playerExperience;
    @Column(name = "ascension_level")
    private Integer ascensionLevel;

    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<CampfireChoice> campfireChoiceList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<MasterDeck> masterDeckList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<Relic> relicList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<TakenDamage> takenDamageList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<PotionsUsageFloor> potionsUsageFloorList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<PotionsObtained> potionsObtainedList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<ItemsPurchased> itemsPurchasedList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<PathTaken> pathTakenList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<PathPerFloor> pathPerFloorList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<HpPerFloor> hpPerFloorList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<PotionsFloorSpawned> potionsFloorSpawnedList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<RelicsObtained> relicsObtainedList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<CardChoice> cardChoiceList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<BossRelic> bossRelicList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<ItemsPurged> itemsPurgedList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<GoldPerFloor> goldPerFloorList;
    @OneToMany(mappedBy = "run", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<EventChoice> eventChoiceList;

    public Run() {
        campfireChoiceList = new ArrayList<>();
        masterDeckList = new ArrayList<>();
        relicList = new ArrayList<>();
        takenDamageList = new ArrayList<>();
        potionsUsageFloorList = new ArrayList<>();
        potionsObtainedList = new ArrayList<>();
        itemsPurchasedList = new ArrayList<>();
        pathTakenList = new ArrayList<>();
        pathPerFloorList = new ArrayList<>();
        hpPerFloorList = new ArrayList<>();
        potionsFloorSpawnedList = new ArrayList<>();
        relicsObtainedList = new ArrayList<>();
        cardChoiceList = new ArrayList<>();
        bossRelicList = new ArrayList<>();
        itemsPurgedList = new ArrayList<>();
        goldPerFloorList = new ArrayList<>();
        eventChoiceList = new ArrayList<>();
    }

    public void addCampfireChoice(CampfireChoice campfireChoice) {
        campfireChoiceList.add(campfireChoice);
        campfireChoice.setRun(this);
    }

    public void removeCampfireChoice(CampfireChoice campfireChoice) {
        campfireChoiceList.remove(campfireChoice);
        campfireChoice.setRun(null);
    }

    public void addMasterDeck(MasterDeck masterDeck) {
        masterDeckList.add(masterDeck);
        masterDeck.setRun(this);
    }

    public void removeMasterDeck(MasterDeck masterDeck) {
        masterDeckList.remove(masterDeck);
        masterDeck.setRun(null);
    }

    public void addRelic(Relic relic) {
        relicList.add(relic);
        relic.setRun(this);
    }

    public void removeRelic(Relic relic) {
        relicList.remove(relic);
        relic.setRun(null);
    }

    public void addTakenDamage(TakenDamage takenDamage) {
        takenDamageList.add(takenDamage);
        takenDamage.setRun(this);
    }

    public void removeTakenDamage(TakenDamage takenDamage) {
        takenDamageList.remove(takenDamage);
        takenDamage.setRun(null);
    }

    public void addPotionsUsageFloor(PotionsUsageFloor potionsUsageFloor) {
        potionsUsageFloorList.add(potionsUsageFloor);
        potionsUsageFloor.setRun(this);
    }

    public void removePotionsUsageFloor(PotionsUsageFloor potionsUsageFloor) {
        potionsUsageFloorList.remove(potionsUsageFloor);
        potionsUsageFloor.setRun(null);
    }

    public void addPotionsObtained(PotionsObtained potionsObtained) {
        potionsObtainedList.add(potionsObtained);
        potionsObtained.setRun(this);
    }

    public void removePotionsObtained(PotionsObtained potionsObtained) {
        potionsObtainedList.remove(potionsObtained);
        potionsObtained.setRun(null);
    }

    public void addItemsPurchased(ItemsPurchased itemsPurchased) {
        itemsPurchasedList.add(itemsPurchased);
        itemsPurchased.setRun(this);
    }

    public void removeItemsPurchased(ItemsPurchased itemsPurchased) {
        itemsPurchasedList.remove(itemsPurchased);
        itemsPurchased.setRun(null);
    }

    public void addPathTaken(PathTaken pathTaken) {
        pathTakenList.add(pathTaken);
        pathTaken.setRun(this);
    }

    public void removePathTaken(PathTaken pathTaken) {
        pathTakenList.remove(pathTaken);
        pathTaken.setRun(null);
    }

    public void addPathPerFloor(PathPerFloor pathPerFloor) {
        pathPerFloorList.add(pathPerFloor);
        pathPerFloor.setRun(this);
    }

    public void removePathPerFloor(PathPerFloor pathPerFloor) {
        pathPerFloorList.remove(pathPerFloor);
        pathPerFloor.setRun(null);
    }

    public void addHpPerFloor(HpPerFloor hpPerFloor) {
        hpPerFloorList.add(hpPerFloor);
        hpPerFloor.setRun(this);
    }

    public void removeHpPerFloor(HpPerFloor hpPerFloor) {
        hpPerFloorList.remove(hpPerFloor);
        hpPerFloor.setRun(null);
    }

    public void addPotionsFloorSpawned(PotionsFloorSpawned potionsFloorSpawned) {
        potionsFloorSpawnedList.add(potionsFloorSpawned);
        potionsFloorSpawned.setRun(this);
    }

    public void removePotionsFloorSpawned(PotionsFloorSpawned potionsFloorSpawned) {
        potionsFloorSpawnedList.remove(potionsFloorSpawned);
        potionsFloorSpawned.setRun(null);
    }

    public void addRelicsObtained(RelicsObtained relicsObtained) {
        relicsObtainedList.add(relicsObtained);
        relicsObtained.setRun(this);
    }

    public void removeRelicsObtained(RelicsObtained relicsObtained) {
        relicsObtainedList.remove(relicsObtained);
        relicsObtained.setRun(null);
    }

    public void addCardChoice(CardChoice cardChoice) {
        cardChoiceList.add(cardChoice);
        cardChoice.setRun(this);
    }

    public void removeCardChoice(CardChoice cardChoice) {
        cardChoiceList.remove(cardChoice);
        cardChoice.setRun(null);
    }

    public void addBossRelic(BossRelic bossRelic) {
        bossRelicList.add(bossRelic);
        bossRelic.setRun(this);
    }

    public void removeBossRelic(BossRelic bossRelic) {
        bossRelicList.remove(bossRelic);
        bossRelic.setRun(null);
    }

    public void addItemsPurged(ItemsPurged itemsPurged) {
        itemsPurgedList.add(itemsPurged);
        itemsPurged.setRun(this);
    }

    public void removeItemsPurged(ItemsPurged itemsPurged) {
        itemsPurgedList.remove(itemsPurged);
        itemsPurged.setRun(null);
    }

    public void addGoldPerFloor(GoldPerFloor goldPerFloor) {
        goldPerFloorList.add(goldPerFloor);
        goldPerFloor.setRun(this);
    }

    public void removeGoldPerFloor(GoldPerFloor goldPerFloor) {
        goldPerFloorList.remove(goldPerFloor);
        goldPerFloor.setRun(null);
    }

    public void addEventChoice(EventChoice eventChoice) {
        eventChoiceList.add(eventChoice);
        eventChoice.setRun(this);
    }

    public void removeEventChoice(EventChoice eventChoice) {
        eventChoiceList.remove(eventChoice);
        eventChoice.setRun(null);
    }

    public Integer getFloorReached() {
        return floorReached;
    }

    public void setFloorReached(Integer floorReached) {
        this.floorReached = floorReached;
    }

    public Integer getPlaytime() {
        return playtime;
    }

    public void setPlaytime(Integer playtime) {
        this.playtime = playtime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Timestamp getLocalTime() {
        return localTime;
    }

    public void setLocalTime(Timestamp localTime) {
        this.localTime = localTime;
    }

    public Boolean getAscensionMode() {
        return isAscensionMode;
    }

    public void setAscensionMode(Boolean ascensionMode) {
        isAscensionMode = ascensionMode;
    }

    public String getNeowCost() {
        return neowCost;
    }

    public void setNeowCost(String neowCost) {
        this.neowCost = neowCost;
    }

    public Integer getCircletCount() {
        return circletCount;
    }

    public void setCircletCount(Integer circletCount) {
        this.circletCount = circletCount;
    }

    public String getChosenCharacter() {
        return chosenCharacter;
    }

    public void setChosenCharacter(String chosenCharacter) {
        this.chosenCharacter = chosenCharacter;
    }

    public Integer getCampfireRested() {
        return campfireRested;
    }

    public void setCampfireRested(Integer campfireRested) {
        this.campfireRested = campfireRested;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public String getNeowBonus() {
        return neowBonus;
    }

    public void setNeowBonus(String neowBonus) {
        this.neowBonus = neowBonus;
    }

    public Boolean getChoseSeed() {
        return choseSeed;
    }

    public void setChoseSeed(Boolean choseSeed) {
        this.choseSeed = choseSeed;
    }

    public Integer getCampfireUpgraded() {
        return campfireUpgraded;
    }

    public void setCampfireUpgraded(Integer campfireUpgraded) {
        this.campfireUpgraded = campfireUpgraded;
    }

    public String getBuildVersion() {
        return buildVersion;
    }

    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }

    public Integer getPurchasedPurges() {
        return purchasedPurges;
    }

    public void setPurchasedPurges(Integer purchasedPurges) {
        this.purchasedPurges = purchasedPurges;
    }

    public Boolean getVictory() {
        return victory;
    }

    public void setVictory(Boolean victory) {
        this.victory = victory;
    }

    public Integer getPlayerExperience() {
        return playerExperience;
    }

    public void setPlayerExperience(Integer playerExperience) {
        this.playerExperience = playerExperience;
    }

    public Integer getAscensionLevel() {
        return ascensionLevel;
    }

    public void setAscensionLevel(Integer ascensionLevel) {
        this.ascensionLevel = ascensionLevel;
    }

    public List<CampfireChoice> getCampfireChoiceList() {
        return campfireChoiceList;
    }

    public void setCampfireChoiceList(List<CampfireChoice> campfireChoiceList) {
        this.campfireChoiceList = campfireChoiceList;
        for (CampfireChoice c : this.campfireChoiceList) {
            c.setRun(this);
        }
    }

    public List<MasterDeck> getMasterDeckList() {
        return masterDeckList;
    }

    public void setMasterDeckList(List<MasterDeck> masterDeckList) {
        this.masterDeckList = masterDeckList;
        for (MasterDeck m : this.masterDeckList) {
            m.setRun(this);
        }
    }

    public List<Relic> getRelicList() {
        return relicList;
    }

    public void setRelicList(List<Relic> relicList) {
        this.relicList = relicList;
        for (Relic r : this.relicList) {
            r.setRun(this);
        }
    }

    public List<TakenDamage> getTakenDamageList() {
        return takenDamageList;
    }

    public void setTakenDamageList(List<TakenDamage> takenDamageList) {
        this.takenDamageList = takenDamageList;
        for (TakenDamage t : this.takenDamageList) {
            t.setRun(this);
        }
    }

    public List<PotionsUsageFloor> getPotionsUsageFloorList() {
        return potionsUsageFloorList;
    }

    public void setPotionsUsageFloorList(List<PotionsUsageFloor> potionsUsageFloorList) {
        this.potionsUsageFloorList = potionsUsageFloorList;
        for (PotionsUsageFloor p : this.potionsUsageFloorList) {
            p.setRun(this);
        }
    }

    public List<PotionsObtained> getPotionsObtainedList() {
        return potionsObtainedList;
    }

    public void setPotionsObtainedList(List<PotionsObtained> potionsObtainedList) {
        this.potionsObtainedList = potionsObtainedList;
        for (PotionsObtained p : this.potionsObtainedList) {
            p.setRun(this);
        }
    }

    public List<ItemsPurchased> getItemsPurchasedList() {
        return itemsPurchasedList;
    }

    public void setItemsPurchasedList(List<ItemsPurchased> itemsPurchasedList) {
        this.itemsPurchasedList = itemsPurchasedList;
    }

    public List<PathTaken> getPathTakenList() {
        return pathTakenList;
    }

    public void setPathTakenList(List<PathTaken> pathTakenList) {
        this.pathTakenList = pathTakenList;
        for (PathTaken p : this.pathTakenList) {
            p.setRun(this);
        }
    }

    public List<PathPerFloor> getPathPerFloorList() {
        return pathPerFloorList;
    }

    public void setPathPerFloorList(List<PathPerFloor> pathPerFloorList) {
        this.pathPerFloorList = pathPerFloorList;
        for (PathPerFloor p : this.pathPerFloorList) {
            p.setRun(this);
        }
    }

    public List<HpPerFloor> getHpPerFloorList() {
        return hpPerFloorList;
    }

    public void setHpPerFloorList(List<HpPerFloor> hpPerFloorList) {
        this.hpPerFloorList = hpPerFloorList;
    }

    public List<PotionsFloorSpawned> getPotionsFloorSpawnedList() {
        return potionsFloorSpawnedList;
    }

    public void setPotionsFloorSpawnedList(List<PotionsFloorSpawned> potionsFloorSpawnedList) {
        this.potionsFloorSpawnedList = potionsFloorSpawnedList;
        for (PotionsFloorSpawned p : this.potionsFloorSpawnedList) {
            p.setRun(this);
        }
    }

    public List<RelicsObtained> getRelicsObtainedList() {
        return relicsObtainedList;
    }

    public void setRelicsObtainedList(List<RelicsObtained> relicsObtainedList) {
        this.relicsObtainedList = relicsObtainedList;
        for (RelicsObtained r : this.relicsObtainedList) {
            r.setRun(this);
        }
    }

    public List<CardChoice> getCardChoiceList() {
        return cardChoiceList;
    }

    public void setCardChoiceList(List<CardChoice> cardChoiceList) {
        this.cardChoiceList = cardChoiceList;
        for (CardChoice c : this.cardChoiceList) {
            c.setRun(this);
        }
    }

    public List<BossRelic> getBossRelicList() {
        return bossRelicList;
    }

    public void setBossRelicList(List<BossRelic> bossRelicList) {
        this.bossRelicList = bossRelicList;
        for (BossRelic b : this.bossRelicList) {
            b.setRun(this);
        }
    }

    public List<ItemsPurged> getItemsPurgedList() {
        return itemsPurgedList;
    }

    public void setItemsPurgedList(List<ItemsPurged> itemsPurgedList) {
        this.itemsPurgedList = itemsPurgedList;
    }

    public List<GoldPerFloor> getGoldPerFloorList() {
        return goldPerFloorList;
    }

    public void setGoldPerFloorList(List<GoldPerFloor> goldPerFloorList) {
        this.goldPerFloorList = goldPerFloorList;
        for (GoldPerFloor g : this.goldPerFloorList) {
            g.setRun(this);
        }
    }

    public List<EventChoice> getEventChoiceList() {
        return eventChoiceList;
    }

    public void setEventChoiceList(List<EventChoice> eventChoiceList) {
        this.eventChoiceList = eventChoiceList;
        for (EventChoice e : this.eventChoiceList) {
            e.setRun(this);
        }
    }
}
