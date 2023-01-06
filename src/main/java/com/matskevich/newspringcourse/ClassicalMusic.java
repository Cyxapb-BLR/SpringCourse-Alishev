package com.matskevich.newspringcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
    @PostConstruct      // init method
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy         // destroy method
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
