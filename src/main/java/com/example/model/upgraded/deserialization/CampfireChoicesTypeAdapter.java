package com.example.model.upgraded.deserialization;

import com.example.model.upgraded.CampfireChoice;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CampfireChoicesTypeAdapter extends TypeAdapter<List<CampfireChoice>> {
    @Override
    public void write(JsonWriter out, List<CampfireChoice> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<CampfireChoice> read(JsonReader in) throws IOException {
        List<CampfireChoice> result = new ArrayList<>();
        CampfireChoice campfireChoice;

        in.beginArray();
        while (in.hasNext()) {
            in.beginObject();
            campfireChoice = new CampfireChoice();
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "data": {
                        campfireChoice.setData(in.nextString());
                        break;
                    }
                    case "floor": {
                        campfireChoice.setFloor(in.nextInt());
                        break;
                    }
                    case "key": {
                        campfireChoice.setChoice(in.nextString());
                        break;
                    }
                }
            }
            result.add(campfireChoice);
            in.endObject();
        }
        in.endArray();

        return result;
    }
}
