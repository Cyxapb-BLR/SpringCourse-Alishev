package com.matskevich.newspringcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    //без @Qualifier будет ошибка, т.к. spring не понимает, какой бин создавать rockMusic or classicalMusic
    private Music music;

    public String playMusic() {
        return "Playing: " + music.getSong();
    }
}
