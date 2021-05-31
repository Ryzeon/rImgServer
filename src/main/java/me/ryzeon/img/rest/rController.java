package me.ryzeon.img.rest;

import me.ryzeon.img.rImgServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 12:49
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

@Controller
public class rController {

    @GetMapping("/")
    public String index() {
        rImgServer.logger("INDEX P");
        return "ola";
    }
}
