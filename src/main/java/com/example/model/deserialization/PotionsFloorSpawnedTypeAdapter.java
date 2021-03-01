package com.example.model.deserialization;

import com.example.model.PotionsFloorSpawned;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PotionsFloorSpawnedTypeAdapter extends TypeAdapter<List<PotionsFloorSpawned>> {
    @Override
    public void write(JsonWriter out, List<PotionsFloorSpawned> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<PotionsFloorSpawned> read(JsonReader in) throws IOException {
        List<PotionsFloorSpawned> result = new ArrayList<>();
        PotionsFloorSpawned potionsFloorSpawned;

        in.beginArray();
        while (in.hasNext()) {
            potionsFloorSpawned = new PotionsFloorSpawned();
            potionsFloorSpawned.setFloor(in.nextInt());
            result.add(potionsFloorSpawned);
        }
        in.endArray();

        return result;
    }
}
