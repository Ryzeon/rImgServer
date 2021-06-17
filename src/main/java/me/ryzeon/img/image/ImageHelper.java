package me.ryzeon.img.image;

import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Ryzeon Project: rImgServer Date: 31/05/2021 @ 15:01
 * Twitter: @Ryzeon_ 😎 Github: github.ryzeon.me
 */

@SuppressWarnings("all")
public class ImageHelper {

    private static final Random random = new Random();

    public static boolean checkCacheFolder() {
        File cacheFolder = new File("cache/");
        if (!cacheFolder.exists()) {
            cacheFolder.mkdirs();
            return false;
        }
        return true;
    }

    public static String getModifiPath(File file) {
        return "/cache/" + file.getName();
    }

    public static int getRandomId() {
        return random.nextInt(848484);
    }

    public static String getRelativePart() {
        File imagesFiles = new File("cache/");
        String finalRelativePath = StringUtils.cleanPath(imagesFiles.getAbsolutePath());
        return finalRelativePath + "/";
    }

    public static File findImageByName(String fileName) {
        checkCacheFolder();
        File file = new File("cache/" + fileName + ".png");
        if (file.exists()) return file;
        return null;
//        checkCacheFolder();
//        File imagesFiles = new File("cache/");
//        for (File file : imagesFiles.getAbsoluteFile().listFiles()) {
//            if (!file.getName().contains(".png"))
//                continue;
//            String name = file.getName().replace(".png", "");
//            if (name.equals(fileName))
//                return file;
//        }
//        return null;
    }

    public static File createImgFile(String fileName) {
        checkCacheFolder();
        File file = new File("cache/" + fileName);
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
