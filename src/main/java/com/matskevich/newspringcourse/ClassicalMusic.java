package com.matskevich.newspringcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
