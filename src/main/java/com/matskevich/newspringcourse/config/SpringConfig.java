package com.matskevich.newspringcourse.config;

import com.matskevich.newspringcourse.*;
import com.matskevich.newspringcourse.genres.ClassicalMusic;
import com.matskevich.newspringcourse.genres.RapMusic;
import com.matskevich.newspringcourse.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
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
        return Arrays.asList(classicalMusic(), rockMusic(), rapMusic());
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
