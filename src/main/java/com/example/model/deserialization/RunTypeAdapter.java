package com.example.model.deserialization;

import com.example.util.ConstUtil;
import com.example.model.HpPerFloor;
import com.example.model.ItemsPurchased;
import com.example.model.ItemsPurged;
import com.example.model.Run;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.sql.Timestamp;

public class RunTypeAdapter extends TypeAdapter<Run> {
    @Override
    public void write(JsonWriter out, Run value) throws IOException {
        // I don't need you!
    }

    @Override
    public Run read(JsonReader in) throws IOException {
        Run run = new Run();
        ConstUtil.currentRun = run;

        in.beginObject();
        in.nextName();
        in.beginObject();

        while (in.hasNext()) {
            switch (in.nextName()) {
                case "floor_reached": {
                    run.setFloorReached(in.nextInt());
                    break;
                }
                case "playtime": {
                    run.setPlaytime(in.nextInt());
                    break;
                }
                case "score": {
                    run.setScore(in.nextInt());
                    break;
                }
                case "local_time": {
                    run.setLocalTime(toTimestamp(in.nextString()));
                    break;
                }
                case "is_ascension_mode": {
                    run.setAscensionMode(in.nextBoolean());
                    break;
                }
                case "neow_cost": {
                    run.setNeowCost(in.nextString());
                    break;
                }
                case "circlet_count": {
                    run.setCircletCount(in.nextInt());
                    break;
                }
                case "is_trial": {
                    run.setTrial(in.nextBoolean());
                    break;
                }
                case "character_chosen": {
                    run.setChosenCharacter(in.nextString());
                    break;
                }
                case "campfire_rested": {
                    run.setCampfireRested(in.nextInt());
                    break;
                }
                case "gold": {
                    run.setGold(in.nextInt());
                    break;
                }
                case "neow_bonus": {
                    run.setNeowBonus(in.nextString());
                    break;
                }
                case "is_prod": {
                    run.setProd(in.nextBoolean());
                    break;
                }
                case "is_daily": {
                    run.setDaily(in.nextBoolean());
                    break;
                }
                case "chose_seed": {
                    run.setChoseSeed(in.nextBoolean());
                    break;
                }
                case "campfire_upgraded": {
                    run.setCampfireUpgraded(in.nextInt());
                    break;
                }
                case "win_rate": {
                    run.setWinRate(in.nextDouble());
                    break;
                }
                case "build_version": {
                    run.setBuildVersion(in.nextString());
                    break;
                }
                case "purchased_purges": {
                    run.setPurchasedPurges(in.nextInt());
                    break;
                }
                case "victory": {
                    run.setVictory(in.nextBoolean());
                    break;
                }
                case "player_experience": {
                    run.setPlayerExperience(in.nextInt());
                    break;
                }
                case "is_endless": {
                    run.setEndless(in.nextBoolean());
                    break;
                }
                case "ascension_level": {
                    run.setAscensionLevel(in.nextInt());
                    break;
                }
                case "campfire_choices": {
                    run.setCampfireChoiceList(ConstUtil.GSON.getAdapter(ConstUtil.CAMPFIRE_CHOICES_TYPE_TOKEN).read(in));
                    break;
                }
                case "master_deck": {
                    run.setMasterDeckList(ConstUtil.GSON.getAdapter(ConstUtil.MASTER_DECKS_TYPE_TOKEN).read(in));
                    break;
                }
                case "relics": {
                    run.setRelicList(ConstUtil.GSON.getAdapter(ConstUtil.RELICS_TYPE_TOKEN).read(in));
                    break;
                }
                case "damage_taken": {
                    run.setTakenDamageList(ConstUtil.GSON.getAdapter(ConstUtil.TAKEN_DAMAGES_TYPE_TOKEN).read(in));
                    break;
                }
                case "potions_floor_usage": {
                    run.setPotionsUsageFloorList(ConstUtil.GSON.getAdapter(ConstUtil.POTIONS_USAGE_FLOORS_TYPE_TOKEN).read(in));
                    break;
                }
                case "potions_obtained": {
                    run.setPotionsObtainedList(ConstUtil.GSON.getAdapter(ConstUtil.POTIONS_OBTAINED_TYPE_TOKEN).read(in));
                    break;
                }
                case "items_purchased": {
                    ConstUtil.GSON.getAdapter(ConstUtil.ITEMS_PURCHASED_TYPE_TOKEN).read(in);
                    break;
                }
                case "item_purchase_floors": {
                    ConstUtil.GSON.getAdapter(ConstUtil.ITEMS_PURCHASED_FLOORS_TYPE_TOKEN).read(in);
                    break;
                }
                case "path_taken": {
                    run.setPathTakenList(ConstUtil.GSON.getAdapter(ConstUtil.TAKEN_PATHS_TYPE_TOKEN).read(in));
                    break;
                }
                case "path_per_floor": {
                    run.setPathPerFloorList(ConstUtil.GSON.getAdapter(ConstUtil.PATH_PER_FLOORS_TYPE_TOKEN).read(in));
                    break;
                }
                case "current_hp_per_floor": {
                    ConstUtil.GSON.getAdapter(ConstUtil.CURRENT_HP_PER_FLOOR_TYPE_TOKEN).read(in);
                    break;
                }
                case "max_hp_per_floor": {
                    ConstUtil.GSON.getAdapter(ConstUtil.MAX_HP_PER_FLOOR_TYPE_TOKEN).read(in);
                    break;
                }
                case "potions_floor_spawned": {
                    run.setPotionsFloorSpawnedList(ConstUtil.GSON.getAdapter(ConstUtil.POTIONS_FLOOR_SPAWNED_TYPE_TOKEN).read(in));
                    break;
                }
                case "relics_obtained": {
                    run.setRelicsObtainedList(ConstUtil.GSON.getAdapter(ConstUtil.RELICS_OBTAINED_TYPE_TOKEN).read(in));
                    break;
                }
                case "card_choices": {
                    run.setCardChoiceList(ConstUtil.GSON.getAdapter(ConstUtil.CARD_CHOICES_TYPE_TOKEN).read(in));
                    break;
                }
                case "boss_relics": {
                    run.setBossRelicList(ConstUtil.GSON.getAdapter(ConstUtil.BOSS_RELICS_TYPE_TOKEN).read(in));
                    break;
                }
                case "items_purged": {
                    ConstUtil.GSON.getAdapter(ConstUtil.ITEMS_PURGED_TYPE_TOKEN).read(in);
                    break;
                }
                case "items_purged_floors": {
                    ConstUtil.GSON.getAdapter(ConstUtil.ITEMS_PURGED_FLOORS_TYPE_TOKEN).read(in);
                    break;
                }
                case "gold_per_floor": {
                    run.setGoldPerFloorList(ConstUtil.GSON.getAdapter(ConstUtil.GOLD_PER_FLOOR_TYPE_TOKEN).read(in));
                    break;
                }
                case "event_choices": {
                    run.setEventChoiceList(ConstUtil.GSON.getAdapter(ConstUtil.EVENT_CHOICES_TYPE_TOKEN).read(in));
                    break;
                }
                default: {
                    in.skipValue();
                    break;
                }
            }
        }
        in.endObject();
        in.endObject();

        initEntitiesRelationships(run);

        return run;
    }

    private static Timestamp toTimestamp(String date) {
        return Timestamp.valueOf(toCorrectDate(date));
    }

    private static String toCorrectDate(String invalid) {
        StringBuilder sb = new StringBuilder(invalid.substring(0, 4));
        sb.append("-");
        sb.append(invalid.substring(4, 6));
        sb.append("-");
        sb.append(invalid.substring(6, 8));
        sb.append(" ");
        sb.append(invalid.substring(8, 10));
        sb.append(":");
        sb.append(invalid.substring(10, 12));
        sb.append(":");
        sb.append(invalid.substring(12, 14));

        return sb.toString();
    }

    private static void initEntitiesRelationships(Run run) {
        for (ItemsPurchased i : run.getItemsPurchasedList()) {
            i.setRun(run);
        }
        for (HpPerFloor h : run.getHpPerFloorList()) {
            h.setRun(run);
        }
        for (ItemsPurged i : run.getItemsPurgedList()) {
            i.setRun(run);
        }
    }
}
