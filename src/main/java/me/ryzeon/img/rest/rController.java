package me.ryzeon.img.rest;

import me.ryzeon.img.rImgServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 12:49
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

@RestController
public class rController {

    @GetMapping("/")
    public String index() {
        rImgServer.logger("INDEX P");
        return "index";
    }
}
