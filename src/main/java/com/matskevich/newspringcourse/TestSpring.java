package com.matskevich.newspringcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music musicBean = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        musicPlayer.playMusic();

        context.close();
    }
}
