package me.ryzeon.img.rest;

import com.google.gson.JsonObject;
import me.ryzeon.img.Lang;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;


/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 12:49
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

@Controller
public class rController {

    private final Random random = new Random();

    private int getRandomId() {
        return random.nextInt(848484);
    }

    public File crateImgFile(String fileName) {
        File file = new File("img/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ResponseEntity<?> upload(HttpServletRequest request) {
        System.out.println("GAAAAAA");
        String key = request.getHeader("key");
        if (!key.equals(Lang.API_KEY.getValue())) {
            return new ResponseEntity<>("Invalid Key", HttpStatus.BAD_REQUEST);
        }
        String filename = "";
        try {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            Iterator<String> it = multipartRequest.getFileNames();
            MultipartFile multipart = multipartRequest.getFile(it.next());
            String fileName = request.getHeader("name").replace(".png", "");
            fileName = fileName + getRandomId() + ".png";

            byte[] bytes = multipart.getBytes();
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(crateImgFile(fileName)));
            stream.write(bytes);
            stream.close();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("url", Lang.DOMAIN.getValue() + "/img/" + fileName);
            System.out.println("RESPONDIENDO XD");
            return new ResponseEntity<>(jsonObject.toString(), HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error to upload file", HttpStatus.BAD_REQUEST);
        }
    }
}
