package me.ryzeon.img.rest;

import me.ryzeon.img.Lang;
import me.ryzeon.img.image.ImageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.File;

/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 18:01
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

@Controller
public class ImageViewController {

    @GetMapping("/img/{imageName}")
    public String rImageViewer(@PathVariable String imageName, Model model) {
        if (imageName == null) {
            return "error/404";
        }
        model.addAttribute("pageTitle", Lang.TITLE.getValue());
        model.addAttribute("description", Lang.DESCRIPTION.getValue());
        model.addAttribute("color", Lang.COLOR.getValue());
        model.addAttribute("pageDomain", Lang.DOMAIN.getValue());
        File file = ImageHelper.findImageByName(imageName);
        if (file == null) {
            model.addAttribute("name", imageName);
            return "view/noImage";
        }
        model.addAttribute("imageSrc", ImageHelper.getModifiPath(file));
        return "view/imageview";
    }
}
