package me.ryzeon.img;

import java.io.File;

import me.ryzeon.img.image.ImageHelper;

/**
 * Created by Ryzeon Project: rImgServer Date: 31/05/2021 @ 12:42
 * Twitter: @Ryzeon_ 😎 Github: github.ryzeon.me
 */

public class rImgServer {

    private static rImgServer instance;

    public rImgServer() {
        instance = this;
    }

    @Deprecated
    public void start() {
        logger("Checking if cache/ folder exits!");
        if (!ImageHelper.checkCacheFolder()) {
            logger("Cache folder doesn't exits, creating cache folder...");
        }
    }

    /**
     *
     * @param message {@link String}
     * @apiNote #Logger msg
     */
    public static void logger(String message) {
        System.out.println("[rImgServer] " + message);
    }

    public static rImgServer getInstance() {
        if (instance == null)
            new rImgServer();

        return instance;
    }
}
