package com.example;

import com.example.model.upgraded.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class ConstUtil {
    public static Gson GSON;
    public static Run currentRun;
    public static final TypeToken<List<CampfireChoice>> CAMPFIRE_CHOICES_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<MasterDeck>> MASTER_DECKS_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<Relic>> RELICS_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<TakenDamage>> TAKEN_DAMAGES_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<PotionsUsageFloor>> POTIONS_USAGE_FLOORS_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<PotionsObtained>> POTIONS_OBTAINEDS_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<ItemsPurchased>> ITEMS_PURCHASEDS_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<ArrayList<ItemsPurchased>> ITEMS_PURCHASEDS_FLOORS_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<PathTaken>> TAKEN_PATHS_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<PathPerFloor>> PATH_PER_FLOORS_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<HpPerFloor>> CURRENT_HP_PER_FLOOR_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<ArrayList<HpPerFloor>> MAX_HP_PER_FLOOR_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<PotionsFloorSpawned>> POTIONS_FLOOR_SPAWNED_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<RelicsObtained>> RELICS_OBTAINED_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<CardChoice>> CARD_CHOICES_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<BossRelic>> BOSS_RELICS_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<ItemsPurged>> ITEMS_PURGED_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<ArrayList<ItemsPurged>> ITEMS_PURGED_FLOORS_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<GoldPerFloor>> GOLD_PER_FLOOR_TYPE_TOKEN = new TypeToken<>(){};
    public static final TypeToken<List<EventChoice>> EVENT_CHOICES_TYPE_TOKEN = new TypeToken<>(){};
}
