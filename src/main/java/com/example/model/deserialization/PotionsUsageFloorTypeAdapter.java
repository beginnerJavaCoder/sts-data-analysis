package com.example.model.deserialization;

import com.example.model.PotionsUsageFloor;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PotionsUsageFloorTypeAdapter extends TypeAdapter<List<PotionsUsageFloor>> {
    @Override
    public void write(JsonWriter out, List<PotionsUsageFloor> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<PotionsUsageFloor> read(JsonReader in) throws IOException {
        List<PotionsUsageFloor> result = new ArrayList<>();
        PotionsUsageFloor potionsUsageFloor;

        in.beginArray();
        while (in.hasNext()) {
            potionsUsageFloor = new PotionsUsageFloor();
            potionsUsageFloor.setFloor(in.nextInt());
            result.add(potionsUsageFloor);
        }
        in.endArray();

        return result;
    }
}
