package com.matskevich.newspringcourse;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    List<String> musicList;

    public ClassicalMusic(List<String> musicList) {
        this.musicList = musicList;
        musicList.add("Mozart – Eine kleine Nachtmusik");
        musicList.add("Beethoven – Für Elise");
        musicList.add("J.S. Bach – Toccata and Fugue in D minor");
    }

    public String getSong() {
        Random random = new Random();
        return musicList.get(random.nextInt(3));
    }
}
