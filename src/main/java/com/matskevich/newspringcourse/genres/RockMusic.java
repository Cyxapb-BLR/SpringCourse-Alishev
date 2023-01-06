package com.matskevich.newspringcourse.genres;

import com.matskevich.newspringcourse.Music;
import org.springframework.stereotype.Component;

public class RockMusic implements Music {
    public String getSong() {
        return "Wind cries Mary";
    }
}
