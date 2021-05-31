package me.ryzeon.img.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 12:49
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

@RestController
public class rController {

    @PostMapping("/upload")
    public String upload(HttpServletRequest request) {
        System.out.println("REQUEST :V");
        System.out.println(request);
        return "NOSE K PONER CA PE XD";
    }
}
