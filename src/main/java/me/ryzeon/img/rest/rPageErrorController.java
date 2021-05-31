package me.ryzeon.img.rest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 14:56
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

@Controller
public class rPageErrorController implements ErrorController {

    @RequestMapping("/404")
    public String handleError() {
        return "error/404";
    }

    @Override
    public String getErrorPath() {
        return "GAAAAAAAAA";
    }
}
