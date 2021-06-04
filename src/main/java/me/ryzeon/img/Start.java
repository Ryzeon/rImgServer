package me.ryzeon.img;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 12:42
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

/**
 * Credits: https://github.com/Noah1069/ImageWebServer
 * Recoded on java.
 */

@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        System.getProperties().put("server.port", Lang.PORT.getValue());
        SpringApplication.run(Start.class, args);

        ImgServer.getInstance().start();
        ImgServer.logger("Img Server started on http://localhost:" + Lang.PORT.getValue());
    }
}
