package me.ryzeon.img;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

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

    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        loggingFilter.setIncludeClientInfo(true);
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        loggingFilter.setMaxPayloadLength(64000);
        return loggingFilter;
    }

    public static void main(String[] args) {
        System.getProperties().put("server.port", Lang.PORT.getValue());
        SpringApplication.run(Start.class, args);

        rImgServer.getInstance().start();
        rImgServer.logger("Img Server started on http://localhost:" + Lang.PORT.getValue());
    }
}
