package com.example.model.upgraded.deserialization;

import com.example.model.upgraded.Relic;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RelicsTypeAdapter extends TypeAdapter<List<Relic>> {
    @Override
    public void write(JsonWriter out, List<Relic> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<Relic> read(JsonReader in) throws IOException {
        List<Relic> result = new ArrayList<>();
        Relic relic;

        in.beginArray();
        while (in.hasNext()) {
            relic = new Relic();
            relic.setRelic(in.nextString());
            result.add(relic);
        }
        in.endArray();

        return result;
    }
}
