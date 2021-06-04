package me.ryzeon.img;

import lombok.Getter;
import lombok.val;
import me.ryzeon.img.properties.PropertiesProvided;

import java.beans.ConstructorProperties;

/**
 * Created by Ryzeon
 * Project: rImgServer
 * Date: 31/05/2021 @ 12:53
 * Twitter: @Ryzeon_ 😎
 * Github:  github.ryzeon.me
 */
public enum Lang {

    API_KEY("FNZ3vLRarM7HVmzrbQRwSDSGAAAAAAAAAAA"),
    TITLE("Ryzeon's Private Image Server \uD83E\uDD75 \uD83E\uDD75"),
    DOMAIN("http://the-best-peruvian-is.ryzeon.me"),
    DESCRIPTION("#GAAA Army"),
    COLOR("#00FFAA"),
    PORT("7462");

    @Getter
    private final String defaultValue;

    /**
     * 
     * @return a {@link String} provided by {@link Properties}
     */
    public String getValue() {
        return PropertiesProvided.getValue(this.name().toLowerCase());
    }

    @ConstructorProperties({"defaultValue"})
    Lang(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}
