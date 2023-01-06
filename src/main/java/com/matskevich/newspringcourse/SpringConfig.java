package com.matskevich.newspringcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.matskevich.newspringcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
