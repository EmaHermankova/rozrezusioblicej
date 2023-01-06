package org.example;

import java.io.Serializable;
public class Kocka extends Zvire implements Serializable {
    int pocetzivotu;

    public Kocka(String jmeno, int pocetzivotu) {
        super(jmeno);
        this.pocetzivotu = pocetzivotu;
    }

    @Override
    public String toString() {
        return "kocka" + jmeno + ", pocet zivotu - " + pocetzivotu;
    }
}
