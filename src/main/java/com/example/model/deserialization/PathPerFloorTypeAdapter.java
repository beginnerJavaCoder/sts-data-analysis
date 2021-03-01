package com.example.model.deserialization;

import com.example.model.PathPerFloor;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PathPerFloorTypeAdapter extends TypeAdapter<List<PathPerFloor>> {
    @Override
    public void write(JsonWriter out, List<PathPerFloor> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<PathPerFloor> read(JsonReader in) throws IOException {
        List<PathPerFloor> result = new ArrayList<>();
        PathPerFloor pathPerFloor;
        int index = 1;

        in.beginArray();
        while (in.hasNext()) {
            pathPerFloor = new PathPerFloor();
            pathPerFloor.setFloor(index++);
            switch (in.peek()) {
                case NULL: {
                    in.nextNull();
                    pathPerFloor.setPath(null);
                    break;
                }
                case STRING: {
                    pathPerFloor.setPath(in.nextString());
                    break;
                }
            }
            result.add(pathPerFloor);
        }
        in.endArray();

        return result;
    }
}
