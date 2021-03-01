package com.example.model.deserialization;

import com.example.model.PotionsObtained;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PotionsObtainedTypeAdapter extends TypeAdapter<List<PotionsObtained>> {
    @Override
    public void write(JsonWriter out, List<PotionsObtained> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<PotionsObtained> read(JsonReader in) throws IOException {
        List<PotionsObtained> result = new ArrayList<>();
        PotionsObtained potionsObtained;

        in.beginArray();
        while (in.hasNext()) {
            in.beginObject();
            potionsObtained = new PotionsObtained();
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "floor": {
                        potionsObtained.setFloor(in.nextInt());
                        break;
                    }
                    case "key": {
                        potionsObtained.setPotion(in.nextString());
                        break;
                    }
                }
            }
            result.add(potionsObtained);
            in.endObject();
        }
        in.endArray();

        return result;
    }
}
