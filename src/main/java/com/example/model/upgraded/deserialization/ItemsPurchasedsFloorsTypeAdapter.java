package com.example.model.upgraded.deserialization;

import com.example.ConstUtil;
import com.example.model.upgraded.ItemsPurchased;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItemsPurchasedsFloorsTypeAdapter extends TypeAdapter<List<ItemsPurchased>> {
    @Override
    public void write(JsonWriter out, List<ItemsPurchased> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<ItemsPurchased> read(JsonReader in) throws IOException {
        List<ItemsPurchased> result;
        ItemsPurchased itemsPurchased;

        in.beginArray();
        if (ConstUtil.currentRun.getItemsPurchaseds().isEmpty()) {
            result = new ArrayList<>();
            while (in.hasNext()) {
                itemsPurchased = new ItemsPurchased();
                itemsPurchased.setFloor(in.nextInt());
                result.add(itemsPurchased);
            }
            ConstUtil.currentRun.setItemsPurchaseds(result);
        } else {
            result = ConstUtil.currentRun.getItemsPurchaseds();
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
