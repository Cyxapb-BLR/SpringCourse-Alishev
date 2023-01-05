package com.matskevich.newspringcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private List<String> musicList = new ArrayList<String>();

    {
        musicList.add("Mozart – Eine kleine Nachtmusik");
        musicList.add("Beethoven – Für Elise");
        musicList.add("J.S. Bach – Toccata and Fugue in D minor");
    }

    public List<String> getSong() {
        return musicList;
    }
}
