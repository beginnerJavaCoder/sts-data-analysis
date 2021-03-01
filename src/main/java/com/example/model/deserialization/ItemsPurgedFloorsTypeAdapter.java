package com.example.model.deserialization;

import com.example.util.ConstUtil;
import com.example.model.ItemsPurged;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItemsPurgedFloorsTypeAdapter extends TypeAdapter<List<ItemsPurged>> {
    @Override
    public void write(JsonWriter out, List<ItemsPurged> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<ItemsPurged> read(JsonReader in) throws IOException {
        List<ItemsPurged> result;
        ItemsPurged itemsPurged;

        in.beginArray();
        if (ConstUtil.currentRun.getItemsPurgedList().isEmpty()) {
            result = new ArrayList<>();
            while (in.hasNext()) {
                itemsPurged = new ItemsPurged();
                itemsPurged.setFloor(in.nextInt());
                result.add(itemsPurged);
            }
            ConstUtil.currentRun.setItemsPurgedList(result);
        } else {
            result = ConstUtil.currentRun.getItemsPurgedList();
            int index = 0;
            while (in.hasNext()) {
                result.get(index).setFloor(in.nextInt());
                index++;
            }
        }
        in.endArray();

        return null;
    }
}
