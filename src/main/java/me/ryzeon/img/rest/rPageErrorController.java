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

    @RequestMapping("/error")
    public String handleError() {
        return "EROR PE CONCHATUMADCRE";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
