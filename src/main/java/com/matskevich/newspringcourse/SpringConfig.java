package com.matskevich.newspringcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public List<Music> musicGenreList() {
        List<Music> musicList = new ArrayList<Music>();
        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        musicList.add(rapMusic());
        return musicList;
    }

    @Bean
    MusicPlayer musicPlayer() {
        return new MusicPlayer(musicGenreList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
