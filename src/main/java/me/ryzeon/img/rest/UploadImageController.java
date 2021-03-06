package me.ryzeon.img.rest;

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
import java.io.FileOutputStream;
import java.util.Iterator;

import static me.ryzeon.img.image.ImageHelper.createImgFile;
import static me.ryzeon.img.image.ImageHelper.getRandomId;

/**
 * Created by Ryzeon Project: rImgServer Date: 31/05/2021 @ 12:49
 * Twitter: @Ryzeon_ 😎 Github: github.ryzeon.me
 */

@Controller
public class UploadImageController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ResponseEntity<?> upload(HttpServletRequest request) {
        String key = request.getHeader("key");
        if (!key.equals(Lang.API_KEY.getValue())) {
            return new ResponseEntity<>("Invalid Key", HttpStatus.BAD_REQUEST);
        }
        try {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            Iterator<String> it = multipartRequest.getFileNames();
            MultipartFile multipart = multipartRequest.getFile(it.next());
            if (multipart == null) {
                return new ResponseEntity<>("MultipartFile is null", HttpStatus.BAD_REQUEST);
            }

            long fileSize = (long) (multipart.getSize() * 0.00000095367432);
            if (fileSize > 30.75) { // Here max file size, in this case 30MB
                return new ResponseEntity<>("Max File Size Reached", HttpStatus.BAD_REQUEST);
            }
            String fileName = request.getHeader("name").replace(".png", "");
            fileName = fileName + getRandomId() + ".png";
            byte[] bytes = multipart.getBytes();

            try (BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(createImgFile(fileName)))) {
                stream.write(bytes);
            } catch (Exception e) {
                return new ResponseEntity<>("Error to upload file", HttpStatus.BAD_REQUEST);
            }

            String url = Lang.DOMAIN.getValue() + "/img/" + fileName.replace(".png", "");
            return new ResponseEntity<>(url, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error to upload file", HttpStatus.BAD_REQUEST);
        }
    }
}
