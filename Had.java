package org.example;

import java.io.Serializable;
public class Had extends Zvire {
    int delka;

    public Had(String jmeno, int delka) {
        super(jmeno);
        this.delka = delka;
    }

    @Override
    public String toString() {
        return "had" + jmeno + ", delka - " + delka;
    }
}
