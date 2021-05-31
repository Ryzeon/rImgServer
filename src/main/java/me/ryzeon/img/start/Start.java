package me.ryzeon.img.start;

import me.ryzeon.img.rImgServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 12:42
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        System.getProperties().put("server.port", "6565");
        SpringApplication.run(Start.class, args);

        rImgServer.getInstance().start();
    }
}
