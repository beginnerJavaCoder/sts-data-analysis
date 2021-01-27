package com.example.model.upgraded;

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
    @Column(name = "is_trial")
    private Boolean isTrial;
    @Column(name = "chosen_character")
    private String chosenCharacter;
    @Column(name = "campfire_rested")
    private Integer campfireRested;
    private Integer gold;
    @Column(name = "neow_bonus")
    private String neowBonus;
    @Column(name = "is_prod")
    private Boolean isProd;
    @Column(name = "is_daily")
    private Boolean isDaily;
    @Column(name = "chose_seed")
    private Boolean choseSeed;
    @Column(name = "campfire_upgraded")
    private Integer campfireUpgraded;
    @Column(name = "win_rate")
    private Double winRate;
    @Column(name = "build_version")
    private String buildVersion;
    @Column(name = "purchased_purges")
    private Integer purchasedPurges;
    private Boolean victory;
    @Column(name = "player_experience")
    private Integer playerExperience;
    @Column(name = "is_endless")
    private Boolean isEndless;
    @Column(name = "ascension_level")
    private Integer ascensionLevel;

    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CampfireChoice> campfireChoices;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MasterDeck> masterDecks;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Relic> relics;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TakenDamage> takenDamages;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PotionsUsageFloor> potionsUsageFloors;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PotionsObtained> potionsObtaineds;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemsPurchased> itemsPurchaseds;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PathTaken> pathTakens;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PathPerFloor> pathPerFloors;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HpPerFloor> hpPerFloors;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PotionsFloorSpawned> potionsFloorSpawneds;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RelicsObtained> relicsObtaineds;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CardChoice> cardChoices;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BossRelic> bossRelics;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemsPurged> itemsPurgeds;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GoldPerFloor> goldPerFloors;
    @OneToMany(mappedBy = "run", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EventChoice> eventChoices;

    public Run() {
        campfireChoices = new ArrayList<>();
        masterDecks = new ArrayList<>();
        relics = new ArrayList<>();
        takenDamages = new ArrayList<>();
        potionsUsageFloors = new ArrayList<>();
        potionsObtaineds = new ArrayList<>();
        itemsPurchaseds = new ArrayList<>();
        pathTakens = new ArrayList<>();
        pathPerFloors = new ArrayList<>();
        hpPerFloors = new ArrayList<>();
        potionsFloorSpawneds = new ArrayList<>();
        relicsObtaineds = new ArrayList<>();
        cardChoices = new ArrayList<>();
        bossRelics = new ArrayList<>();
        itemsPurgeds = new ArrayList<>();
        goldPerFloors = new ArrayList<>();
        eventChoices = new ArrayList<>();
    }

    public void addCampfireChoice(CampfireChoice campfireChoice) {
        campfireChoices.add(campfireChoice);
        campfireChoice.setRun(this);
    }

    public void removeCampfireChoice(CampfireChoice campfireChoice) {
        campfireChoices.remove(campfireChoice);
        campfireChoice.setRun(null);
    }

    public void addMasterDeck(MasterDeck masterDeck) {
        masterDecks.add(masterDeck);
        masterDeck.setRun(this);
    }

    public void removeMasterDeck(MasterDeck masterDeck) {
        masterDecks.remove(masterDeck);
        masterDeck.setRun(null);
    }

    public void addRelic(Relic relic) {
        relics.add(relic);
        relic.setRun(this);
    }

    public void removeRelic(Relic relic) {
        relics.remove(relic);
        relic.setRun(null);
    }

    public void addTakenDamage(TakenDamage takenDamage) {
        takenDamages.add(takenDamage);
        takenDamage.setRun(this);
    }

    public void removeTakenDamage(TakenDamage takenDamage) {
        takenDamages.remove(takenDamage);
        takenDamage.setRun(null);
    }

    public void addPotionsUsageFloor(PotionsUsageFloor potionsUsageFloor) {
        potionsUsageFloors.add(potionsUsageFloor);
        potionsUsageFloor.setRun(this);
    }

    public void removePotionsUsageFloor(PotionsUsageFloor potionsUsageFloor) {
        potionsUsageFloors.remove(potionsUsageFloor);
        potionsUsageFloor.setRun(null);
    }

    public void addPotionsObtained(PotionsObtained potionsObtained) {
        potionsObtaineds.add(potionsObtained);
        potionsObtained.setRun(this);
    }

    public void removePotionsObtained(PotionsObtained potionsObtained) {
        potionsObtaineds.remove(potionsObtained);
        potionsObtained.setRun(null);
    }

    public void addItemsPurchased(ItemsPurchased itemsPurchased) {
        itemsPurchaseds.add(itemsPurchased);
        itemsPurchased.setRun(this);
    }

    public void removeItemsPurchased(ItemsPurchased itemsPurchased) {
        itemsPurchaseds.remove(itemsPurchased);
        itemsPurchased.setRun(null);
    }

    public void addPathTaken(PathTaken pathTaken) {
        pathTakens.add(pathTaken);
        pathTaken.setRun(this);
    }

    public void removePathTaken(PathTaken pathTaken) {
        pathTakens.remove(pathTaken);
        pathTaken.setRun(null);
    }

    public void addPathPerFloor(PathPerFloor pathPerFloor) {
        pathPerFloors.add(pathPerFloor);
        pathPerFloor.setRun(this);
    }

    public void removePathPerFloor(PathPerFloor pathPerFloor) {
        pathPerFloors.remove(pathPerFloor);
        pathPerFloor.setRun(null);
    }

    public void addHpPerFloor(HpPerFloor hpPerFloor) {
        hpPerFloors.add(hpPerFloor);
        hpPerFloor.setRun(this);
    }

    public void removeHpPerFloor(HpPerFloor hpPerFloor) {
        hpPerFloors.remove(hpPerFloor);
        hpPerFloor.setRun(null);
    }

    public void addPotionsFloorSpawned(PotionsFloorSpawned potionsFloorSpawned) {
        potionsFloorSpawneds.add(potionsFloorSpawned);
        potionsFloorSpawned.setRun(this);
    }

    public void removePotionsFloorSpawned(PotionsFloorSpawned potionsFloorSpawned) {
        potionsFloorSpawneds.remove(potionsFloorSpawned);
        potionsFloorSpawned.setRun(null);
    }

    public void addRelicsObtained(RelicsObtained relicsObtained) {
        relicsObtaineds.add(relicsObtained);
        relicsObtained.setRun(this);
    }

    public void removeRelicsObtained(RelicsObtained relicsObtained) {
        relicsObtaineds.remove(relicsObtained);
        relicsObtained.setRun(null);
    }

    public void addCardChoice(CardChoice cardChoice) {
        cardChoices.add(cardChoice);
        cardChoice.setRun(this);
    }

    public void removeCardChoice(CardChoice cardChoice) {
        cardChoices.remove(cardChoice);
        cardChoice.setRun(null);
    }

    public void addBossRelic(BossRelic bossRelic) {
        bossRelics.add(bossRelic);
        bossRelic.setRun(this);
    }

    public void removeBossRelic(BossRelic bossRelic) {
        bossRelics.remove(bossRelic);
        bossRelic.setRun(null);
    }

    public void addItemsPurged(ItemsPurged itemsPurged) {
        itemsPurgeds.add(itemsPurged);
        itemsPurged.setRun(this);
    }

    public void removeItemsPurged(ItemsPurged itemsPurged) {
        itemsPurgeds.remove(itemsPurged);
        itemsPurged.setRun(null);
    }

    public void addGoldPerFloor(GoldPerFloor goldPerFloor) {
        goldPerFloors.add(goldPerFloor);
        goldPerFloor.setRun(this);
    }

    public void removeGoldPerFloor(GoldPerFloor goldPerFloor) {
        goldPerFloors.remove(goldPerFloor);
        goldPerFloor.setRun(null);
    }

    public void addEventChoice(EventChoice eventChoice) {
        eventChoices.add(eventChoice);
        eventChoice.setRun(this);
    }

    public void removeEventChoice(EventChoice eventChoice) {
        eventChoices.remove(eventChoice);
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

    public Boolean getTrial() {
        return isTrial;
    }

    public void setTrial(Boolean trial) {
        isTrial = trial;
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

    public Boolean getProd() {
        return isProd;
    }

    public void setProd(Boolean prod) {
        isProd = prod;
    }

    public Boolean getDaily() {
        return isDaily;
    }

    public void setDaily(Boolean daily) {
        isDaily = daily;
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

    public Double getWinRate() {
        return winRate;
    }

    public void setWinRate(Double winRate) {
        this.winRate = winRate;
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

    public Boolean getEndless() {
        return isEndless;
    }

    public void setEndless(Boolean endless) {
        isEndless = endless;
    }

    public Integer getAscensionLevel() {
        return ascensionLevel;
    }

    public void setAscensionLevel(Integer ascensionLevel) {
        this.ascensionLevel = ascensionLevel;
    }

    public List<CampfireChoice> getCampfireChoices() {
        return campfireChoices;
    }

    public void setCampfireChoices(List<CampfireChoice> campfireChoices) {
        this.campfireChoices = campfireChoices;
        for (CampfireChoice c : this.campfireChoices) {
            c.setRun(this);
        }
    }

    public List<MasterDeck> getMasterDecks() {
        return masterDecks;
    }

    public void setMasterDecks(List<MasterDeck> masterDecks) {
        this.masterDecks = masterDecks;
        for (MasterDeck m : this.masterDecks) {
            m.setRun(this);
        }
    }

    public List<Relic> getRelics() {
        return relics;
    }

    public void setRelics(List<Relic> relics) {
        this.relics = relics;
        for (Relic r : this.relics) {
            r.setRun(this);
        }
    }

    public List<TakenDamage> getTakenDamages() {
        return takenDamages;
    }

    public void setTakenDamages(List<TakenDamage> takenDamages) {
        this.takenDamages = takenDamages;
        for (TakenDamage t : this.takenDamages) {
            t.setRun(this);
        }
    }

    public List<PotionsUsageFloor> getPotionsUsageFloors() {
        return potionsUsageFloors;
    }

    public void setPotionsUsageFloors(List<PotionsUsageFloor> potionsUsageFloors) {
        this.potionsUsageFloors = potionsUsageFloors;
        for (PotionsUsageFloor p : this.potionsUsageFloors) {
            p.setRun(this);
        }
    }

    public List<PotionsObtained> getPotionsObtaineds() {
        return potionsObtaineds;
    }

    public void setPotionsObtaineds(List<PotionsObtained> potionsObtaineds) {
        this.potionsObtaineds = potionsObtaineds;
        for (PotionsObtained p : this.potionsObtaineds) {
            p.setRun(this);
        }
    }

    public List<ItemsPurchased> getItemsPurchaseds() {
        return itemsPurchaseds;
    }

    public void setItemsPurchaseds(List<ItemsPurchased> itemsPurchaseds) {
        this.itemsPurchaseds = itemsPurchaseds;
    }

    public List<PathTaken> getPathTakens() {
        return pathTakens;
    }

    public void setPathTakens(List<PathTaken> pathTakens) {
        this.pathTakens = pathTakens;
        for (PathTaken p : this.pathTakens) {
            p.setRun(this);
        }
    }

    public List<PathPerFloor> getPathPerFloors() {
        return pathPerFloors;
    }

    public void setPathPerFloors(List<PathPerFloor> pathPerFloors) {
        this.pathPerFloors = pathPerFloors;
        for (PathPerFloor p : this.pathPerFloors) {
            p.setRun(this);
        }
    }

    public List<HpPerFloor> getHpPerFloors() {
        return hpPerFloors;
    }

    public void setHpPerFloors(List<HpPerFloor> hpPerFloors) {
        this.hpPerFloors = hpPerFloors;
    }

    public List<PotionsFloorSpawned> getPotionsFloorSpawneds() {
        return potionsFloorSpawneds;
    }

    public void setPotionsFloorSpawneds(List<PotionsFloorSpawned> potionsFloorSpawneds) {
        this.potionsFloorSpawneds = potionsFloorSpawneds;
        for (PotionsFloorSpawned p : this.potionsFloorSpawneds) {
            p.setRun(this);
        }
    }

    public List<RelicsObtained> getRelicsObtaineds() {
        return relicsObtaineds;
    }

    public void setRelicsObtaineds(List<RelicsObtained> relicsObtaineds) {
        this.relicsObtaineds = relicsObtaineds;
        for (RelicsObtained r : this.relicsObtaineds) {
            r.setRun(this);
        }
    }

    public List<CardChoice> getCardChoices() {
        return cardChoices;
    }

    public void setCardChoices(List<CardChoice> cardChoices) {
        this.cardChoices = cardChoices;
        for (CardChoice c : this.cardChoices) {
            c.setRun(this);
        }
    }

    public List<BossRelic> getBossRelics() {
        return bossRelics;
    }

    public void setBossRelics(List<BossRelic> bossRelics) {
        this.bossRelics = bossRelics;
        for (BossRelic b : this.bossRelics) {
            b.setRun(this);
        }
    }

    public List<ItemsPurged> getItemsPurgeds() {
        return itemsPurgeds;
    }

    public void setItemsPurgeds(List<ItemsPurged> itemsPurgeds) {
        this.itemsPurgeds = itemsPurgeds;
    }

    public List<GoldPerFloor> getGoldPerFloors() {
        return goldPerFloors;
    }

    public void setGoldPerFloors(List<GoldPerFloor> goldPerFloors) {
        this.goldPerFloors = goldPerFloors;
        for (GoldPerFloor g : this.goldPerFloors) {
            g.setRun(this);
        }
    }

    public List<EventChoice> getEventChoices() {
        return eventChoices;
    }

    public void setEventChoices(List<EventChoice> eventChoices) {
        this.eventChoices = eventChoices;
        for (EventChoice e : this.eventChoices) {
            e.setRun(this);
        }
    }
}
