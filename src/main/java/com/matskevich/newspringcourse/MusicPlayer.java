package com.matskevich.newspringcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicalGenre musicalGenre) {
        if (musicalGenre.equals(MusicalGenre.CLASSICAL)) {
            return "Playing: " + music1.getSong();
        }
        if (musicalGenre.equals(MusicalGenre.ROCK)) {
            return "Playing: " + music2.getSong();
        }
        return "music not found";
    }
}
