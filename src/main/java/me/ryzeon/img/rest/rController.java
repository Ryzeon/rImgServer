package me.ryzeon.img.rest;

import me.ryzeon.img.Lang;
import me.ryzeon.img.rImgServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


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
    public String index(Model model) {
        rImgServer.logger("INDEX P");
        model.addAttribute("pageTitle", Lang.TITLE.getValue());
        System.out.println(model);
        return "index";
    }
}
