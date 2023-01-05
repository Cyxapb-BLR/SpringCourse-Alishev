package com.matskevich.newspringcourse;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music{
    public String getSong() {
        return "Wind cries Mary";
    }
}
