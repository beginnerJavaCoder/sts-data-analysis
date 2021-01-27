package com.example.model.upgraded.deserialization;

import com.example.model.upgraded.*;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EventChoicesTypeAdapter extends TypeAdapter<List<EventChoice>> {
    @Override
    public void write(JsonWriter out, List<EventChoice> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<EventChoice> read(JsonReader in) throws IOException {
        List<EventChoice> result = new ArrayList<>();
        EventChoice eventChoice;
        boolean isKnowingScull;

        in.beginArray();
        while (in.hasNext()) {
            in.beginObject();
            eventChoice = new EventChoice();
            isKnowingScull = false;
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "damage_healed": {
                        eventChoice.setDamageHealed(in.nextInt());
                        break;
                    }
                    case "damage_taken": {
                        eventChoice.setDamageTaken(in.nextInt());
                        break;
                    }
                    case "gold_gain": {
                        eventChoice.setGoldGain(in.nextInt());
                        break;
                    }
                    case "gold_loss": {
                        eventChoice.setGoldLoss(in.nextInt());
                        break;
                    }
                    case "max_hp_gain": {
                        eventChoice.setMaxHpGain(in.nextInt());
                        break;
                    }
                    case "max_hp_loss": {
                        eventChoice.setMaxHpLoss(in.nextInt());
                        break;
                    }
                    case "event_name": {
                        String tmp = in.nextString();
                        if(tmp.equals("Knowing Skull")) isKnowingScull = true;
                        eventChoice.setEventName(tmp);
                        break;
                    }
                    case "player_choice": {
                        eventChoice.setPlayerChoice(in.nextString());
                        break;
                    }
                    case "floor": {
                        eventChoice.setFloor(in.nextInt());
                        break;
                    }
                    case "cards_removed": {
                        List<EventCardsRemoved> eventCardsRemoveds = new ArrayList<>();
                        EventCardsRemoved eventCardsRemoved;

                        in.beginArray();
                        while (in.hasNext()) {
                            eventCardsRemoved = new EventCardsRemoved();
                            eventCardsRemoved.setCard(in.nextString());
                            eventCardsRemoved.setEventChoice(eventChoice);
                            eventCardsRemoveds.add(eventCardsRemoved);
                        }
                        in.endArray();
                        eventChoice.setEventCardsRemoveds(eventCardsRemoveds);
                        break;
                    }
                    case "cards_transformed": {
                        List<EventCardsTransformed> eventCardsTransformeds = new ArrayList<>();
                        EventCardsTransformed eventCardsTransformed;

                        in.beginArray();
                        while (in.hasNext()) {
                            eventCardsTransformed = new EventCardsTransformed();
                            eventCardsTransformed.setCard(in.nextString());
                            eventCardsTransformed.setEventChoice(eventChoice);
                            eventCardsTransformeds.add(eventCardsTransformed);
                        }
                        in.endArray();
                        eventChoice.setEventCardsTransformeds(eventCardsTransformeds);
                        break;
                    }
                    case "cards_obtained": {
                        List<EventCardsObtained> eventCardsObtaineds = new ArrayList<>();
                        EventCardsObtained eventCardsObtained;

                        in.beginArray();
                        while (in.hasNext()) {
                            eventCardsObtained = new EventCardsObtained();
                            eventCardsObtained.setCard(in.nextString());
                            eventCardsObtained.setEventChoice(eventChoice);
                            eventCardsObtaineds.add(eventCardsObtained);
                        }
                        in.endArray();
                        eventChoice.setEventCardsObtaineds(eventCardsObtaineds);
                        break;
                    }
                    case "cards_upgraded": {
                        List<EventCardsUpgraded> eventCardsUpgradeds = new ArrayList<>();
                        EventCardsUpgraded eventCardsUpgraded;

                        in.beginArray();
                        while (in.hasNext()) {
                            eventCardsUpgraded = new EventCardsUpgraded();
                            eventCardsUpgraded.setCard(in.nextString());
                            eventCardsUpgraded.setEventChoice(eventChoice);
                            eventCardsUpgradeds.add(eventCardsUpgraded);
                        }
                        in.endArray();
                        eventChoice.setEventCardsUpgradeds(eventCardsUpgradeds);
                        break;
                    }
                    case "relics_obtained": {
                        List<EventRelicsObtained> eventRelicsObtaineds = new ArrayList<>();
                        EventRelicsObtained eventRelicsObtained;

                        in.beginArray();
                        while (in.hasNext()) {
                            eventRelicsObtained = new EventRelicsObtained();
                            eventRelicsObtained.setRelic(in.nextString());
                            eventRelicsObtained.setEventChoice(eventChoice);
                            eventRelicsObtaineds.add(eventRelicsObtained);
                        }
                        in.endArray();
                        eventChoice.setEventRelicsObtaineds(eventRelicsObtaineds);
                        break;
                    }
                    case "relics_lost": {
                        List<EventRelicsLost> eventRelicsLosts = new ArrayList<>();
                        EventRelicsLost eventRelicsLost;

                        in.beginArray();
                        while (in.hasNext()) {
                            eventRelicsLost = new EventRelicsLost();
                            eventRelicsLost.setRelic(in.nextString());
                            eventRelicsLost.setEventChoice(eventChoice);
                            eventRelicsLosts.add(eventRelicsLost);
                        }
                        in.endArray();
                        eventChoice.setEventRelicsLosts(eventRelicsLosts);
                        break;
                    }
                    case "potions_obtained": {
                        List<EventPotionsObtained> eventPotionsObtaineds = new ArrayList<>();
                        EventPotionsObtained eventPotionsObtained;

                        in.beginArray();
                        while (in.hasNext()) {
                            eventPotionsObtained = new EventPotionsObtained();
                            eventPotionsObtained.setPotion(in.nextString());
                            eventPotionsObtained.setEventChoice(eventChoice);
                            eventPotionsObtaineds.add(eventPotionsObtained);
                        }
                        in.endArray();
                        eventChoice.setEventPotionsObtaineds(eventPotionsObtaineds);
                        break;
                    }
                }
            }
            if(isKnowingScull) correctPlayerChoice(eventChoice);
            result.add(eventChoice);
            in.endObject();
        }
        in.endArray();

        return result;
    }

    private void correctPlayerChoice(EventChoice eventChoice) {
        String currentPlayerChoice = eventChoice.getPlayerChoice();
        if(currentPlayerChoice.equals("")) return;
        String[] choices = currentPlayerChoice.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int goldCount = 0;
        int cardCount = 0;
        int potionCount = 0;
        final String gold = "GOLD";
        final String card = "CARD";
        final String potion = "POTION";
        for (String choice : choices) {
            switch (choice) {
                case gold: {
                    goldCount++;
                    break;
                }
                case card: {
                    cardCount++;
                    break;
                }
                case potion: {
                    potionCount++;
                    break;
                }
            }
        }
        if(goldCount > 0) stringBuilder.append(gold).append(" ").append(goldCount).append(" ");
        if(cardCount > 0) stringBuilder.append(card).append(" ").append(cardCount).append(" ");
        if(potionCount > 0) stringBuilder.append(potion).append(" ").append(potionCount);

        eventChoice.setPlayerChoice(stringBuilder.toString());
    }
}
