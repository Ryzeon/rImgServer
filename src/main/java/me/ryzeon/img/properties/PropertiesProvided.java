package me.ryzeon.img.properties;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import me.ryzeon.img.Lang;

import static me.ryzeon.img.ImgServer.logger;

/**
 * Created by Ryzeon Project: rImgServer Date: 04/06/2021 @ 12:08
 * Twitter: @Ryzeon_ 😎 Github: github.ryzeon.me
 */

public class PropertiesProvided {

    private static Properties prop = null;

    public static void init() {
        prop = new Properties();
        File file = new File("imageserver.properties");
        if (!file.exists()) {
            logger("imageserver.properties doesn't exits, create new!");
            for (Lang lang : Lang.values()) {
                prop.setProperty(lang.name().toLowerCase(), lang.getDefaultValue());
            }
            try {
                prop.store(new FileWriter("imageserver.properties"), "rImgServer Properties");
            } catch (IOException e) {
                logger("Error on save imageserver.properties");
                e.printStackTrace();
            }
        } else {
            try (FileReader reader = new FileReader("imageserver.properties")) {
                logger("Loading imageserver.properties");
                prop.load(reader);
            } catch (Exception e) {
                logger("Error on load imageserver.properties");
                e.printStackTrace();
            }
        }
    }

    public static String getValue(String key) {
        if (prop == null)
            return "NoPropFile";

        return prop.getProperty(key, "NO-VALUE");
    }
}
