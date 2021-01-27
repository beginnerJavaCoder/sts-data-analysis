package com.example.model.upgraded.deserialization;

import com.example.model.upgraded.GoldPerFloor;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GoldPerFloorTypeAdapter extends TypeAdapter<List<GoldPerFloor>> {
    @Override
    public void write(JsonWriter out, List<GoldPerFloor> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<GoldPerFloor> read(JsonReader in) throws IOException {
        List<GoldPerFloor> result = new ArrayList<>();
        GoldPerFloor goldPerFloor;
        int floor = 1;

        in.beginArray();
        while (in.hasNext()) {
            goldPerFloor = new GoldPerFloor();
            goldPerFloor.setFloor(floor++);
            goldPerFloor.setGold(in.nextInt());
            result.add(goldPerFloor);
        }
        in.endArray();

        return result;
    }
}
