package pl.edu.pk.jp.samplemavenproject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] argv){
                ArrayList<Animals> animal = new ArrayList<Animals>();
                animal.add(new Dog());
                animal.add(new Cat());
                for (Animals x: animal)
                    x.glos();
            }
        }


