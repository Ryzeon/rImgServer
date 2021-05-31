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

@RestController
public class ServerIndexController {

    @GetMapping(value = "/")
    public String index() {
        System.out.println("index pe xd");
        return "KAJAAJ TU MAMA ES PUTA XD";
    }

    @GetMapping(value = "/a")
    public String indexa() {
        System.out.println("index pe xd");
        return "KAJAAJ TU MAMA ES PUTA XD";
    }
}
