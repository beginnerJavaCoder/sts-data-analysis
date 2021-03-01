package com.example.model.deserialization;

import com.example.model.BossRelic;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BossRelicTypeAdapter extends TypeAdapter<List<BossRelic>> {
    @Override
    public void write(JsonWriter out, List<BossRelic> value) throws IOException {
        //I don't need you!
    }

    @Override
    public List<BossRelic> read(JsonReader in) throws IOException {
        List<BossRelic> result = new ArrayList<>();
        BossRelic bossRelic;
        int numberOfChoice = 1;

        in.beginArray();
        while (in.hasNext()) {
            in.beginObject();
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "not_picked": {
                        in.beginArray();
                        while (in.hasNext()) {
                            bossRelic = new BossRelic();
                            bossRelic.setRelic(in.nextString());
                            bossRelic.setPicked(false);
                            bossRelic.setNumberOfChoice(numberOfChoice);
                            result.add(bossRelic);
                        }
                        in.endArray();
                        break;
                    }
                    case "picked": {
                        bossRelic = new BossRelic();
                        bossRelic.setRelic(in.nextString());
                        bossRelic.setPicked(true);
                        bossRelic.setNumberOfChoice(numberOfChoice);
                        result.add(bossRelic);
                        break;
                    }
                }
            }
            in.endObject();
            numberOfChoice++;
        }
        in.endArray();

        return result;
    }
}
