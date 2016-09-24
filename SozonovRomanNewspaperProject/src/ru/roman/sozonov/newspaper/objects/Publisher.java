package ru.roman.sozonov.newspaper.objects;

import java.io.Serializable;

/**
 * Created by Roman on 9/24/2016.
 */
public class Publisher implements Serializable {

    private String name;

    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
