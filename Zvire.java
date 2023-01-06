package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;
public class Zvire implements Serializable, Comparable<Zvire> {
    String jmeno;

    public Zvire(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return "Zvire" + jmeno;
    }

    public static String nahodneJmeno() {
        byte[] array = new byte[5];
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Zvire> brr = new ArrayList<>();

        for(int i = 0; i<10; i++){
            brr.add(new Had(nahodneJmeno(), 10));
            brr.add(new Kocka(nahodneJmeno(),9));
        }
        FileOutputStream f = new FileOutputStream("data.dat");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(brr);
        out.close();

        System.out.println(brr);
    }

    @Override
    public int compareTo(Zvire o) {
        return jmeno.compareTo(o.jmeno);
    }
}