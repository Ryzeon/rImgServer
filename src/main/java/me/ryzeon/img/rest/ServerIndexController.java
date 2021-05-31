package me.ryzeon.img.rest;

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
public class ServerIndexController {

    @GetMapping("/")
    public String index() {
        System.out.println("index pe xd");
        return "KAJAAJ TU MAMA ES PUTA XD";
    }
}
