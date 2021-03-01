package com.example.model.deserialization;

import com.example.model.MasterDeck;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MasterDeckTypeAdapter extends TypeAdapter<List<MasterDeck>> {
    @Override
    public void write(JsonWriter out, List<MasterDeck> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<MasterDeck> read(JsonReader in) throws IOException {
        List<MasterDeck> result = new ArrayList<>();
        MasterDeck masterDeck;

        in.beginArray();
        while (in.hasNext()) {
            masterDeck = new MasterDeck();
            masterDeck.setCard(in.nextString());
            result.add(masterDeck);
        }
        in.endArray();

        return result;
    }
}
