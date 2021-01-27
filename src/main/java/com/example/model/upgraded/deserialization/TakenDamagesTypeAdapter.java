package com.example.model.upgraded.deserialization;

import com.example.model.upgraded.TakenDamage;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TakenDamagesTypeAdapter extends TypeAdapter<List<TakenDamage>> {
    @Override
    public void write(JsonWriter out, List<TakenDamage> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<TakenDamage> read(JsonReader in) throws IOException {
        List<TakenDamage> result = new ArrayList<>();
        TakenDamage takenDamage;

        in.beginArray();
        while (in.hasNext()) {
            in.beginObject();
            takenDamage = new TakenDamage();
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "damage": {
                        takenDamage.setDamage(in.nextInt());
                        break;
                    }
                    case "enemies": {
                        takenDamage.setEnemies(in.nextString());
                        break;
                    }
                    case "floor": {
                        takenDamage.setFloor(in.nextInt());
                        break;
                    }
                    case "turns": {
                        takenDamage.setTurns(in.nextInt());
                        break;
                    }
                }
            }
            result.add(takenDamage);
            in.endObject();
        }
        in.endArray();

        return result;
    }
}
