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

    TITLE(""),
    PORT("5656")
    ;

    @Getter
    private final String value;

    @ConstructorProperties({"value"})
    Lang(String value){
        this.value = value;
    }
}
