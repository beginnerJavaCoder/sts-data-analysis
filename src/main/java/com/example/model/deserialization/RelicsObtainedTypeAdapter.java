package com.example.model.deserialization;

import com.example.model.RelicsObtained;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RelicsObtainedTypeAdapter extends TypeAdapter<List<RelicsObtained>> {
    @Override
    public void write(JsonWriter out, List<RelicsObtained> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<RelicsObtained> read(JsonReader in) throws IOException {
        List<RelicsObtained> result = new ArrayList<>();
        RelicsObtained relicsObtained;

        in.beginArray();
        while (in.hasNext()) {
            in.beginObject();
            relicsObtained = new RelicsObtained();
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "floor": {
                        relicsObtained.setFloor(in.nextInt());
                        break;
                    }
                    case "key": {
                        relicsObtained.setRelic(in.nextString());
                        break;
                    }
                }
            }
            result.add(relicsObtained);
            in.endObject();
        }
        in.endArray();

        return result;
    }
}
