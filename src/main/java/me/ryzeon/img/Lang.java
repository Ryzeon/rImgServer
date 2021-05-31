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
    DOMAIN("localhost:6565"),
    DESCRIPTION("#GAAAAA ARMY"),
    COLOR("#00FFAA"),
    PORT("5656");

    @Getter
    private final String value;

    @ConstructorProperties({"value"})
    Lang(String value) {
        this.value = value;
    }
}
