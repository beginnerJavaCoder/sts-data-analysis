package com.example;

import com.example.model.upgraded.Run;
import com.example.model.upgraded.deserialization.*;
import com.example.repository.RunRepository;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class EntryPoint {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Example of using util: java -jar pvs-free-util.jar d:\\project_directory");
            return;
        }

        File root = new File(args[0]);

        if (!root.exists()) {
            System.out.printf("Directory on path '%s' doesn't exist!%n", root.getAbsolutePath());
            return;
        }

        if (root.isFile()) {
            System.out.println("You should choose directory - not single file!");
            return;
        }

        ApplicationContext context = SpringApplication.run(EntryPoint.class, args);

        initGson();
        RunRepository runRepository = context.getBean(RunRepository.class);
        List<Run> runs;
        int totalRunsSaved = 0;
        int currentFileIndex = 0;
        int filesPrepared = root.listFiles().length;

        System.out.printf("Preparing for parsing %d files...\n", filesPrepared);
        System.out.println();
        System.out.println();


        long totalStart = new Date().getTime();
        for (File json : root.listFiles()) {
            try {
                long start = new Date().getTime();
                runs = parseJson(json);
                saveToDatabase(runs, runRepository);
                totalRunsSaved += runs.size();
                long finish = new Date().getTime() - start;

                System.out.printf("%d/%d file parsed\n", ++currentFileIndex, filesPrepared);
                System.out.printf("%d runs saved from %s for %s\n", runs.size(), json.getName(), getTimeString(finish));
            } catch (FileNotFoundException e) {
                System.out.printf("File %s not found!\n", json.getName());
            }
        }
        long totalFinish = new Date().getTime() - totalStart;
        System.out.println("\n");
        System.out.printf("Finished in %s, %d runs saved.\n", getTimeString(totalFinish), totalRunsSaved);

        System.exit(SpringApplication.exit(context));
    }

    private static void initGson() {
        ConstUtil.GSON = new GsonBuilder()
                .registerTypeAdapter(Run.class, new RunTypeAdapter())
                .registerTypeAdapter(ConstUtil.CAMPFIRE_CHOICES_TYPE_TOKEN.getType(), new CampfireChoicesTypeAdapter())
                .registerTypeAdapter(ConstUtil.MASTER_DECKS_TYPE_TOKEN.getType(), new MasterDecksTypeAdapter())
                .registerTypeAdapter(ConstUtil.RELICS_TYPE_TOKEN.getType(), new RelicsTypeAdapter())
                .registerTypeAdapter(ConstUtil.TAKEN_DAMAGES_TYPE_TOKEN.getType(), new TakenDamagesTypeAdapter())
                .registerTypeAdapter(ConstUtil.POTIONS_USAGE_FLOORS_TYPE_TOKEN.getType(), new PotionsUsageFloorsTypeAdapter())
                .registerTypeAdapter(ConstUtil.POTIONS_OBTAINEDS_TYPE_TOKEN.getType(), new PotionsObtainedsTypeAdapter())
                .registerTypeAdapter(ConstUtil.ITEMS_PURCHASEDS_TYPE_TOKEN.getType(), new ItemsPurchasedsTypeAdapter())
                .registerTypeAdapter(ConstUtil.ITEMS_PURCHASEDS_FLOORS_TYPE_TOKEN.getType(), new ItemsPurchasedsFloorsTypeAdapter())
                .registerTypeAdapter(ConstUtil.TAKEN_PATHS_TYPE_TOKEN.getType(), new TakenPathsTypeAdapter())
                .registerTypeAdapter(ConstUtil.PATH_PER_FLOORS_TYPE_TOKEN.getType(), new PathPerFloorsTypeAdapter())
                .registerTypeAdapter(ConstUtil.CURRENT_HP_PER_FLOOR_TYPE_TOKEN.getType(), new CurrentHpPerFloorTypeAdapter())
                .registerTypeAdapter(ConstUtil.MAX_HP_PER_FLOOR_TYPE_TOKEN.getType(), new MaxHpPerFloorTypeAdapter())
                .registerTypeAdapter(ConstUtil.POTIONS_FLOOR_SPAWNED_TYPE_TOKEN.getType(), new PotionsFloorSpawnedTypeAdapter())
                .registerTypeAdapter(ConstUtil.RELICS_OBTAINED_TYPE_TOKEN.getType(), new RelicsObtainedTypeAdapter())
                .registerTypeAdapter(ConstUtil.CARD_CHOICES_TYPE_TOKEN.getType(), new CardChoicesTypeAdapter())
                .registerTypeAdapter(ConstUtil.BOSS_RELICS_TYPE_TOKEN.getType(), new BossRelicsTypeAdapter())
                .registerTypeAdapter(ConstUtil.ITEMS_PURGED_TYPE_TOKEN.getType(), new ItemsPurgedTypeAdapter())
                .registerTypeAdapter(ConstUtil.ITEMS_PURGED_FLOORS_TYPE_TOKEN.getType(), new ItemsPurgedFloorsTypeAdapter())
                .registerTypeAdapter(ConstUtil.GOLD_PER_FLOOR_TYPE_TOKEN.getType(), new GoldPerFloorTypeAdapter())
                .registerTypeAdapter(ConstUtil.EVENT_CHOICES_TYPE_TOKEN.getType(), new EventChoicesTypeAdapter())
                .create();
    }

    private static List<Run> parseJson(File json) throws FileNotFoundException {
        Reader reader = new FileReader(json);

        return ConstUtil.GSON.fromJson(reader, new TypeToken<List<Run>>(){}.getType());
    }

    private static void saveToDatabase(List<Run> runs, RunRepository repository) {
        repository.saveAll(runs);
    }

    private static String getTimeString(long timeInMilliseconds) {
        StringBuilder stringBuilder = new StringBuilder();
        long hours = timeInMilliseconds / 3600000;
        if (hours != 0) {
            stringBuilder.append(hours).append("h");
            timeInMilliseconds -= hours * 3600000;
        }
        long minutes = timeInMilliseconds / 60000;
        if (minutes != 0) {
            if (minutes < 10) {
                stringBuilder.append(0);
            }
            stringBuilder.append(minutes).append("m");
            timeInMilliseconds -= minutes * 60000;
        } else {
            stringBuilder.append("00m");
        }
        long seconds = timeInMilliseconds / 1000;
        if (seconds != 0) {
            if (seconds < 10) {
                stringBuilder.append(0);
            }
            stringBuilder.append(seconds).append("s");
        } else {
            stringBuilder.append("00s");
        }

        return stringBuilder.toString();
    }
}
