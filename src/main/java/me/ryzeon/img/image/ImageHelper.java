package me.ryzeon.img.image;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 15:01
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

@SuppressWarnings("all")
public class ImageHelper {

    private static final Random random = new Random();

    private static String path() {
        Path path = Paths.get(".");
        Path abosoultePath = path.toAbsolutePath();
        return abosoultePath  + "/src/main/reources"
    }

    public static int getRandomId() {
        return random.nextInt(848484);
    }

    public static File findImageByName(String fileName) {
        File imagesFiles = new File("img/");
        for (File file : imagesFiles.getAbsoluteFile().listFiles()) {
            if (!file.getName().contains(".png")) continue;
            String name = file.getName().replace(".png", "");
            if (name.equals(fileName)) return file;
        }
        return null;
    }

    public static File crateImgFile(String fileName) {
        File file = new File("img/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }
}
