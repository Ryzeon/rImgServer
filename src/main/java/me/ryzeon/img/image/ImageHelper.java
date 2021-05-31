package me.ryzeon.img.image;

import java.io.File;
import java.io.IOException;
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
    public static int getRandomId() {
        return random.nextInt(848484);
    }

    public  static File crateImgFile(String fileName) {
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
