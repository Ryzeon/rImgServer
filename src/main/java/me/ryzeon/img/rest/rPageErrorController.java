package me.ryzeon.img.rest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 14:56
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

public class rPageErrorController implements ErrorController {

    @RestController
    

    @Override
    public String getErrorPath() {
        return null;
    }
}
