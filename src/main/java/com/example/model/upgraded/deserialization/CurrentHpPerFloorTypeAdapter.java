package com.example.model.upgraded.deserialization;

import com.example.ConstUtil;
import com.example.model.upgraded.HpPerFloor;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CurrentHpPerFloorTypeAdapter extends TypeAdapter<List<HpPerFloor>> {
    @Override
    public void write(JsonWriter out, List<HpPerFloor> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<HpPerFloor> read(JsonReader in) throws IOException {
        List<HpPerFloor> result;
        HpPerFloor hpPerFloor;
        int index;

        in.beginArray();
        if (ConstUtil.currentRun.getHpPerFloors().isEmpty()) {
            result = new ArrayList<>();
            index = 1;
            while (in.hasNext()) {
                hpPerFloor = new HpPerFloor();
                hpPerFloor.setCurrentHp(in.nextInt());
                hpPerFloor.setFloor(index++);
                result.add(hpPerFloor);
            }
            ConstUtil.currentRun.setHpPerFloors(result);
        } else {
            result = ConstUtil.currentRun.getHpPerFloors();
            index = 0;
            while (in.hasNext()) {
                result.get(index).setCurrentHp(in.nextInt());
                index++;
            }
        }
        in.endArray();

        return null;
    }
}
