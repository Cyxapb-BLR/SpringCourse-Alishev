package com.matskevich.newspringcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> musicList;

    public RockMusic(List<String> musicList) {
        this.musicList = musicList;
        musicList.add("Foo Fighters - Everlong");
        musicList.add("Nirvana - Something In The Way");
        musicList.add("LINKIN_PARK - In the End");
    }

    public String getSong() {
        return musicList.get(1);
    }
}
