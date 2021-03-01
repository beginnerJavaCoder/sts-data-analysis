package com.example.model.deserialization;

import com.example.model.PathTaken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TakenPathTypeAdapter extends TypeAdapter<List<PathTaken>> {
    @Override
    public void write(JsonWriter out, List<PathTaken> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<PathTaken> read(JsonReader in) throws IOException {
        List<PathTaken> result = new ArrayList<>();
        PathTaken pathTaken;
        int index = 1;

        in.beginArray();
        while (in.hasNext()) {
            pathTaken = new PathTaken();
            pathTaken.setFloor(index++);
            pathTaken.setPath(in.nextString());
            result.add(pathTaken);
        }
        in.endArray();

        return result;
    }
}
