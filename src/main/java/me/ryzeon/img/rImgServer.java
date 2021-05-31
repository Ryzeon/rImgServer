package me.ryzeon.img;

/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 12:42
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

public class rImgServer {

    private static rImgServer instance;

    public rImgServer() {
        instance = this;
    }

    @Deprecated
    public void start() {

    }


    public static void logger(String message) {

    }

    public static rImgServer getInstance() {
        if (instance == null) new rImgServer();

        return instance;
    }
}
