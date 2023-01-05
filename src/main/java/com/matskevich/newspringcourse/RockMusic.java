package com.matskevich.newspringcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private List<String> musicList = new ArrayList<String>();

    {
        musicList.add("Foo Fighters - Everlong");
        musicList.add("Nirvana - Something In The Way");
        musicList.add("LINKIN_PARK - In the End");
    }

    public List<String> getSong() {
        return musicList;
    }
}
