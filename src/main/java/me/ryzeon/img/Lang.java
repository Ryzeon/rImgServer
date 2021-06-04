package me.ryzeon.img;

import lombok.Getter;

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
 //   DOMAIN("the-best-peruvian-is.ryzeon.me"),
    DOMAIN("http://the-best-peruvian-is.ryzeon.me"),
    DESCRIPTION("#GAAAAA ARMY"),
    COLOR("#00FFAA"),
   // PORT("7462");
    PORT("80");

    @Getter
    private final String value;

    @ConstructorProperties({"value"})
    Lang(String value) {
        this.value = value;
    }
}
