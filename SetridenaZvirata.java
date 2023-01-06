package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SetridenaZvirata {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("data.dat");
        ObjectInputStream in = new ObjectInputStream(f);
        ArrayList<Zvire> zvirata = (ArrayList<Zvire>) in.readObject();

        System.out.println(zvirata);
    }
}
