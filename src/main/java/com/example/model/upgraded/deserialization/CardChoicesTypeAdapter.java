package com.example.model.upgraded.deserialization;

import com.example.model.upgraded.CardChoice;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CardChoicesTypeAdapter extends TypeAdapter<List<CardChoice>> {
    @Override
    public void write(JsonWriter out, List<CardChoice> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<CardChoice> read(JsonReader in) throws IOException {
        List<CardChoice> result = new ArrayList<>();
        CardChoice cardChoice;
        int pointer = 0;
        int currentIndex = 0;
        int floor;

        in.beginArray();
        while (in.hasNext()) {
            in.beginObject();
            floor = 0;
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "not_picked": {
                        in.beginArray();
                        while (in.hasNext()) {
                            cardChoice = new CardChoice();
                            cardChoice.setCard(in.nextString());
                            cardChoice.setPicked(false);
                            result.add(cardChoice);
                            currentIndex++;
                        }
                        in.endArray();
                        break;
                    }
                    case "picked": {
                        cardChoice = new CardChoice();
                        cardChoice.setCard(in.nextString());
                        cardChoice.setPicked(true);
                        result.add(cardChoice);
                        currentIndex++;
                        break;
                    }
                    case "floor": {
                        floor = in.nextInt();
                        break;
                    }
                }
            }

            for (int i = pointer; i < currentIndex; i++) {
                result.get(i).setFloor(floor);
            }
            pointer = currentIndex;
            in.endObject();
        }
        in.endArray();

        return result;
    }
}
