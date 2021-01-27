package com.example.model.upgraded.deserialization;

import com.example.ConstUtil;
import com.example.model.upgraded.HpPerFloor;
import com.example.model.upgraded.ItemsPurged;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItemsPurgedTypeAdapter extends TypeAdapter<List<ItemsPurged>> {
    @Override
    public void write(JsonWriter out, List<ItemsPurged> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<ItemsPurged> read(JsonReader in) throws IOException {
        List<ItemsPurged> result;
        ItemsPurged itemsPurged;

        in.beginArray();
        if (ConstUtil.currentRun.getItemsPurgeds().isEmpty()) {
            result = new ArrayList<>();
            while (in.hasNext()) {
                itemsPurged = new ItemsPurged();
                itemsPurged.setItem(in.nextString());
                result.add(itemsPurged);
            }
            ConstUtil.currentRun.setItemsPurgeds(result);
        } else {
            result = ConstUtil.currentRun.getItemsPurgeds();
            int index = 0;
            while (in.hasNext()) {
                result.get(index).setItem(in.nextString());
                index++;
            }
        }
        in.endArray();

        return null;
    }
}
