package me.ryzeon.img.rest;

import me.ryzeon.img.Lang;
import me.ryzeon.img.rImgServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    /**
     * @param model set a model to can be use html template
     * @return index.html
     */
    @GetMapping("/")
    public String index(Model model) {
        rImgServer.logger("INDEX P");
        model.addAttribute("pageTitle", Lang.TITLE.getValue());
        model.addAttribute("description", Lang.DESCRIPTION.getValue());
        model.addAttribute("color", Lang.COLOR.getValue());
        model.addAttribute("pageDomain", Lang.DOMAIN.getValue());
        System.out.println(model);
        return "index";
    }
}
