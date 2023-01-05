package com.matskevich.newspringcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        ClassicalMusic musicBean = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(musicBean.getSong());


        context.close();
    }
}
