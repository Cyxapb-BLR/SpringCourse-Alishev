package com.matskevich.newspringcourse;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    private List<String> musicList = new ArrayList<String>();

    {
        musicList.add("50 Cent");
        musicList.add("Noize MC");
        musicList.add("Oxxxymiron");
    }

    public List<String> getSong() {
        return musicList;
    }
}
