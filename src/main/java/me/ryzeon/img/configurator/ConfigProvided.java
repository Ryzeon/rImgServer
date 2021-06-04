package me.ryzeon.img.configurator;

import me.ryzeon.img.image.ImageHelper;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 20:01
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */

@Configuration
public class ConfigProvided implements WebMvcConfigurer {

    String myExternalFilePath = "file:" + ImageHelper.getRelativePart(); // end your path with a /

    /**
     *
     * @apiNote  some shit to enable access {@link ImageHelper}
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/cache/**").addResourceLocations(myExternalFilePath);
    }
}
